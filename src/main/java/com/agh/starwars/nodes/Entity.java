package com.agh.starwars.nodes;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
@Data
public class Entity {
    @Id
    private final String name;

    @Relationship(type = "TYPE", direction = Relationship.Direction.INCOMING)
    Type type;
}
