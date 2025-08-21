package com.kh.chap01.model.vo;

public class Child2 extends Parent{
	private int n;
	
	public Child2() {}
	public Child2(int x, int y,  int n) {
		super (x, y);
		this.n = n;
	}
	public int gerN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	public void printChild2() {
		System.out.println("안녕 나는 두번째 자식클래스 Child2야~");
	}
	
	@Override
	public void print() {
		System.out.println("자식 Child2~~~");
	}
	
}
