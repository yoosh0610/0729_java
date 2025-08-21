package com.kh.chap04.controller;

// 클래스 변수(static)와 상수 필드에 대해서!
public class StaticController {

	// 필드부
	// [ 표현법 ] 
	// 접근제한자 예약어(생략가능) 자료형 식별자
	
	public static String str = "static field"; // static 특 글자가 옆으로 누움
	// String str2;
	// 생성시점 : 프로그램 실행과 동시에 메모리의 static영역에 할당
	// 소멸시점 : 프로그램 종료
	// 객체를 생성을 하지 않고 static 영역에 할당!!	  
	// 변수를 어떻게 선언하느라에 따라 사용할수 있는 범위이 달라짐		  
	// 어떤 영에에 올라가냐에 따라 구분함(명칭이 달라짐)
    
	// static 공유의 개념이 강함
	// 프로그램 실행과 동시에 올려놓고 거기서 값을 공유해서 사용할 목적
				  
	/*
	 * 상수필드
	 * 
	 * [ 표현법 ]              // final, 
	 * public static final(자료형) 상수필드식별자 = 값;
	 * => 예약어 순서는 상관없음 public final static 으로 작성해도 돌아감
	 * => 한 번 지정한 값을 고정해서 쓰겠다. 무조건 초기화를 해야함!!!
	 * 
	 * static : 공유의 목적
	 * final : 한 번 초기화하고 죽었다 깨어나도 안바꾸겠다.
	 * 
	 * 값이 변경되면 큰일나는 고정적인 값들을 메모리()영역에 올려놓고 공유해서 씀
	 * 
	 * 상수 필드 네이밍도 반드시 대문자로 작성해야 함!
	 */
	//public static final String JAVA_VERSION
	
	
	
		
				  
}
