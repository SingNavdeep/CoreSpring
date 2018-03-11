package com.study.spring.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.spring.spring5webapp.model.repositories.BookRepository;

@Controller
public class BookController
{
	//repository object to interact with a persistence store
	private BookRepository bRepo;
	
	//constructor to autowire book repository
	public BookController(BookRepository bRepo)
	{
		this.bRepo = bRepo;
	}
	
	@RequestMapping("/books")
	public String getBooks(Model model)
	{
		model.addAttribute("books", bRepo.findAll());
		
		//view name(html) file to be rendered
		return "books";
	}
}
