package com.jpizarro.th.server.team.view.web.ws;

import org.apache.wicket.PageParameters;
import org.wicketstuff.annotation.mount.MountPath;
import org.wicketstuff.annotation.strategy.MountMixedParam;

import com.jpizarro.th.lib.team.entity.TeamTO;
import com.jpizarro.th.lib.team.util.xml.xstream.TeamXStreamFactory;

import com.jpizarro.th.server.generic.model.persistence.util.exceptions.InstanceNotFoundException;
import com.jpizarro.th.server.generic.view.web.ws.util.GenericWS;
import com.jpizarro.th.server.team.model.service.TeamService;
import com.jpizarro.th.server.team.view.web.application.WicketApplication;

import com.thoughtworks.xstream.XStream;

@MountPath(path = "/ws/findTeamById")
@MountMixedParam(parameterNames={"teamId"})
public class FindTeamByIdWS extends GenericWS {

	public FindTeamByIdWS(PageParameters parameters) {
		super(parameters, new TeamXStreamFactory());
		// TODO Auto-generated constructor stub
	}

	public void	doExecute(PageParameters parameters){
		long teamId = parameters.getLong("teamId");
		
		TeamService gameService = WicketApplication.get().getTeamService();
		try {
			TeamTO teamTO = gameService.find(teamId);
			
			XStream xf = xStreamFactory.createXStream();
			this.selement = xf.toXML(teamTO);
//			this.element = TOToXMLConversor.toXML(teamTO);
		} catch (InstanceNotFoundException e) {
			System.out.println("IOIO : " + e.getMessage());
		}
	}

}
