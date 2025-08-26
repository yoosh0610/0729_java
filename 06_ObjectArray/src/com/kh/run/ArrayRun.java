package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class ArrayRun {

	public static void main(String[] args) {
		
		// 배열의 특징 => 자료구조에 대해서 물어보는거니까
		
		// 논리적인 구조와 물리적인 구조가 동일하다.
		// 같은 자료형끼리만 담을수 있다 => 동등 모음(homogeneous vowels)
		// 하나의 배열에 여러 값을 담을 수 있음
		// 메모리상에 공간
		// 참조자료형
		// 인덱스개념이 존재함
		// 배열은 변수의 나열이다.
		// 명확한 크기를 명시해야함 => 크기를 바꾸는 것은 불가능함
					   //객체
		//int[] nums = new int[3];
		//String[] strs = new String[3];
		// 자바에서 기본자료형을 제외한 나머지는
		// 전부 참조자료형
		// 참조자료형 공간에 대입될수 있는 값은 오로지 주.소.값.
		
		//객체배열의 선언 및 할당!
		// [ 표현법 ]
		// 기본자료형[] 배열식별자 = new 기본자료형[배열크기]; => 배열
		// 참조자료형[] 배열식별자 = new 참조자료형[배열크기]; => 객체배열
		
		Restaurant[] restaurants = new Restaurant[3];
		Scanner sc = new Scanner(System.in);
		                 //생성자호출
		for(int i = 0; i < restaurants.length; i++) {
			System.out.print("상호명를 입력해주세요 > ");
			String storeName = sc.nextLine();
			
			System.out.print("주소지를 입력해주세요 > ");
			String address = sc.nextLine();

			System.out.print("대표메뉴를 입력해주세요 > ");
			String mainMenu = sc.nextLine();
			
			restaurants[i] = new Restaurant(storeName, address, mainMenu);
		}
		//System.out.println(restaurants[0]);
		// 우리는 주소값을 확인하고 싶었던 것은 아님
		//System.out.println(restaurants);
		// 배열의 주소값
		//System.out.println(restaurants[0]);
		// 0번 객체의 주소값
		//System.out.println(restaurants[0].getMainMenu());
		/*
		// 0번째 객체의 모든 정보
		System.out.println(restaurants[0].information());
		// 인덱스만 바꿔 출력할수 있다.
		System.out.println(restaurants[1].information());
		System.out.println(restaurants[2].information());
		*/
		for(int i = 0; i < restaurants.length ; i++) {
			System.out.println(restaurants[i].information());
		}
		// 확장성이 좋아진다(갯수의 증가에 용이) => 유지보수 효율 좋다
		// 가시성이 좋다(알아보기 쉽게)
		// 짧게 쓴다고 좋은게 아니라 좋게 쓰다보면 짧아짐
		// 반복문을 사용할 수 있다는게 가장 큰 장점
		
		System.out.println("상호명을 입력해주세요 > ");
		String searched = sc.nextLine();
		
		for(int i = 0; i < restaurants.length ; i++) {
			if(searched.equals(restaurants[i].getStoreName())) {
				System.out.println("대표메뉴 : " + restaurants[i].getMainMenu());
			}
		}
	}
}
