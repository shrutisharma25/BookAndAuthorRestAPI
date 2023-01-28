package com.javaprojects.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaprojects.dao.BookRepository;
import com.javaprojects.entities.Book;


@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	//GET ALL BOOKS
	public List<Book> getAllBooks(){
		List<Book> list = (List<Book>)this.bookRepository.findAll();
		return list;
	}

	//GET BOOK DETAILS OF PARTICULAR ID
	public Book getBookById(int id){
		Book book =null;
		try {
			this.bookRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	//FOR ADDING BOOK DETAILS
	public Book addBook(Book b) {
		Book book = bookRepository.save(b);
		return book;
	}

	//FOR DELEING BOOK DETAILS
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}

	//FOR UPDATING THE BOOK DETAIL
	public void updateBook(Book book, int bookId) {
		book.setId(bookId);
		bookRepository.save(book);
	}
}
