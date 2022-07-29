package com.example.demoneo4j.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.neo4j.ogm.annotation.*;

@Data
@RelationshipEntity(type = "Follow")
public class Follow<U1, U2> {
	
	@Id
	@GeneratedValue
	private String id;

	@Property
	private String time;

	@StartNode
	private U1 follower;

	@EndNode
	private U2 followedUser;

	public Follow(String time, U1 follower, U2 followedUser) {
		this.time = time;
		this.follower = follower;
		this.followedUser = followedUser;
	}
}
