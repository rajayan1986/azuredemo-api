package com.api.book.BookMgmntAPI.controller;

import com.api.book.BookMgmntAPI.model.Book;
import com.api.book.BookMgmntAPI.services.bookservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
	private com.api.book.BookMgmntAPI.services.bookservices bookservices;

	/*@GetMapping("/book")
	public List<Book> getAllBooks() {
	    return bookservices.findAll();
	}*/

	@PostMapping("/book")
	@ResponseStatus(HttpStatus.CREATED)
	public Book createBook(@RequestBody Book book) {
	    return bookservices.addbook(book);
	}


	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable(value = "id") String bookId) {
	    return bookservices.findById(bookId);
	}


	@PutMapping("/book/{id}")
	public Book updateBook(@PathVariable(value = "id") String bookId,
	                                         @RequestBody Book bookDetails) {
	    bookservices.findById(bookId);
	    bookDetails.setBookId(bookId);
		return bookservices.updatebook(bookDetails);
	}

	@DeleteMapping("/book/{bookId}")
	public String deleteBook(@PathVariable String bookId) {
	    return bookservices.delById(bookId);
	}
}
