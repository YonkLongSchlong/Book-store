package dev.yonk.bookstore;

import dev.yonk.bookstore.Book.Book;
import dev.yonk.bookstore.Book.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class BookstoreApplication implements CommandLineRunner {
    private final Repository repository;

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Book book1 = new Book("1","Harry Potter","JKR",200, 20);
//        Book book2 = new Book("2","Nobody's Boy","Hector Malot",180, 20);
//        Book book3 = new Book("3","Sherlock Holmes","Arthur Conan Doyle",200, 10);
//        Book book4 = new Book("4","Hercule Poirot","Agatha Christie",200, 20);
//
//        repository.save(book1);
//        repository.save(book2);
//        repository.save(book3);
//        repository.save(book4);
    }
}
