package com.kh.idol.model.vo;

public class Board {
	
	/*
	 * 제목
	 * 내용
	 * 작성자
	 * 작성일
	 * 
	 */
	private int bosrdNo;
	private String bosrdTitle;
	private String bosrdContent;
	private String userId;
	private String createDate;
	
	public Board() {
		super();
	}
	
	public Board(int bosrdNo, String bosrdTitle, String bosrdContent, String userId, String createDate) {
		super();
		this.bosrdNo = bosrdNo;
		this.bosrdTitle = bosrdTitle;
		this.bosrdContent = bosrdContent;
		this.userId = userId;
		this.createDate = createDate;
	}
	
	public int getBosrdNo() {
		return bosrdNo;
	}
	public void setBosrdNo(int bosrdNo) {
		this.bosrdNo = bosrdNo;
	}
	public String getBosrdTitle() {
		return bosrdTitle;
	}
	public void setBosrdTitle(String bosrdTitle) {
		this.bosrdTitle = bosrdTitle;
	}
	public String getBosrdContent() {
		return bosrdContent;
	}
	public void setBosrdContent(String bosrdContent) {
		this.bosrdContent = bosrdContent;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return "Board [bosrdNo=" + bosrdNo + ", bosrdTitle=" + bosrdTitle + ", bosrdContent=" + bosrdContent
				+ ", userId=" + userId + ", createDate=" + createDate + "]";
	}
	
}
