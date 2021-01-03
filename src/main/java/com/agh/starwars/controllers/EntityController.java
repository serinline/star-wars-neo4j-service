package com.agh.starwars.controllers;

import com.agh.starwars.nodes.Entity;
import com.agh.starwars.repositories.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/entities")
public class EntityController {

    @Autowired
    private EntityRepository entityRepository;

    @GetMapping
    List<Entity> getAllCharacters(){
        return entityRepository.findAll();
    }

    @GetMapping("/{name}")
    Entity getOneCharacterById(@PathVariable String name){
        return entityRepository.findById(name)
                .orElseThrow(() -> new ResourceNotFoundException("No character with this name found"));
    }

    @GetMapping ("/{episode}")
    List<Entity> getAllCharactersFromEpisode(@PathVariable String episode){
        return entityRepository.findAllCharactersFromEpisode(episode);
    }
}
