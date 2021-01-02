package com.agh.starwars.nodes;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.ArrayList;
import java.util.List;

@Node
@Data
public class Episode {
    @Id
    private final String title;

    @Property("tagline")
    private final String description;

    @Relationship(type = "WAS_IN", direction = Relationship.Direction.INCOMING)
    private List<Entity> characters = new ArrayList<>();

}
