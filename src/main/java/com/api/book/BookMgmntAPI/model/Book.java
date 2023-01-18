package com.api.book.BookMgmntAPI.model;


//import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection ="books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @MongoId
    private String bookId;
    private String title;
    private String author;


}
