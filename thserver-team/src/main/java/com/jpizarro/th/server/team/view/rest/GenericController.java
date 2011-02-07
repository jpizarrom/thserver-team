package com.jpizarro.th.server.team.view.rest;

import org.springframework.web.servlet.ModelAndView;

import com.jpizarro.th.lib.team.entity.TeamTO;

public interface GenericController {
	public ModelAndView getEntity(Long id);
	public ModelAndView getEntities();
//	public ModelAndView addEntity(TeamTO body);
	public ModelAndView updateEntity(String body);
	public ModelAndView removeEntity(Long id);

}
