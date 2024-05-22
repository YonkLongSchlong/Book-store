package dev.yonk.bookstore.Book;

import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Book, Long> {

}
