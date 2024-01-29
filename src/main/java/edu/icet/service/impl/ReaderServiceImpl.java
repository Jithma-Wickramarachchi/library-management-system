package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.ReaderDto;
import edu.icet.entity.ReaderEntity;
import edu.icet.repository.ReaderRepository;
import edu.icet.service.ReaderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ReaderServiceImpl implements ReaderService {

    @Autowired
    ReaderRepository repository;
    @Autowired
    ObjectMapper mapper;

    @Override
    public ReaderEntity postReader(ReaderDto readerDto) {
        return repository.save(mapper.convertValue(readerDto,ReaderEntity.class));
    }

    @Override
    public List<ReaderEntity> getAllReaders() {
        return (List<ReaderEntity>) repository.findAll();
    }
}
