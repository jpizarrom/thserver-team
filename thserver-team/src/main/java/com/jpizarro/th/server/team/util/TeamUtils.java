package com.jpizarro.th.server.team.util;

import com.jpizarro.th.lib.team.entity.TeamTO;
import com.jpizarro.th.lib.team.entity.UserTO;
import com.jpizarro.th.server.team.model.entity.Team;
import com.jpizarro.th.server.team.model.entity.User;

public class TeamUtils extends TeamTO {

	public static TeamTO teamTOFromTeam(Team team) {
		TeamTO teamTO = new TeamTO();
//		List<UserTO> userTOList = new ArrayList<UserTO>();
		
		teamTO.setTeamId( team.getTeamId());
		teamTO.setName( team.getName());
		teamTO.setDescription( team.getDescription());
		teamTO.setCurrentUsers( team.getUsers().size());
		
		for(User user: team.getUsers()){
			UserTO userTO = new UserTO();
			userTO.setUserId( user.getUserId());
//			userTOList.add( userTO);
			teamTO.addUser(userTO);
		}
//		teamTO.setUsers(userTOList);
		
		return teamTO;
	}
	public static Team teamFromTeamTO(TeamTO teamTO) {
		Team team = new Team();
		team.setTeamId(teamTO.getTeamId());
		team.setName(teamTO.getName());
		
		return team;
	}
	public static User userFromUserTO(UserTO userTO) {
		User user = new User();
		user.setUserId(userTO.getUserId());
		
		return user;
	}
	public static UserTO userTOFromUser(User user) {
		UserTO to = new UserTO();
		to.setUserId(user.getUserId());
		
		for (Team team :user.getTeams()){
			TeamTO tto = TeamUtils.teamTOFromTeam(team);
			
			TeamTO rtto = new TeamTO();
			rtto.setTeamId(tto.getTeamId());
			rtto.setCurrentUsers(tto.getCurrentUsers());
			
			to.getTeams().add(rtto);
//		TeamTO tto = new TeamTO();
			}
		return to;
	}
	
}
