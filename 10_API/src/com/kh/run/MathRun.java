package com.kh.run;

//import java.lang.*

public class MathRun /*extends Object*/ {

	public static void main(String[] args) {
		
		// API
		// ApplicationProgramInterface - 응용프로그램 만들때 사용하는 프로그램
		// 문자열은 보통 파이날붙은 차형데이터의 배열 저장
		
		// Java API
		// 자바에서 코드짤때 도움을 주는 프로그램
		// String 바이트(byte)형 배열
		
		// Math 클래스(수학)
		
		//Math math = new Math();//안보여,, 접근제한자가 private이라서, 상수필드라 static영역
		//Math.random();  
		/*
		 * - 모든 필드와 메소드가 전부 다 static
		 * - 객체를 생성할 필요가 없으므로 기본생성자의 접근제한자가 private
		 * - java.lang
		 */
		// 필드
		// 파이 => Math클래스 내에 상수필드로 정의되어 있음
		System.out.println(Math.PI);
		
		// 메소드
		// 1. 제곱 => Math.pow()
		System.out.println("3의 13제곱 : " + Math.pow(3,13));
		
		// 2. 절대값 => Math.abs(int, double, long, float)
		System.out.println("절대값 : " + Math.abs(-33));
		
		double num = 8.141414;
		
		// 1. 올림 => Math.ceil(double) : double
		System.out.println("올림 : " + Math.ceil(num));
		
		//버림 =>  Math.floor(double) : double
		System.out.println("버림 : " + Math.floor(num));
		
		// 반올림 =>  Math.round(double) : long 
		System.out.println("반올림 : " + Math.round(num));
		
		
		
	}

}
