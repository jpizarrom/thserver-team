package com.jpizarro.th.server.team.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpizarro.th.server.generic.model.persistence.util.exceptions.DuplicateInstanceException;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.InstanceNotFoundException;
import com.jpizarro.th.server.team.model.entity.Team;
import com.jpizarro.th.server.team.model.entity.TeamTO;
import com.jpizarro.th.server.team.model.persistence.accessor.TeamAccessor;

@Service
public class TeamServiceImpl implements TeamService {
	@Autowired
	private TeamAccessor teamAccessor;

	@Override
	public void create(TeamTO entity) throws DuplicateInstanceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TeamTO find(Long id) throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		Team team = teamAccessor.find(id);
		TeamTO teamTO = new TeamTO(team);

		return teamTO;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TeamTO update(TeamTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long id) throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void join(long userId, long teamId) {
		// TODO Auto-generated method stub
		
	}

}
