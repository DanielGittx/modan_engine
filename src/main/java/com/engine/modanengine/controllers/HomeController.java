package com.engine.modanengine.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.Random;

@Controller
public class HomeController {
    
         

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelMap model) {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("title", "Home");
		return modelAndView;
               
               // return new ModelAndView("index","title","");
	}

}
