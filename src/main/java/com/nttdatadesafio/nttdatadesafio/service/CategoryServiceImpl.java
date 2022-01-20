package com.nttdatadesafio.nttdatadesafio.service;

import com.nttdatadesafio.nttdatadesafio.dto.CategoryDTO;
import com.nttdatadesafio.nttdatadesafio.entity.CategoryEntity;
import com.nttdatadesafio.nttdatadesafio.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryServ {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategoryEntity findById(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public List<CategoryEntity> findAll() {
        return new ArrayList<>(categoryRepository.findAll());
    }

    @Override
    public CategoryEntity save(CategoryDTO dto) {
        return categoryRepository.save(mapToDTO(dto));
    }

    private CategoryEntity mapToDTO(CategoryDTO categoryDTO) {
        return modelMapper.map(categoryDTO, CategoryEntity.class);

    }
}