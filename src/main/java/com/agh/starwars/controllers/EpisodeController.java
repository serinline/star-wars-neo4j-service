package com.agh.starwars.controllers;

import com.agh.starwars.nodes.Episode;
import com.agh.starwars.repositories.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/episodes")
public class EpisodeController {

    @Autowired
    private EpisodeRepository episodeRepository;

    @GetMapping
    List<Episode> getAllEpisodes(){
        return episodeRepository.findAll();
    }

    @GetMapping("/{title}")
    Episode getEpisodeByTitle(@PathVariable String title){
        return episodeRepository.findById(title)
                .orElseThrow(() -> new ResourceNotFoundException("No character with this name found"));
    }
}
