package com.timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//DTO
@RestController
@RequestMapping(value = "/api/timer", produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {
    private final Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping("/save")
    public void saveTheTime(@RequestBody RequestTidDTO requestTidDTO) {
        service.saveTheTime(requestTidDTO.getTime(), requestTidDTO.getTimerId());
    }

    @GetMapping("/get")
    public ResponseEntity<List<String>> getTheTime() {
        return ResponseEntity.ok(service.getTheTimes());
    }
}


