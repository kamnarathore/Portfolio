
package com.learn_Sphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learn_Sphere.entity.Users;
import com.learn_Sphere.entity.Comments;
import com.learn_Sphere.service.CommentService;
import com.learn_Sphere.service.UserService;

@Controller
public class ServiceController {
	@Autowired
	UserService uService;
	
	@Autowired
	CommentService cService;
	@PostMapping("/addUser")
	public String addUser(@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("role") String role)
	{
		boolean emailExists=uService.checkEmail(email);
		if(emailExists== false)
		{
		Users user = new Users();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setRole(role);
		uService.addUser(user);
		return"redirect:/login";
		}
		else
		{
			return "redirect:/register";
		}
	}
		
		@PostMapping("/validate")
		public String validate(
				@RequestParam("email") String email,
				@RequestParam("password") String password)
		{
			if(uService.checkEmail(email))
			{
			boolean val=uService.validate(email, password);
			if(val==true)
			{
				if(uService.getUserRole(email).equals("trainer"))
				{
				return "trainerHome";
				}
				else
				{
					return "studentHome";
				}
			}
			else
			{
				System.out.println("incorrect credential, try again");
				return "login";
			}
			}
			else
			{
				return "login";
			}
		}
				
	@PostMapping("/addComment")	
	public String comments(@RequestParam("comment") String comment,Model model)
	{
		Comments c=new Comments();
		c.setComment(comment);
		cService.addComment(c);
		List<Comments> commentList=cService.commentList();
		model.addAttribute("comment", commentList);
		return "redirect:/";
		
	}
			
	     

	

}
