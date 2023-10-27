package com.codingdojo.BookAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.BookAPI.models.Book;
import com.codingdojo.BookAPI.repositories.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public Book updateBook(Long id,String title,String desc,String lang, Integer numOfPages) {
//        	Book updatebook = new Book(title, desc, lang, numOfPages);
//        	updatebook.setId(id);
//        	return bookRepository.save(updatebook);
    	Optional<Book> book = bookRepository.findById(id);        
    		if(book.isPresent()) {
    			Book updateBook = book.get();
    			updateBook.setTitle(title);
    			updateBook.setDescription(desc);
    			updateBook.setLanguage(lang);
    			updateBook.setNumberOfPages(numOfPages);
	            return bookRepository.save(updateBook);
//    			return updateBook;
	        } else {
	            return null;
	        }
        }
    public void deleteBook(Long id) {
    	 bookRepository.deleteById(id);
    }
}