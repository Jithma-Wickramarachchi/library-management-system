package edu.icet.controller;

import edu.icet.dto.BookDto;
import edu.icet.entity.BookEntity;
import edu.icet.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController("book")
public class BookController {
    BookService service;
    BookController(BookService service){
        this.service = service;
    }
    @PostMapping("book")
    public BookEntity postBook(@RequestBody BookDto dto){
        return service.post(dto);
    }
}
