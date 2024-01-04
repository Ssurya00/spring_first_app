package com.spring.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		
		return new Student("Surya", "Singe");
		
	}
	
	//in order to get list of students 
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> stuidents = new ArrayList<>();
		stuidents.add(new Student("Surya", "Singe"));
		stuidents.add(new Student("Kavya", "Singe"));
		stuidents.add(new Student("Shivani", "Singe"));
		stuidents.add(new Student("Soundarya", "Singe"));
		return stuidents;
	}
	
	//in order to halndle pathvariables we use this rest api
	// localhost:6060/student/surya/singe
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariavle(@PathVariable("firstName") String firstName,
		@PathVariable("lastName")	String lastName) {
		return new Student(firstName,lastName);
	}
	
	//in order to handle query param request we need to use this api
	
	@GetMapping("/stud")
	public Student getQuerParam(
		@RequestParam(name="firstName")	String firstName,
		@RequestParam(name="lastName")   String lastName) {
		return new Student(firstName,lastName);
	}

}
