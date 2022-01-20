package com.nttdatadesafio.nttdatadesafio.service;

import com.nttdatadesafio.nttdatadesafio.dto.CategoryDTO;
import com.nttdatadesafio.nttdatadesafio.entity.CategoryEntity;

import java.util.List;

public interface CategoryServ {

    CategoryEntity findById(Long id);

    List<CategoryEntity> findAll();

    CategoryEntity save(CategoryDTO dto);

}
