package com.crud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Student;
@RestController
@RequestMapping("/crud")
public class CrudController {
	@GetMapping(value="{kodId}")
	public Student getInfo(String kodId)
	{
		Student st = new Student("KODBAO081","deep","Aug");
		return st;
	}

}
