package edu.icet.controller;

import edu.icet.dto.BookDto;
import edu.icet.entity.BookEntity;
import edu.icet.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("book")
@CrossOrigin
public class BookController {
    BookService service;
    BookController(BookService service){
        this.service = service;
    }
    @PostMapping("book")
    public BookEntity postBook(@RequestBody BookDto dto){
        return service.post(dto);
    }
    @GetMapping("book")
    public List<BookDto> getBooks(){
        return service.getAllBooks();
    }
}
