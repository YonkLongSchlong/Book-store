package dev.yonk.bookstore.Book;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
