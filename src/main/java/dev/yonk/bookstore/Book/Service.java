package dev.yonk.bookstore.Book;

import lombok.RequiredArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {
    private final Repository repository;

    public List<Book> getAllBooks() {
        return repository.findAll();
    }
}
