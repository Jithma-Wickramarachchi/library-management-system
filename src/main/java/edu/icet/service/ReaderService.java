package edu.icet.service;


import edu.icet.dto.ReaderDto;
import edu.icet.entity.ReaderEntity;

public interface ReaderService {
    ReaderEntity postReader(ReaderDto readerDto);
}
