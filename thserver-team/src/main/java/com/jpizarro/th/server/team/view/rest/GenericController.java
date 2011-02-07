package com.jpizarro.th.server.team.view.rest;

import org.springframework.web.servlet.ModelAndView;

public interface GenericController {
	public ModelAndView getEntity(Long id);
	public ModelAndView getEntities();
	public ModelAndView addEntity(String body);
	public ModelAndView updateEntity(String body);
	public ModelAndView removeEntity(Long id);

}
