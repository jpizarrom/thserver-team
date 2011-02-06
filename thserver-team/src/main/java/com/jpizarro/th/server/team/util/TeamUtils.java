package com.jpizarro.th.server.team.util;

import java.util.ArrayList;
import java.util.List;

import com.jpizarro.th.lib.team.entity.TeamTO;
import com.jpizarro.th.lib.team.entity.UserTO;
import com.jpizarro.th.server.team.model.entity.Team;
import com.jpizarro.th.server.team.model.entity.User;

public class TeamUtils extends com.jpizarro.th.lib.team.entity.TeamTO {

	public static TeamTO teamTOFromTeam(Team team) {
		TeamTO teamTO = new TeamTO();
		List<UserTO> userTOList = new ArrayList<UserTO>();
		
		teamTO.setTeamId( team.getTeamId());
		teamTO.setName( team.getName());
		teamTO.setDescription( team.getDescription());
		teamTO.setCurrentUsers( team.getUsers().size());
		
		for(User user: team.getUsers()){
			UserTO userTO = new UserTO();
			userTO.setUserId( user.getUserId());
			userTOList.add( userTO);
		}
		teamTO.setUsers(userTOList);
		
		return teamTO;
	}
}
