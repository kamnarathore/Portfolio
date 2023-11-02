package com.learn_Sphere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learn_Sphere.entity.Lesson;
import com.learn_Sphere.service.StudentServices;

@Controller
public class StudentController {
	@Autowired
	StudentServices service;
	
@PostMapping("/goToLesson")
public String myLesson(@RequestParam("lessonId") int lessonId, Model model)
{
	Lesson lesson = service.getLesson(lessonId);
	model.addAttribute("lesson", lesson);
	System.out.println(lesson);
	return "myLesson";
}
}
