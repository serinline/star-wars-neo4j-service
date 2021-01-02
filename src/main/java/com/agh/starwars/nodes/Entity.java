package com.agh.starwars.nodes;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Id;

@Node
@Data
public class Entity {

    @Id
    private final String name;

}
