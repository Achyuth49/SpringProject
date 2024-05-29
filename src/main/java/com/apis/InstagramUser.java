package com.apis;

public class InstagramUser {
	
	private String userName;
	private String password;
	private String bio;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	@Override
	public String toString() {
		return "InstagramUser [userName=" + userName + ", password=" + password + ", bio=" + bio + "]";
	}
	
	

}
