package com.agh.starwars.repositories;

import com.agh.starwars.nodes.Type;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TypeRepository extends Repository<Type, Long> {
    List<Type> findAll();
}
