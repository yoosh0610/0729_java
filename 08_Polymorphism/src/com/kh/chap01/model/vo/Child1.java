package com.kh.chap01.model.vo;

public class Child1 extends Parent{
	//필드부
	// int x, int y
	
	private int z;
	
	public Child1() {}
	public Child1(int x, int y, int z) {
		super (x, y);
		this.z = z;
	}
	public int gerZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public void printChild1() {
		System.out.println("안녕 나는 첫번째 자식 클래스 Child1야~");
	}
	
	@Override
	public void print() {
		System.out.println("자식 Child1이얌~");
	}
	
}
