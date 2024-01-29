package edu.icet.controller;

import edu.icet.dto.ReaderDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RestController("reader")
public class ReaderController {
    @GetMapping
    public ReaderDto getReader(){
        return new ReaderDto("R102030", "Saman", "111111", "0711111111", "Colombo");
    }
    @PostMapping
    public ReaderDto postReader(@RequestBody ReaderDto readerDto){
        log.info(String.valueOf(readerDto));
        return readerDto;
    }

}
