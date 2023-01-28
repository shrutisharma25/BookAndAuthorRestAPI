package com.javaprojects.dao;

import org.springframework.data.repository.CrudRepository;

import com.javaprojects.entities.Book;


public interface BookRepository extends CrudRepository<Book,Integer>{

	public Book findById(int id); 

}
