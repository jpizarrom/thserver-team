package com.jpizarro.th.server.team.view.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jpizarro.th.lib.team.entity.TeamTO;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.InstanceNotFoundException;
import com.jpizarro.th.server.team.model.service.TeamService;

@Controller
public class TeamController {
	@Autowired
	private TeamService service;
//	private String XML_VIEW_NAME = "teams";
	
	@RequestMapping(method=RequestMethod.GET, value="/teams/{id}")
	public TeamTO getEmployee(@PathVariable String id) {
		TeamTO to = null;
		try {
			to = service.find(Long.parseLong(id));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return to;
//		return new ModelAndView(XML_VIEW_NAME, BindingResult.MODEL_KEY_PREFIX+"object", to);
	}


}
