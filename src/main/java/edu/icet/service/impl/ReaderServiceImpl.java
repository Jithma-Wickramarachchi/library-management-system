package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.ReaderDto;
import edu.icet.entity.ReaderEntity;
import edu.icet.repository.ReaderRepository;
import edu.icet.service.ReaderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public List<ReaderDto> getAllReaders() {
        List<ReaderDto> readerList  =new ArrayList<>();

        Iterable<ReaderEntity> readerEntityList = repository.findAll();
        Iterator<ReaderEntity> iterator = readerEntityList.iterator();

        while (iterator.hasNext()){
           readerList.add(mapper.convertValue(iterator.next(), ReaderDto.class));
        }

        return readerList;
    }

    @Override
    public boolean deleteReader(Long readerId) {

        Optional<ReaderEntity> readerEntityOptionl = repository.findById(readerId);

        if(readerEntityOptionl.isPresent()){
            repository.deleteById(readerId);
            return true;
        }
        return false;
    }
}
