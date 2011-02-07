package com.jpizarro.th.server.team.view.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jpizarro.th.lib.team.entity.TeamTO;
import com.jpizarro.th.lib.team.entity.UserTO;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.DuplicateInstanceException;
import com.jpizarro.th.server.generic.model.persistence.util.exceptions.InstanceNotFoundException;
import com.jpizarro.th.server.team.model.service.TeamService;

@Controller
@RequestMapping("/teams")

public class TeamController implements GenericController{
	@Autowired
	private TeamService teamService;
	private String XML_VIEW_NAME = "xmlView";
	
	@RequestMapping(method=RequestMethod.GET, value="/teams/{id}")
	public ModelAndView getEntity(@PathVariable Long id) {
		TeamTO to = null;
		try {
			to = teamService.find(id);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return to;
		return new ModelAndView(XML_VIEW_NAME, BindingResult.MODEL_KEY_PREFIX+"team", to);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/teams/{id}/users")
	public ModelAndView gets(@PathVariable Long id) {
		TeamTO to = null;
		try {
			to = teamService.find(id);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<UserTO> users =  to.getUsers();
		return new ModelAndView(XML_VIEW_NAME, BindingResult.MODEL_KEY_PREFIX+"users", users);
	}

	@Override
	public ModelAndView getEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView addEntity(String body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView updateEntity(String body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(method=RequestMethod.DELETE, value="/teams/{id}")
	@Transactional
	public ModelAndView removeEntity(@PathVariable Long id) {
		boolean ret = true;
		// TODO Auto-generated method stub
		try {
			teamService.remove(id);
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ret = false;
		}
		return new ModelAndView(XML_VIEW_NAME, BindingResult.MODEL_KEY_PREFIX+"users", ret);
	}

}
