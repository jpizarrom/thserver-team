package com.jpizarro.th.server.team.model.entity;

public class TeamTO extends com.jpizarro.th.lib.team.entity.TeamTO {
	public TeamTO(Team team) {
		this.setTeamId( team.getTeamId());
		this.setName( team.getName());
		this.setDescription( team.getDescription());
		this.setCurrentUsers( team.getUsers().size());
	}
}
