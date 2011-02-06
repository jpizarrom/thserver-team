package com.jpizarro.th.server.team.model.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class User {

	private long userId;

	private Team team;
	
	public User() {
	}
	
	public User(long userId) {
		super();
		this.userId = userId;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,
            generator="UserIdGenerator")
    @SequenceGenerator(             // It only takes effect for
            name="UserIdGenerator", // databases providing identifier
            sequenceName="UserSeq") // generators.
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teamId")
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
