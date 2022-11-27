package com.ntg.wineservice.web.controllers;

import com.ntg.wineservice.web.models.WineDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/wines")
public class WineController {

    @GetMapping("/{id}")
    public ResponseEntity<WineDto> getWine(@PathVariable UUID id){
        return new ResponseEntity<>(WineDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createWine(@RequestBody WineDto wineDto){
        //todo impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HttpStatus> updateWine(@PathVariable UUID id){
        //todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
