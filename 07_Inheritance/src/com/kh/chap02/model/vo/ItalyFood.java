package com.kh.chap02.model.vo;

public class ItalyFood extends Food {
	
	private int oil;
	
	public ItalyFood() {
		super(); //생략가능
	}
	public ItalyFood(String foodName, String material, int cookingTime, int oil) {
		// 부모 객체의 필드에 값을 대입
		//this.foodName = foodName;
		//super.foodName = foodName;
		//접근제한자가 private이기 때문에 안보임
		//해결방법
		//1. 부모클래스의 접근제한자를 바꿔버림
		// 캡슐화 원칙X => 적합한 방법은 아님
		
		//2. 부모클래스의 접근제한자 public인 setter메소드를 호출
		/*
		super.setFoodName(foodName);
		super.setMaterial(material);
		super.setCookingTime(cookingTime);
		*/
		
		//3. 부모클래스가 가지고있는 매개변수 생성자를 호출
		super(foodName, material, cookingTime);
		this.oil = oil;
		//부모객체가 생성되기 전에 자식객체가 먼저 진행할수 없다.(순서 조심)
	}
	
	
	public int getOil() {
		return oil;
	}
	public void setoil(int oil) {
		this.oil = oil;
	}
	
}
