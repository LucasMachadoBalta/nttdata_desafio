package com.nttdatadesafio.nttdatadesafio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t")
public class tController {

    @GetMapping
    public String teste(){
        return "teste";
    }
}