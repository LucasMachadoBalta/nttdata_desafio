package com.nttdatadesafio.nttdatadesafio.controller;

import com.nttdatadesafio.nttdatadesafio.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("entry")
public class EntryController {

    @Autowired
    private EntryRepository entryRepository;

    @GetMapping()
}
