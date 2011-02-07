package com.jpizarro.th.server.team.view.axis;

import com.jpizarro.th.lib.team.entity.TeamTO;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.DuplicateInstanceException;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.InstanceNotFoundException;

public interface Axis2TeamService {
	void create(TeamTO entity) throws DuplicateInstanceException;
	
	TeamTO find(Long id) throws InstanceNotFoundException;
	
	boolean exists(Long id);
	
	TeamTO update(TeamTO entity);

	boolean remove(Long id) throws InstanceNotFoundException;	
	
}
