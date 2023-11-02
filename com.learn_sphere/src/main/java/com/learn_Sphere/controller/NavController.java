package com.learn_Sphere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


	@Controller
	public class NavController {
		@GetMapping("/")
		public String index()
		{
			return "index";
		}
		
		@GetMapping("/login")
		public String login()
		{
			return "login";
		}
		
		@GetMapping("/register")
		
		public String register()
		{
			return "register";
		}
		
		@GetMapping("/home")
		public String home()
		{
			return "home";
		}
	
		@GetMapping("/createCourse")
		public String createCourse()
		{
			return "createCourse";
		}
		
		@GetMapping("/addLesson")
		public String addLesson ()
		{
			return "addLesson";
		}
		@GetMapping("/trainerHome")
		public String trainerHome()
		{
			return "trainerHome";
		}
		@GetMapping("/studentHome")
		public String studentHome()
		{
			return "studentHome";
		}
		@GetMapping("/courses")
		public String courses()
		{
			return "courses";
		}
		
		@GetMapping("/purchase")
		public String purchase()
		{
			return "purchase";
		}

		
		@GetMapping("/myCourse")
		public String myCourse()
		{
			return "myCourse";
		}

//		@GetMapping("/myLesson")
//		public String myLesson ()
//		{
//			return "myLesson";
//		}
		
		@GetMapping("/demoLesson")
		public String demoLesson ()
		{
			return "demoLesson";
		}
}
