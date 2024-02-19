package edu.icet.controller;

import edu.icet.dto.ReaderDto;
import edu.icet.entity.ReaderEntity;
import edu.icet.service.ReaderService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Around;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@CrossOrigin
@RestController("reader")
public class ReaderController {
    ReaderController(ReaderService service){
        this.service = service;
    }
    ReaderService service;
    @AuditTime
    @GetMapping("reader")
    public List<ReaderDto> getReader(){return service.getAllReaders();
    }
    @AuditTime
    @PostMapping("reader")
    public ReaderEntity postReader(@RequestBody ReaderDto readerDto){
        return service.postReader(readerDto);
    }
    @DeleteMapping("reader/{readerId}")
    public ResponseEntity<String> deleteReader(@PathVariable long readerId){
        return service.deleteReader(readerId) ?
                new ResponseEntity<>(String.format("Successfully Deleted : (%s)", readerId), HttpStatus.OK) :
                new ResponseEntity<>(String.format("ReaderID (%s) not found", readerId), HttpStatus.BAD_REQUEST) ;
    }

}
