package com.jpizarro.th.server.team.model.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class User {

	private long userId;

//	private Team team;
	private Set<Team> teams = new HashSet<Team>();
	
	public User() {
	}
	
	public User(long userId) {
		super();
		this.userId = userId;
	}

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO,
//            generator="UserIdGenerator")
//    @SequenceGenerator(             // It only takes effect for
//            name="UserIdGenerator", // databases providing identifier
//            sequenceName="UserSeq") // generators.
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "teamId")
//	public Team getTeam() {
//		return team;
//	}
//
//	public void setTeam(Team team) {
//		this.team = team;
//	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}
	
	@ManyToMany(mappedBy="users")
	public Set<Team> getTeams() {
		return teams;
	}

}
