package dev.yonk.bookstore.Book;

import org.springframework.data.mongodb.repository.MongoRepository;
@org.springframework.stereotype.Repository
public interface Repository extends MongoRepository<Book, String> {

}
