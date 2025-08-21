package com.kh.chap02.model.vo;

public class RiceWineDrinker extends Drinker{
	
	private int age;
	
	public RiceWineDrinker() {}
	public RiceWineDrinker(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override//에노테이션
	public void drink() {
		System.out.println("막걸리를 흔들어 마셔 보아요.");
	}
	@Override
	public void eat() {
		System.out.println("파전을 드셔보아요.");
	}
}
