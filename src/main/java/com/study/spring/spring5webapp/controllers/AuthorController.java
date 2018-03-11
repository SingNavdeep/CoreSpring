package com.study.spring.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.spring.spring5webapp.model.repositories.AuthorRepository;

@Controller
public class AuthorController
{
	private AuthorRepository aRepo;
	
	public AuthorController(AuthorRepository aRepo)
	{
		this.aRepo = aRepo;
	}
	
	@RequestMapping("/authors")
	public String getAuthors(Model model)
	{
		model.addAttribute("authors", aRepo.findAll());
		
		return "authors";
	}
}
