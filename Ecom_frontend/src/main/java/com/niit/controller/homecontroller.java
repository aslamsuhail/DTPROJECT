package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  
public class homecontroller
{
@RequestMapping(value="/")
public ModelAndView indexpage()
{
	ModelAndView mt=new ModelAndView("index");
	return mt;
}
@RequestMapping(value="/login")
public ModelAndView signin()
{
	ModelAndView lg=new ModelAndView("signin");
	return lg;
}
@RequestMapping(value="/reg")
public ModelAndView signup()
{
 ModelAndView sp=new ModelAndView("signup");
 return sp;
}
}
