package com.study.spring.spring5webapp.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.study.spring.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
