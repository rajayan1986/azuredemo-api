package com.api.book.BookMgmntAPI.repository;


import com.api.book.BookMgmntAPI.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

    Book findByBookId(String bookId);


}
