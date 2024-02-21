package edu.icet.service;

import edu.icet.dto.BookDto;
import edu.icet.entity.BookEntity;

public interface BookService {
    BookEntity post(BookDto dto);
}
