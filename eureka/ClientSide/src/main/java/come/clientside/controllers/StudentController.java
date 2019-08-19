package come.clientside.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;



import come.clientside.models.Student;

@Controller
public class StudentController {
	
	private String URL = "http://localhost:9000/student";
	
	@Autowired
	private RestTemplate rest;
	
	
	@Autowired
	private Student student;
	
	@Autowired
	private ModelAndView mdlView;
	
	@ModelAttribute("sectionList")
	public String[] sections() {
		
		return new String[] {"A","B","C","D"};
	}
	
	
	@GetMapping("/addStudent")
	public ModelAndView initForm() {
		
		mdlView.setViewName("addStudent");
		mdlView.addObject("command",student);
		return mdlView;
		
	}

	
	
	@PostMapping("/addStudent")
	public String onSubmit(@Valid @ModelAttribute("command") Student student,BindingResult result) {
		
		String nextPage = "addStudent";
		System.out.println(result.hasErrors());
		
		
		if(!result.hasErrors()) {
			
			nextPage = "success"; 
			
			try {
			this.rest.postForObject(this.URL, student, Student.class);
			}
			catch(Exception e)
			{
				nextPage="addStudent";
			}
			 
		}
			
			return nextPage;		
		
	}
	
	

}
