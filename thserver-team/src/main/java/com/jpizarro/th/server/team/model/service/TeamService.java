package com.jpizarro.th.server.team.model.service;

import com.jpizarro.th.server.generic.model.service.GenericService;
import com.jpizarro.th.server.team.model.entity.TeamTO;

public interface TeamService extends GenericService <TeamTO, Long>{

	void join(long userId, long teamId);

}
