package com.sprhib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkController {

	
	@RequestMapping(value = "/")
	public ModelAndView mainPage() {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/index")
	public ModelAndView indexPage() {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/reg")
	public ModelAndView RegisterPage() {
		return new ModelAndView("reg");
	}
	@RequestMapping(value = "/login")
	public ModelAndView LoginPage()
	{
		return new ModelAndView("login");
	}
	
	@RequestMapping(value= "/home")
	public ModelAndView homePage()	
	{
		return new ModelAndView("home");
	}
}

