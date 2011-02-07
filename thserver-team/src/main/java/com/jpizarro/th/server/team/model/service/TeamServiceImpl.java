package com.jpizarro.th.server.team.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpizarro.th.lib.team.entity.TeamTO;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.DuplicateInstanceException;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.InstanceNotFoundException;
import com.jpizarro.th.server.team.model.entity.Team;
import com.jpizarro.th.server.team.model.persistence.accessor.TeamAccessor;
import com.jpizarro.th.server.team.util.TeamUtils;

@Service
public class TeamServiceImpl implements TeamService {
	@Autowired
	private TeamAccessor teamAccessor;

	@Override
	@Transactional
	public void create(TeamTO entity) throws DuplicateInstanceException {
		// TODO Auto-generated method stub
		teamAccessor.create(TeamUtils.teamFromTeamTO(entity));
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
	public TeamTO update(TeamTO entity) {
		// TODO Auto-generated method stub
		return null;
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

}
