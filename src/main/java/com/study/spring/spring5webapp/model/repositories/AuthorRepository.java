package com.study.spring.spring5webapp.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.study.spring.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>
{

}
