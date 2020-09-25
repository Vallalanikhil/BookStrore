package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.BookRepository;
import com.model.Book;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping(path ="books")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/get")
	public List<Book> getBooks(){
		return bookRepository.findAll();
	}

}
