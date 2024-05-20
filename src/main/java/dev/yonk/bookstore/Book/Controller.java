package dev.yonk.bookstore.Book;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class Controller {

    private final Service service;

    @GetMapping("")
    public ResponseEntity<List<Book>> getAllBook () {
        return new ResponseEntity<>(service.getAllBooks(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addBook(@RequestBody Book book) {
        try {
            return new ResponseEntity<>(service.addBook(book), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        try {
            return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable String id) {
        try {
            service.deleteBook(id);
            return new ResponseEntity<>("Delete book successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Book not found", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> updateBook(@PathVariable String id, @RequestBody Book bookUpdate) {
        try {
            return new ResponseEntity<>(service.updateBook(id, bookUpdate), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


}
