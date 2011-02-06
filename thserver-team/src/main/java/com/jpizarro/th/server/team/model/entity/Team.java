package com.jpizarro.th.server.team.model.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Team {
	private long teamId;
	private String name;
	private String description;
	
	private Set<User> users = new HashSet<User>();
	
	public Team() {}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,
            generator="TeamIdGenerator")
    @SequenceGenerator(             // It only takes effect for
            name="TeamIdGenerator", // databases providing identifier
            sequenceName="TeamSeq") // generators.
	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	@OneToMany(mappedBy = "team", fetch = FetchType.LAZY)
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	public void addUser(User user) {
		this.users.add(user);
		user.setTeam(this);
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", name=" + name + ", description="
				+ description + "]";
	}


}
