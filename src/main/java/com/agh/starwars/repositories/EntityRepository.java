package com.agh.starwars.repositories;

import com.agh.starwars.nodes.Entity;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "characters")
public interface EntityRepository extends Repository<Entity, String> {
    List<Entity> findAll();

    Optional<Entity> findById(String id);

    @Query("MATCH (e:Episode {title: $episode}) <-[:WAS_IN]- (e:Entity) RETURN e")
    List<Entity> findAllCharactersFromEpisode(String episode);


}
