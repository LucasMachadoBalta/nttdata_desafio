package com.nttdatadesafio.nttdatadesafio.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceInterface {

    Object findById(Long id);

    List<Object> findAll();

    Object save(Object dto);

    void delete(Long id);

    Object put(Object dto);

}
