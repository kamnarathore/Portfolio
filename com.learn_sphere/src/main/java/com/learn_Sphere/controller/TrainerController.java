package com.learn_Sphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learn_Sphere.service.TrainerService;
import com.learn_Sphere.entity.Course;
import com.learn_Sphere.entity.Lesson;


@Controller
public class TrainerController {
	@Autowired
	TrainerService tService;
	@PostMapping("/addCourse")
	public String addCourse(@RequestParam("courseID") int courseID,
			@RequestParam ("courseName") String courseName,
			@RequestParam ("coursePrice") int coursePrice )
	{
		System.out.println(courseID+courseName+coursePrice);
		Course course= new Course();
		course.setCourseID(courseID);
		course.setCourseName(courseName);
		course.setCoursePrice(coursePrice);
		tService.addCourse(course);
		
		return "redirect:/";
	}
	
	@PostMapping("/lesson")
	public String lesson(@RequestParam("courseID") int courseID,
			@RequestParam("lessonId") int lessonId ,
			@RequestParam ("lessonName") String lessonName,
			@RequestParam ("topics") String topics,
			@RequestParam ("link") String link)
	{
		Course course=tService.getCourse(courseID);
		Lesson lesson= new Lesson(lessonId, lessonName, topics, link, course);
		tService.addLesson(lesson);
		course.getLessons().add(lesson);
		return "redirect:/";
	}
	
	@GetMapping("/showCourses")
	public String showCourses()
	{
		List<Course> courseList=tService.courseList();
		System.out.println(courseList);
		return"courses";
	}

}
