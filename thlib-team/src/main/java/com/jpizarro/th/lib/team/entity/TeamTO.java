package com.jpizarro.th.lib.team.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("team")
@Root
public class TeamTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 731485816032540739L;
	@Element(required=false)
	private long teamId;
	@Element(required=false)
	private String name;
	@Element(required=false)
	private String description;
//	@Element(required=false)
//	private List<Competitor> competitors;
//	private List<Hint> hints;
	@Element(required=false)
	private int currentUsers;

	@ElementList(required=false)
	private List<UserTO> users = new ArrayList<UserTO>();
	
	public TeamTO(String name) {
		super();
		this.name = name;
//		competitors = new ArrayList<Competitor>();
	}

	public TeamTO() {
		// TODO Auto-generated constructor stub
	}

//	this.teamId = team.getTeamId();
//	this.name = team.getName();
//	this.description = team.getDescription();
//	this.currentUsers = team.getUsers().size();
//	for(User user: team.getUsers()){
//		UserTO userTO = new UserTO();
//		userTO.setUserId( user.getUserId());
//		userTO.setUsername( user.getUsername());
//		userTO.setPassword( user.getPassword());
////		userTO.set = user.getRole();
//		if (user.getTeam() != null && user.getTeam().getGame()!= null)
//			userTO.setGameId(user.getTeam().getGame().getGameId());
//		
//		userTO.setLatitude( user.getLatitude());
//		userTO.setLongitude( user.getLongitude());
//		userTOList.add( userTO);
//	}
//}
	
	@Override
	public String toString() {
		String result ="";
//		result += "Team [getId()=" + getId() + ", getName()=" + getName()
//				+ ", getCompetitors()=";
//		for (Competitor c : getCompetitors())
//			result += c; 
		result +=		"]";
		
		return result;
	}

	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCurrentUsers() {
		return currentUsers;
	}

	public void setCurrentUsers(int currentUsers) {
		this.currentUsers = currentUsers;
	}

	public List<UserTO> getUsers() {
		return users;
	}

	public void setUsers(List<UserTO> users) {
		this.users = users;
	}
	public void addUser(UserTO user) {
		this.users.add(user);
	}
}
