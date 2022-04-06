package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.entites.LoginData;

@Controller 
public class MyController {
	@RequestMapping(value="/about",method=RequestMethod.GET)
 public String about(Model m)
 {
		m.addAttribute("name","Anurag Panwar");
	  System.out.println("about page running...");
	 return "about";
 }
	
	@GetMapping("/next")
	 public String next(Model m)
	 {
		 return "next";
	 }
	
	@GetMapping("/form")
	public String form(Model m)
	 {
		m.addAttribute("loginData",new LoginData());
		return "form";
	}
	@GetMapping("/process")
	public String processformm(@ModelAttribute("loginData") LoginData loginData)
	{
		System.out.println(loginData);
		return "success";
		
	}
}
