package com.nttdatadesafio.nttdatadesafio.controller;

import com.nttdatadesafio.nttdatadesafio.dto.CategoryDTO;
import com.nttdatadesafio.nttdatadesafio.entity.CategoryEntity;
import com.nttdatadesafio.nttdatadesafio.entity.EntryEntity;
import com.nttdatadesafio.nttdatadesafio.repository.EntryRepository;
import com.nttdatadesafio.nttdatadesafio.service.CategoryServiceImpl;
import com.nttdatadesafio.nttdatadesafio.service.EntryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*@Controller
@RequestMapping("entry")*/
public class EntryController {

    @Autowired
    EntryServiceImpl service;

    //private EntryRepository entryRepository;

    //@GetMapping()

    // create(save) read(get) updateById deleteById

/*

    @Autowired
    CategoryServiceImpl service;

*/
    @GetMapping("/listEntry")
    public List<EntryEntity> listEntry() { //GetCategoryDTO request
        return service.findAll(); // return "category/getCategory";
    }

/*
    @GetMapping("/listCategory")
    public List<EntryEntity> listCategory() { //GetCategoryDTO request
        return service.findAll(); // return "category/getCategory";
    }

    @GetMapping("/getCategory/{id}")
    public CategoryEntity findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public EntryEntity saveCategory(@RequestBody CategoryDTO dto) { //@Valid PostRequestDTO request, BindingResult result
        return ResponseEntity.ok().body(service.save(dto)).getBody();
    }*/
}


