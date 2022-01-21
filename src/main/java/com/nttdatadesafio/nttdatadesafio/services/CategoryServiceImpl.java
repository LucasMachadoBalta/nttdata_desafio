package com.nttdatadesafio.nttdatadesafio.services;

import com.nttdatadesafio.nttdatadesafio.dto.CategoryDTO;
import com.nttdatadesafio.nttdatadesafio.models.CategoryEntity;
import com.nttdatadesafio.nttdatadesafio.repositories.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements ServiceInterface {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Object findById(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public List<Object> findAll() {
        return new ArrayList<>(categoryRepository.findAll());
    }

    @Override
    public Object save(Object dto) {
        return categoryRepository.save(mapToDTO((CategoryDTO) dto));
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Object put(Object dto) {
        return categoryRepository.save(mapToDTO((CategoryDTO) dto));
    }

    private CategoryEntity mapToDTO(CategoryDTO categoryDTO) {
        return modelMapper.map(categoryDTO, CategoryEntity.class);

    }
}