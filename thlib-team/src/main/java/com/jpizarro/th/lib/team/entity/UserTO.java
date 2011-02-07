package com.jpizarro.th.lib.team.entity;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("user")
public class UserTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7534948413604544467L;
	private long userId;

	public UserTO() {
		super();
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getUserId() {
		return userId;
	}

}
