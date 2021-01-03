package com.agh.starwars.repositories;

import com.agh.starwars.nodes.Episode;
import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "episodes")
public interface EpisodeRepository extends Repository<Episode, String> {
    List<Episode> findAll();

    Optional<Episode> findById(String title);
}
