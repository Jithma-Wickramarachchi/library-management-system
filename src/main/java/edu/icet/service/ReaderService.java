package edu.icet.service;


import edu.icet.dto.ReaderDto;
import edu.icet.entity.ReaderEntity;

import java.util.List;

public interface ReaderService {
    ReaderEntity postReader(ReaderDto readerDto);
    List<ReaderEntity> getAllReaders();
}
