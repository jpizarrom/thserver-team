package com.jpizarro.th.server.team.model.service;

import com.jpizarro.th.lib.team.entity.TeamTO;
import com.jpizarro.th.server.generic.model.service.GenericService;

public interface TeamService extends GenericService <TeamTO, Long>{

	void join(long userId, long teamId);

}
