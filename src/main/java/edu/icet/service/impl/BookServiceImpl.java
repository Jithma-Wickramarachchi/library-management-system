package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.BookDto;
import edu.icet.entity.BookEntity;
import edu.icet.repository.BookRepository;
import edu.icet.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    BookServiceImpl(BookRepository repository, ObjectMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }
    BookRepository repository;
    ObjectMapper mapper;
    @Override
    public BookEntity post(BookDto dto) {
        return repository.save(mapper.convertValue(dto, BookEntity.class));
    }
}
