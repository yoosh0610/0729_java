package com.kh.chap01.abstraction.vo;
/*
 * public class 클래스식별자 { 
 * 
 *  // 필드부
 * 
 *  // 생성자부
 *  
 *  // 메소드부
 * 
 * }
 */
public class Puppy {
	
	// [ 필드부(속성) ] 값을 저장하기 위한 공간(변수와 비슷한 개념?)
	// 접근제한자 자료형 필드식별자;
	
	// 접근제한자 : 이 필드에 접근할 수 있는 접근권한을 제어하는 역할
	//			 public > protected > default > private
	// 클래스 내부에 필드를 선언할 때 반드시 접근제한자를 붙일 것!!
	
	// 종, 이름, 나이, 성별, 색상, 몸무게
	public String species;
	public String name;
	public int age;
	public String gender;
	public String color;
	public int weight;
	
	// [ 생성자부 ]
	
	// [ 메소드부 ]
	// 클래스 -> 대상이 수행 할수있는 기능이 들어가야 함(기능들을 묶어줌)
	public void sniff() {
		System.out.println(name + "가 킁킁거리며 냄새를 맡습니다.");
	// 객채의 관점
		
	// 내부적 관점
	//  - 그냥 사용 가능 얼마든지
	// 외부적 관점
	}
	public void bark( ) {
		// 계속하다보면 몸무게 값이 -가 나오니까 제한을 걸어주기 
		if(weight > 15) {
		System.out.println(name + "가 멍하고 짖습니다.");
		weight = weight - 5;
		} else {
			System.out.println("너나 짖어라 ~");
		}
	}
	
	
	
	
}
