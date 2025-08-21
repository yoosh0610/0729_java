package com.kh.chap02.model.vo;
	// 자바에서의 상속은 자식이 부모를 정함
	// 클래스명 extends 부모클래스 - 영어는 뒤에서부터
	// 			부모클래스			자식블래스
	// 			슈퍼클래스			서브클래스
	// 			상위클래스			하위클래스
	// 			조상클래스			후손클래스
	// 			확장클래스			파생클래스
public class KoreaFood extends Food {
	// 필드부
	// foodName, material, cookingTime, spicy
	// [	Food 클래스가 가지고 있음   	  ]
	private int spicy;
	
	// 생성자부
	public KoreaFood() {
		// 생략
		super/*new Food*/(); // super : 부모객체의 주소값을 의미하는 키워드
		//부모클래스가 먼저 heap영역에 생서후 주소값을 가르키고 있음
		System.out.println("응애 나 자식");
	}
	
	// 메소드부
	public int getSpicy() {
		return spicy;
		}
	
	public void setSpicy(int spicy) {
		this.spicy = spicy;
		}	
	// 자식 객체에 메소드가 없으면 부모 객체가 가지고 있는 메소드를 호출
	
	
	
}
