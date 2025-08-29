package com.kh.chap04.controller;
/*
 * 필드(field) == 멤버 변수 == 인스턴스 변수
 * 
 * 클래스를 구성하는 요소 중 하나
 * 데이터를 저장하기 위한 역활(변수) //변수선언 영역은 {}(스코프)안에
 * 클래스 내부에 정의하지만 메소드 영역 밖에 존재
 * 
 * 변수 구분 //자바는 전역변수 개념은 없음 (전역변수역활을 하는 친구는 존재)
 * - field : 클래스 블록(Scope)에 바로 선언하는 변수(지역변수)
 * - (local) variable : 클래스 영역 내부에 특정한 구역!! 에서 선언됨({})
 * 						=> method, for, if 등등...
 * 
 * 1. 전역변수의 역활을 하는 친구들
 *   //클래스내부에선 전역에서 사용가능
 * - 필드(맴버변수, 인스턴스변수) : 
 * 							생성시점 => new 키워드 사용해서 해당 객체를 생성하는 순간 heap에 할당
 * 							소멸시점 => 객체가 소멸될 때(연결을 끊어 줄 수 있지만 언제 사라질지 모름)
 * 							  	=>G.C가 일을 안하면 OOM(Out Of Memory) 발생
 * 
 * - 클래스 변수(static) : static이라는 예약어가 붙어있는 변수
 * 						생성시점 : 프로그램 시작과 동시에 static영역에 올라감
 * 						소멸시점 : 프로그램 종료되면 소멸
 * (static이 붙어있음)
 * 
 * 2. 지역 변수
 * 			생성시점 : 특정 ( { } ) 내부에서 선언되는 시점에 메모리 영역에 할당 -> stack
 * 			생성시점 : 특정 ( { } )이 종료될 때
 * 
 */
public class FieldController {
	
	// 필드 선언!
	public int global;
							// ↓강제성 형성-무조건 정수값을 전달
	public void checkVariable(int paramter) {
		// local(지역변수) 할당 및 초기화
		int local = 1;  // 지역변수 특 : 초기화 안하면 사용할 수 없음
		
		System.out.println(global);			//필드, 맴버변수
		System.out.println(paramter);		// 매개변수(지역변수)
		System.out.println(local);			// 지역변수(초기화 이후)
		
	}
	
	

}
