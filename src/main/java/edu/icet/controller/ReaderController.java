package edu.icet.controller;

import edu.icet.dto.ReaderDto;
import edu.icet.entity.ReaderEntity;
import edu.icet.service.ReaderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RestController("reader")
public class ReaderController {
    @Autowired
    ReaderService service;
    @GetMapping
    public ReaderDto getReader(){
        return new ReaderDto("R102030", "Saman", "111111", "0711111111", "Colombo");
    }
    @PostMapping
    public ReaderEntity postReader(@RequestBody ReaderDto readerDto){
        log.info(String.valueOf(readerDto));
        return service.postReader(readerDto);
    }

}
