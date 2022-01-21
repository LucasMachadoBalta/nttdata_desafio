package com.nttdatadesafio.nttdatadesafio.controller;

import com.nttdatadesafio.nttdatadesafio.dto.CategoryDTO;
import com.nttdatadesafio.nttdatadesafio.services.CategoryServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@Api(value="API REST Controle Financeiro")
@CrossOrigin(origins="*")
public class CategoryController {

    @Autowired
    CategoryServiceImpl service;

    @GetMapping("/")
    @ApiOperation(value="Retorna uma lista de categorias")
    public List<Object> listCategory() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value="Retorna uma única categoria")
    public Object findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value="Salva uma categoria")
    public Object saveCategory(@RequestBody CategoryDTO dto) {
        return ResponseEntity.ok().body(service.save(dto)).getBody();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value="Deleta uma categoria")
    public void deleteCategory(@PathVariable("id") Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    @ApiOperation(value="Atualiza uma categoria")
    public Object putCategory(@RequestBody CategoryDTO dto) {
        return service.save(dto);
    }

}
