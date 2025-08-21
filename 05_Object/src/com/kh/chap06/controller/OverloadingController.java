package com.kh.chap06.controller;

public class OverloadingController {
	/*
	 * 메소드 오버로딩(Method Overloading) => ☆★☆★면접 단골질문☆★☆★(정적바인딩,동적바인딩차이)
	 * 
	 * - 하나의 클래스 안에 동일한 메소드 식별자로 여러 개의 메소드들을 정의할 수 있는 기술
	 * - 매개변수 자료형의 개수, 순서, 종류 다르게 작성해야함!
	 * - 참고로 매개변수 식별자, 접근 제한자, 반환타입은 메소드 오버러딩에 아무런 영향을 끼치지 않음
	 */
	
	//메소드명은 test로 통일
	public void test() {
		System.out.println("메소드 오버로딩 테스트 1");
	}
	//매개변수로 받아준다
	public void test(int num) { //type == 클래스
		System.out.println("메소드 오버로딩 테스트 2");
	}
	// 기존 메소드랑 매개변수를 다르게 해야한다.
	public void test(String str) {
		System.out.println("메소드 오버로딩 테스트 3");
	}
	
	public void test(int a, int b) {
		System.out.println("메소드 오버로딩 테스트 4");
	}
	//매개변수가 같은 자료형이더라도 개수가 다르면 호출할수 있다
	/*
	public void test(int c, int d) {
		System.out.println("메소드 오버로딩 테스트 5");
	}
	*/
	//개수가 같은 메소드가 존재하면 
	/*매개변수 식별자와는 상관없이
	 * 자료형의 개수, 순서가 동일하기 때문에 구현이 불가능함
	 */
	/*
	public String test(int c, int d) {
	}
	변환형과는 상관없이 매개변수의 개수와 순서응 항상 다르게 작성해야함
	접근 제한자와는 상관없이 매개변수의 개수와 순서를 다르게 작성해야함
	*/
	
	public void test(int a, String b) {}
	public void test(String b, int a) {}	
	//호출하는 시점이 중요함!
	
}
