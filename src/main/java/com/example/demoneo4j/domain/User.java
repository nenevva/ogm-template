package com.example.demoneo4j.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@Data
@AllArgsConstructor
@NodeEntity(label = "User")
public class User {

	@Id
	private String id;

	@Property
	private String name;
}
