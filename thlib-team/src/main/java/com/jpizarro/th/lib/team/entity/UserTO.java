package com.jpizarro.th.lib.team.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("user")
@Root
public class UserTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7534948413604544467L;
	@Element(required=false)
	private long userId;

	@ElementList(required=false)
	private List<TeamTO> teams = new ArrayList<TeamTO>();
	
	public UserTO() {
		super();
	}
	public UserTO(long userId) {
		super();
		this.userId = userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getUserId() {
		return userId;
	}
	public List<TeamTO> getTeams() {
		return teams;
	}
	public void setTeams(List<TeamTO> teams) {
		this.teams = teams;
	}

}
