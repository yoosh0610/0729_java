package com.kh.chap01.model.vo;

public class Parent {
	//필드부
	private int x;
	private int y;
	
	// 생성자부
	public Parent() {}
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 메소드부
	public int gerX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int gerY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void printParent() {
		System.out.println("안녕 나는 부모클래스야~");
	}
	
	public void print() {
		System.out.println("나는 부모~");
	}
	
}
