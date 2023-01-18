package com.api.book.BookMgmntAPI.services;


import com.api.book.BookMgmntAPI.model.Book;
import com.api.book.BookMgmntAPI.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class bookservices {

    @Autowired
    private BookRepository bookRepository;

     //CRUD create, Read, update , delete

    public Book addbook(Book book) {
        book.setBookId(UUID.randomUUID().toString().split("-")[0]);
        return bookRepository.save(book);
    }



    public Book findById(String bookId) {
        return bookRepository.findById(bookId).get();
    }

    public Book updatebook(Book BookRequest) {

        Book existingBook = bookRepository.findById(BookRequest.getBookId()).get();
        existingBook.setTitle(BookRequest.getTitle());
        existingBook.setAuthor(BookRequest.getAuthor());
        return bookRepository.save(existingBook);
    }

    public String delById(String BookId) {
        bookRepository.deleteById(BookId);
        return (BookId + "Book has been deleted from dashboard");
    }

}
