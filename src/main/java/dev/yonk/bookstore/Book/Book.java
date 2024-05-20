package dev.yonk.bookstore.Book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("books")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    @Id
    private String id;
    private String name;
    private String author;
    private double price;
    private int quantity;
}
