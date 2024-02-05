package edu.icet.service;


import edu.icet.dto.ReaderDto;
import edu.icet.entity.ReaderEntity;

import java.util.List;
import java.util.Map;

public interface ReaderService {
    ReaderEntity postReader(ReaderDto readerDto);
    List<ReaderDto> getAllReaders();
    boolean deleteReader(Long readerId);
}
