package com.agh.starwars.controllers;

import com.agh.starwars.nodes.Type;
import com.agh.starwars.repositories.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/types")
public class TypeController {

    @Autowired
    private TypeRepository typeRepository;

    @GetMapping
    List<Type> getTypes(){
        return typeRepository.findAll();
    }
}
