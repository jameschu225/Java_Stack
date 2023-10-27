package com.codingdojo.BookAPI.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.BookAPI.models.Book;
import com.codingdojo.BookAPI.services.BookService;


@Controller
public class BookController {
	private final BookService bookService;
	public BookController(BookService bookService){
	    this.bookService = bookService;
	}
	
	@GetMapping("/books/{id}")
	public String show(@PathVariable("id") Long id, Model showModel ) {
		Book book = bookService.findBook(id);
		showModel.addAttribute("book", book);
		return "show.jsp";
	}

	@GetMapping("/books")
	public String show(Model showModel ) {
		List<Book> allBooks = bookService.allBooks();
		showModel.addAttribute("allBooks", allBooks);
		return "index.jsp";
	}
}
