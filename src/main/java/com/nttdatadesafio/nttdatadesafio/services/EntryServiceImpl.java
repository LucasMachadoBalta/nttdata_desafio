package com.nttdatadesafio.nttdatadesafio.services;

import com.nttdatadesafio.nttdatadesafio.dto.EntryDTO;
import com.nttdatadesafio.nttdatadesafio.models.EntryEntity;
import com.nttdatadesafio.nttdatadesafio.repositories.EntryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntryServiceImpl implements ServiceInterface {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Object findById(Long id) {
        return entryRepository.findById(id).get();
    }

    @Override
    public List<Object> findAll() {
        return new ArrayList<>(entryRepository.findAll());
    }

    @Override
    public Object save(Object dto) {
        return entryRepository.save(mapToDTO((EntryDTO) dto));
    }

    @Override
    public void delete(Long id) {
        entryRepository.deleteById(id);
    }

    @Override
    public Object put(Object dto) {
        return entryRepository.save(mapToDTO((EntryDTO) dto));
    }


    private EntryEntity mapToDTO(EntryDTO entryDTO) {
        return modelMapper.map(entryDTO, EntryEntity.class);

    }
}
