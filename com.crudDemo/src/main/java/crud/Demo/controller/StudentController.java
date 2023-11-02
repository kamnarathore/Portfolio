package crud.Demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crud.Demo.entities.Student;

@RestController
@RequestMapping("/stub")
public class StudentController {
	StudentService  ss;
	@PostMapping
	public String addStudent(@RequestBody Student st)
	{
		this.st=st;
		return "student added";
	}
	@GetMapping(value="{kodId}")
	public Student getStudent(String kodId)
	{
		return st;
	}
	@PutMapping
	public String updateStudent(@RequestBody Student st)
	{
		this.st=st;
		return "student updated";
	}
	@DeleteMapping(value="{kodId}")
	public String deleteStudent(String kodId)
	{
		this.st=null;
		return "student deleted";
	}

}
