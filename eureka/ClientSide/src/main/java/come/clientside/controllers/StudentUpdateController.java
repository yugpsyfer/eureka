package come.clientside.controllers;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import come.clientside.models.Student;


@Controller
public class StudentUpdateController {
	
	private String URL = "http://localhost:9000/student/120";
	
	@Autowired
	private RestTemplate rest;
	
	
	@Autowired
	private ModelAndView mdlView;
	
	@ModelAttribute("sectionList")
	public String[] sections() {
		
		return new String[] {"A","B","C","D"};
	}
	
	@RequestMapping("/updateStudentData")
	public ModelAndView this1() {
		Student student = rest.getForObject(URL, Student.class);
		
		mdlView.setViewName("updateStudent");
		mdlView.addObject("command",student);
		return mdlView;
	}
	
	

	
	
	@PostMapping("/udpdateStudentData")
	public String onUpdate(@Valid @ModelAttribute("command") Student student, BindingResult result) {
		
		String nextPage = "Home";
		
		System.out.println(student.getFatherName());
			if(!result.hasErrors()) {
			
			nextPage = "success"; 
			
			try {
			
				this.rest.patchForObject(this.URL,student, Student.class);
			
			}
			catch(Exception e)
			{
				nextPage="Home";
			}
			 
		}
			
			return nextPage;	
		
		
	}


}
