package com.infinite.beans;

import java.util.Date;

/**
 * @author saikirangud
 *
 */
public class User {
	private String username;
	private String password;
	private Date logindate;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLogindate() {
		return logindate;
	}
	public void setLogindate(Date logindate) {
		this.logindate = logindate;
	}
	public void Display(){
		System.out.println(username+" "+password);
		System.out.println(username+ "logged on "+logindate);
	}
}
