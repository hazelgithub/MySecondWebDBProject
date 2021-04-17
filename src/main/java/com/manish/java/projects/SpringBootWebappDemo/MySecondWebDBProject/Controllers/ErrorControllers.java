package com.manish.java.projects.SpringBootWebappDemo.MySecondWebDBProject.Controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorControllers implements ErrorController

{
	@RequestMapping("/error")
	public String error()
	{
		return "error.jsp" ; 
	}

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}

}
