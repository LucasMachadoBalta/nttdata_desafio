package com.nttdatadesafio.nttdatadesafio.controller;

import com.nttdatadesafio.nttdatadesafio.dto.EntryDTO;
import com.nttdatadesafio.nttdatadesafio.services.EntryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // ou @RestController?
@RequestMapping(value="/entry")
public class EntryController {

    @Autowired
    EntryServiceImpl service;

    // create(save) read(get) updateById deleteById

    @GetMapping("/listEntry")
    public List<Object> listEntry() {
        return service.findAll();
    }

    @GetMapping("/getEntry/{id}")
    public Object findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Object saveCategory(@RequestBody EntryDTO dto) {
        return ResponseEntity.ok().body(service.save(dto)).getBody();
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public Object putCategory(@RequestBody EntryDTO dto) {
        return service.save(dto);
    }
}


