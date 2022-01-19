package com.nttdatadesafio.nttdatadesafio.controller;

import com.nttdatadesafio.nttdatadesafio.dto.RequestCategoryDTO;
import com.nttdatadesafio.nttdatadesafio.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("getCategory")
    public String category(RequestCategoryDTO request) {
        return "category/getCategory";
    }

    //@PostMapping("postNewCategory")
    //public String newCategory(@Valid )

}
