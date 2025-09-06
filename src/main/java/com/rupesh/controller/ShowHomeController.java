package com.rupesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//ShowHomeController.java
@Controller
public class ShowHomeController 
{
	/*
@RequestMapping("/home")
	public String showHomePage() {
		return "welcome";
		///IOC-Boot-MVC-Project-01-ShowingHomePage/src/main/webapp/WEB-INF/pages/welcome.jsp
	}*/
	
	//Without url
	@RequestMapping("/")
	public String showHomePage() {
		return "welcome";
		///IOC-Boot-MVC-Project-01-ShowingHomePage/src/main/webapp/WEB-INF/pages/welcome.jsp
	}
	
}
