package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.ReaderDto;
import edu.icet.entity.ReaderEntity;
import edu.icet.repository.ReaderRepository;
import edu.icet.service.GenerateReaderId;
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
    GenerateReaderId readerId;

    ReaderServiceImpl(){
        this.readerId = new GenerateReaderId();
    }

    @Override
    public ReaderEntity postReader(ReaderDto readerDto) {
        ReaderEntity entity = mapper.convertValue(readerDto,ReaderEntity.class);
        entity.setReaderId(readerId.getReaderId());
        return repository.save(entity);
    }

    @Override
    public List<ReaderEntity> getAllReaders() {
        return (List<ReaderEntity>) repository.findAll();
    }
}
