package com.jpizarro.th.server.team.model.service;

import com.jpizarro.th.lib.team.entity.TeamTO;
import com.jpizarro.th.lib.team.entity.UserTO;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.InstanceNotFoundException;
import com.jpizarro.th.server.generic.model.service.GenericService;

public interface TeamService extends GenericService <TeamTO, Long>{

	void join(long userId, long teamId);
	public boolean addUser(Long id, UserTO user) throws InstanceNotFoundException;
	public boolean removeUser(Long id, UserTO user) throws InstanceNotFoundException;

}
