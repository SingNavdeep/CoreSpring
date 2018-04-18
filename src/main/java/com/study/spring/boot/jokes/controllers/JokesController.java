package com.study.spring.boot.jokes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.spring.boot.jokes.services.QuoteService;

/**
 * Spring MVC controller. 
 * @author Navdeep
 *
 */
@Controller
public class JokesController
{
	private QuoteService qs;
	
	//no need to have this annotation, as spring autowires
	//doing so makes code cleaner to read
	@Autowired
	public JokesController(QuoteService qs)
	{
		this.qs = qs;
	}
	
	/**
	 * 
	 * @param model, the object visible on html page
	 * @return
	 */
	@RequestMapping("/")
	public String getQuotes(Model model)
	{
		model.addAttribute("joke", qs.getQuote());
		
		//view name, html or jsp
		return "chucknorris";
	}
}
