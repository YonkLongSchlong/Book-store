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

    public Book addBook(Book book) throws Exception {
        try {
            return repository.save(book);
        } catch (Exception e) {
            throw new Exception("Error adding new Book");
        }
    }

    public Book findById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public void deleteBook(String id) {
         try {
             repository.deleteById(id);
         } catch (Exception e) {
             throw new RuntimeException("Book not found");
         }
    }

    public Book updateBook(String id, Book bookUpdate) {
        try {
            Book book = repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Book not found"));
            book.setName(bookUpdate.getName());
            book.setAuthor(bookUpdate.getAuthor());
            book.setQuantity(bookUpdate.getQuantity());
            book.setPrice(bookUpdate.getPrice());
            return repository.save(book);
        } catch (Exception e) {
            throw new RuntimeException("Can't update book");
        }
    }
}
