package com.kh.plant.model.vo;


// Model : 데이터 관련 작업
// Vo : 프로그램 실행 중 만들어진 값(Value) 를 담는 객체(Object)

public class Plant {
	private String name;
	private String type;
	
	// VO 만들기 졸업
	// 기본생성자, 매개변수생성자, getter, setter, toString
	// Alt + Shift + s => o => Alt + d => Alt + g
	public Plant() {
		super();
	}
	// Alt + Shift + s => o => Alt + g
	public Plant(String name, String type) {
		super();
		this.type = type;
		this.name = name;
	}
	
	// Alt + Shift + s => r => Alt + a => Alt + r
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Alt + Shift + s => s => Alt + g
	@Override
	public String toString() {
		return "Plant [name=" + name + ", type=" + type + "]";
	}
	
	
	
}
