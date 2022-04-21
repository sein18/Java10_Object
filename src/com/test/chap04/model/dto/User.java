package com.test.chap04.model.dto;

import java.util.Date;

public class User {
	
	//필드
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;

	// 생성자(기본생성자,매개변수)
	// 기본생성자
	public User() { }
	
	//매개변수생성자
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, Date enrollDate) {
		//this.userId = userId;
		//this.userPwd = userPwd;
		//this.userName = userName;
		this(userId, userPwd, userName);
		
		this.enrollDate = enrollDate;
	}
	
	// getter&setter
	public String getUserId() {
		return userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	
	//information()

	public void informathion() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
	}
}
