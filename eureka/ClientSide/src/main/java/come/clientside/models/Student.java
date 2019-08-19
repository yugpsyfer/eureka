package come.clientside.models;




import org.springframework.beans.factory.annotation.Autowired;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {


	private long studentId;
	private String studentName;
	private String section;
	private String fatherName;
	
	@Autowired
	private Address address;
}
