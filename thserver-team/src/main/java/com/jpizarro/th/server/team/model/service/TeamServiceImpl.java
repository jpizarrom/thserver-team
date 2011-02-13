package com.jpizarro.th.server.team.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jpizarro.th.lib.team.entity.TeamTO;
import com.jpizarro.th.lib.team.entity.UserTO;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.DuplicateInstanceException;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.InstanceNotFoundException;
import com.jpizarro.th.server.team.model.entity.Team;
import com.jpizarro.th.server.team.model.entity.User;
import com.jpizarro.th.server.team.model.persistence.accessor.TeamAccessor;
import com.jpizarro.th.server.team.model.persistence.accessor.UserAccessor;
import com.jpizarro.th.server.team.util.TeamUtils;

@Service
public class TeamServiceImpl implements TeamService {
	@Autowired
	private TeamAccessor teamAccessor;
	
	@Autowired
	private UserAccessor userAccessor;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public TeamTO create(TeamTO entity) throws DuplicateInstanceException {
		// TODO Auto-generated method stub
		Team t = TeamUtils.teamFromTeamTO(entity);
		teamAccessor.create(t);
		return TeamUtils.teamTOFromTeam(t);
	}

	@Override
	public TeamTO find(Long id) throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		Team team = teamAccessor.find(id);
		TeamTO teamTO = TeamUtils.teamTOFromTeam(team);

		return teamTO;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return teamAccessor.exists(id);
	}

	@Override
	@Transactional
	public TeamTO update(TeamTO entity) {
		Team team = TeamUtils.teamFromTeamTO(entity);
		team = teamAccessor.update(team);
		return TeamUtils.teamTOFromTeam(team);
	}

	@Override
	@Transactional
	public void remove(Long id) throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		teamAccessor.remove(id);
		
	}

	@Override
	public void join(long userId, long teamId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public boolean addUser(Long id, UserTO userTO)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		Team team = teamAccessor.find(id);
		User user = null;
		try {
			user = userAccessor.find(userTO.getUserId());
		}catch (InstanceNotFoundException e){
			user = TeamUtils.userFromUserTO(userTO);
			try {
				userAccessor.create(user);
			} catch (DuplicateInstanceException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return false;
			}
		}
		team.addUser(user);
		return true;
	}

	@Override
	public boolean removeUser(Long id, UserTO user)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
