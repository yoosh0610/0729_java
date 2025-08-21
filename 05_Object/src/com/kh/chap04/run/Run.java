package com.kh.chap04.run;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.chap04.controller.FieldController;
import com.kh.chap04.controller.StaticController;

public class Run {
		 // ↓ 예외 얘만 혼자 다른 영역에 올라감
	public static void main(String[] args) { 

		System.out.println(StaticController.str);
		
		FieldController fc = new FieldController();  // <= 용도 자료형으로 사용하려고
		// 1. FieldController자료형으로 fc라는 이름의 지역변수를 선언
		// 2. 객체 생성 (new키워드를 만났을때) global 맴버변수 할당 ????
		// 3. 주소값을 대입
		
		System.out.println(fc.global);
		
		fc.checkVariable(50);//메소드가 stack영역에 올라감
		// 색깔로 구분
		// 필드는 파란색 지역변수는(변수명) 갈색
		// 메소드 호출 전제조건 개체가 생성되어야 함
		// checkVariable호출 == paramter(매개변수) 할당 및 초기화
		
		//checkVariable 호출 종료 시
		//paramter, local 지역변수 소멸
		//global은 존재
		
		fc = null; // <-heap영역도 지워버림 // global 사용불가
		//System.out.println(fc.global);
		
		// 목표 : str 출력하기
		// 객체생성
		/*
		StaticController sc = new StaticController();
		System.out.println(sc.str);
		*/
		System.out.println(StaticController.str);
		//System.out.println(StaticController.JAVA_VERSION);
		
		// System.out.println(Arrays.toString(new int[2]));    static(글자가 누움)
		//System.out.println(Math.random()); // 0.0 ~ 0.9999~  static(글자가 누움)
		//System.out.println(Math.PI); 		  static(글자가 누움),final(글자가 두거움)
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.nextLine();
		
		/*
		 * AccessModifier(접근제어자 / 접근제한자) 범위 순으로
		 * 
		 * (+)public => 어디서든(같은 패키지, 다른 패키지, 클래스 내/외부 포함 전부) 접근 가능
		 * 
		 * (#)protected => 같은 패키지라면 무조건 접근 가능
		 * 			=> 다른 패키지라면 상속구조인 클래스에서만 접근 가능
		 * 			=> 상속이라는 개념은 05_Object / 06_ObjectArray 끝나고 07번에서 배울 것
		 * 
		 * (~)default(package friendly) => 오로지 같은 패키지에서만 접근 가능
		 * 							아무것도 안붙이면 default
		 * 
		 * (-)private => 오직 클래스 내부에서만 접근 가능
		 * 클래스 다이어그램에서는 기호로 사용됨.
		 */
	}

}
