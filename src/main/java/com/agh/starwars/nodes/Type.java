package com.agh.starwars.nodes;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data
public class Type {
    @Id
    @GeneratedValue
    private Long id;

    private final String typeName;

}
