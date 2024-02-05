package edu.icet.controller;

import edu.icet.dto.ReaderDto;
import edu.icet.entity.ReaderEntity;
import edu.icet.service.ReaderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RestController("reader")
public class ReaderController {
    @Autowired
    ReaderService service;
    @GetMapping("reader/list")
    public List<ReaderDto> getReader(){return service.getAllReaders();
    }
    @PostMapping("reader/add")
    public ReaderEntity postReader(@RequestBody ReaderDto readerDto){
        log.info(String.valueOf(readerDto));
        return service.postReader(readerDto);
    }
}
