package com.kh.idol.model.vo;

public class Fan {
	
	private String userId;
	private String userPw;
	private String nickName;
	
	public Fan() {
		super();
	}
	
	public Fan(String userId, String userPw, String nickName) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.nickName = nickName;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String toString() {
		return "Fan [userId=" + userId + ", userPw=" + userPw + ", nickName=" + nickName + "]";
	}
	
}
