package com.kh.operator;

import java.util.Scanner;

public class C_Compound {
	/*
	 * 복합 대입 연산자 : "=" 대입연산자
	 * 
	 * 다른 산술연산자와 대입연산자가 결합한것
	 * => 자기 자신의 값과 해당 산술연산을 한 후 그 결과를 자기자신에게 다시 대입하는 용도
	 */
	// +=
	// -=
	// *=
	// /=
	// %=
	
	/*
	 * 예시
	 * 
	 * int endDays = 129;
	 * 
	 * 매일 23시 59분 59초에 실행할 코드 : 
	 * 
	 * endDays = endDays -1;
	 * 
	 * ------------------------
	 * 
	 * endDays -= 1;
	 * 
	 * System.out.println("종강일까지 " + endDays + "일 남았습니다.")
	 * 
	 * 실수를 줄일수 있는 합리적인 방법이기 때문
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 하나만 입력해 주세요 > ");
		int number = sc.nextInt();
		System.out.println(number);
		
		// 사용자가 입력한 정수 값은 알 수 없음
		// 사용자가 입력한 값에서 10을 뺀 값을 출력
		number = number -10;
		System.out.println("10을 감소시킨 정수 값 : " + number);
		
		//복합대입 연산자를 이용하면
		number -= 10;
		System.out.println("20을 감소시킨 정수 값 : " + number);
		// 변수이름만큼 줄일수 있다.
		
		
		
	}
	
}
