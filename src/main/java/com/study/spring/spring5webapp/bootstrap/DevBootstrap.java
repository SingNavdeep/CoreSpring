package com.study.spring.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.study.spring.spring5webapp.model.Author;
import com.study.spring.spring5webapp.model.Book;
import com.study.spring.spring5webapp.model.Publisher;
import com.study.spring.spring5webapp.model.repositories.AuthorRepository;
import com.study.spring.spring5webapp.model.repositories.BookRepository;
import com.study.spring.spring5webapp.model.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>
{
	private AuthorRepository authRepo;
	private BookRepository bRepo;
	private PublisherRepository pRepo;
	
	public DevBootstrap(AuthorRepository aRepo, BookRepository bRepo, PublisherRepository pRepo)
	{
		this.authRepo = aRepo;
		this.bRepo = bRepo;
		this.pRepo = pRepo;
	}
	
	private void initData()
	{
		Author eric = new Author("Eric", "Evans");
		Publisher p = new Publisher("Harper collins", "New Delhi", "Delhi");
		Book b = new Book("1234", "domain driven design", p);
		eric.getBooks().add(b);
		b.getAuthors().add(eric);
		b.setPublisher(p);
		
		pRepo.save(p);
		authRepo.save(eric);
		bRepo.save(b);
		
		
		
		Author rod = new Author("Rod", "Johnson");
		Publisher p1 = new Publisher("worx", "New Delhi", "Delhi");
		Book noEjb = new Book("2345", "J2ee dev without EJB", p1);
		rod.getBooks().add(noEjb);
		noEjb.getAuthors().add(rod);
		noEjb.setPublisher(p1);
		
		pRepo.save(p1);
		authRepo.save(rod);
		bRepo.save(noEjb);
		
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0)
	{
		initData();
	}
}
