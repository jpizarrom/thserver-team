package com.jpizarro.th.server.team.view.axis;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.springframework.beans.factory.annotation.Autowired;

import com.jpizarro.th.lib.team.entity.TeamTO;
import com.jpizarro.th.lib.team.entity.UserTO;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.DuplicateInstanceException;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.InstanceNotFoundException;
import com.jpizarro.th.server.team.model.service.TeamService;

@WebService(serviceName="TeamService")
//@SOAPBinding(style=SOAPBinding.Style.RPC)
public class Axis2TeamServiceImpl implements Axis2TeamService {
	@Autowired
	private TeamService teamService;

	@Override
	public void create(TeamTO entity) throws DuplicateInstanceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TeamTO find(Long id) throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		return teamService.find(id);
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return teamService.exists(id);
	}

	@Override
	public TeamTO update(TeamTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Long id) throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		teamService.remove(id);
		return true;
		
	}

	@Override
	public boolean addUser(Long id, UserTO to) throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		return teamService.addUser(id, to);
	}


}
