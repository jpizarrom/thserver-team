package com.jpizarro.th.server.team.view.web.ws;

import org.apache.wicket.PageParameters;
import org.wicketstuff.annotation.mount.MountPath;
import org.wicketstuff.annotation.strategy.MountMixedParam;

import com.jpizarro.th.lib.team.util.xml.xstream.TeamXStreamFactory;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.InstanceNotFoundException;
import com.jpizarro.th.server.generic.view.web.ws.util.GenericWS;
import com.jpizarro.th.server.team.model.service.TeamService;
import com.jpizarro.th.server.team.view.web.application.WicketApplication;

import com.thoughtworks.xstream.XStream;

import es.sonxurxo.androidrunner.model.service.game.util.exception.MaxUsersReachedException;
import es.sonxurxo.androidrunner.model.service.game.util.exception.TimeOutException;


@MountPath(path = "/ws/joinGame")
@MountMixedParam(parameterNames={"gameId", "teamId"})
public class JoinGameWS extends GenericWS {

	public JoinGameWS(PageParameters parameters) {
		super(parameters, new TeamXStreamFactory());
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doExecute(PageParameters parameters) {
		// TODO Auto-generated method stub
//		String username = "";
//		String username = WicketSession.get().getLoginResultTO().getUsername();
		long userId = parameters.getLong("teamId");
		long teamId = parameters.getLong("teamId");
		
		TeamService service = WicketApplication.get().getTeamService();
//		try {
//			service.join(userId, teamId);
//			XStream xf = xStreamFactory.createXStream();
//			this.selement = xf.toXML(true);
////			this.element = TOToXMLConversor.toXML(TOToXMLConversor.OK_JOINED_ELEMENT_NAME);
//		} catch (InstanceNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (MaxUsersReachedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (TimeOutException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
