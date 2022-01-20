package com.nttdatadesafio.nttdatadesafio.service;

import com.nttdatadesafio.nttdatadesafio.dto.CategoryDTO;
import com.nttdatadesafio.nttdatadesafio.dto.EntryDTO;
import com.nttdatadesafio.nttdatadesafio.entity.CategoryEntity;
import com.nttdatadesafio.nttdatadesafio.entity.EntryEntity;
import com.nttdatadesafio.nttdatadesafio.repository.EntryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryServiceImpl implements CategoryServ {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public EntryEntity findById(Long id) {
        return null;
    }

    @Override
    public List<EntryEntity> findAll() {
        return null;
    }

    @Override
    public EntryEntity save(EntryDTO dto) {
        return null;
    }

    private EntryEntity mapToDTO(EntryDTO entryDTO) {
        return modelMapper.map(entryDTO, EntryEntity.class);

    }
}
