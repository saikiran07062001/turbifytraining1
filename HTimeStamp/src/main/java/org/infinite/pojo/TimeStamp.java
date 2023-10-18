package org.infinite.pojo;

import java.util.Date;

public class TimeStamp {
private int loginid;
private String username;
private String password;
private Date time;
public TimeStamp(){
	
}
public TimeStamp(int loginid, String username, String password, Date time) {
	super();
	this.loginid = loginid;
	this.username = username;
	this.password = password;
	this.time = time;
}
public int getLoginid() {
	return loginid;
}
public void setLoginid(int loginid) {
	this.loginid = loginid;
}
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
public Date getTime() {
	return time;
}
public void setTime(Date time) {
	this.time = time;
}


}
