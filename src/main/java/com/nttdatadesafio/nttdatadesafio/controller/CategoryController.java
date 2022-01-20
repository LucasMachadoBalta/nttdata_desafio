package com.nttdatadesafio.nttdatadesafio.controller;

import com.nttdatadesafio.nttdatadesafio.dto.CategoryDTO;
import com.nttdatadesafio.nttdatadesafio.entity.CategoryEntity;
import com.nttdatadesafio.nttdatadesafio.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value="/category")
public class CategoryController {

    @Autowired
    CategoryServiceImpl service;


    @GetMapping("/listCategory")
    public List<CategoryEntity> listCategory() { //GetCategoryDTO request
        return service.findAll(); // return "category/getCategory";
    }

    @GetMapping("/getCategory/{id}")
    public CategoryEntity findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoryEntity saveCategory(@RequestBody CategoryDTO dto) { //@Valid PostRequestDTO request, BindingResult result
        return ResponseEntity.ok().body(service.save(dto)).getBody();
    }

}
