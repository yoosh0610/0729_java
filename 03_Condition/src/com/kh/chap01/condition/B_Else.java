package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * if~ else
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식) {
	 * 		조건식의 결과가 true였을 때 실행할 코드   		- a
	 * } else(그게 아니고) { 
	 *  	조건식의 결과가 false였을 때 실행할 코드  		- b
	 * }
	 * 
	 * -> 조건식의 결과가 true였을 경우 a를 샐행
	 * -> 조건식의 결과가 false였을 경우 b를 실행
	 */
	
	
	
	public void method1() {
		
		// 사용자에게 정수를 입력받아서 0보다 큰지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 주세요 > ");
		int num = sc.nextInt();
		// System.out.println(num);
		
		//사용자가 입력한 정수가 0보다 클 경우
		if( num >0 ) {
			System.out.println("입력값이 0보다 큽니다!");
		//if( !(num >0) ) {
			//System.out.println(" 0보다 크지 않아요!");		
		} else {
			System.out.println("입력값이 0보다 크지 않습니다!");
		}
	// 세트로 취급해서 if문 종료 후 else문 스코프 뒤로 이동
	// else문 혼자 시작할수 없다
	// if문의 조건식의 결과가 true일 경우 => else블럭을 건너 뜀
	// 불필요한 연산이 줄어듬 => 처리속도가 향상
	
	}
	
	/*
	 * if ~ else if문
	 *  //if문이라 무조건 if로 시작
	 * [ 표현법 ]
	 * 
	 * if(저건식1) {
	 *  	조건식 1이 true일 경우 실행할 코드
	 * } else if(조건식2) {
	 * 		조건식 2이 true일 경우 실행할 코드
	 * } else if(조건식3) {
	 * 		조건식 3이 true일 경우 실행할 코드
	 * } else if(조건식4) {
	 * 		조건식 4이 true일 경우 실행할 코드
	 * } else {
	 * 		앞에서 기술했던 모든 조건들이 false일 경우 실행할 코드
	 * }
	 */
	public void method2() { 
		
		// 정수를 입력받아서 0보다 큰지 / 0인지 / 0보다 작은지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 바람 > ");
		int num = sc.nextInt();
		//(num);
		
		/*
		if( num >0 ) System.out.println("0보다 커요~");
		 if( num ==0 ) System.out.println("0이에요~");
		if( num <0 ) System.out.println("0보다 작아요~");
		*/
		
		/*
		if( num == 0 ) {
			System.out.println("0이에요~");
		} else if( num < 0 ) {
			System.out.println("0보다 작습니다~");
		} else if( num > 0 ) {
			System.out.println("0보다 큽니다~");
		}
		*/
		
		if(num == 0) {
			System.out.println("0이에요~");
		} else if(num < 0) {
			System.out.println("0보다 작습니다~");
		} //else (num > 0) {
			System.out.println("0보다 큽니다~");
		}
	
	
	public void	ageCheck() {
		
		// 사용자에게 나이(정수)를 입력받고
		// 입력받은 나이에 따라서 각기 다른 내용을 출력해주세요.
		// 1 ~ 12  : 어린입니다.
		// 13 ~ 17 : 청소년 입니다.
		// 18 ~	   : 성인 입니다.
		// 0, -    : 외계인입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력 해 주세요 > ");
		int age = sc.nextInt();
		//System.out.println(age);
		
		// 1 ~ age ~12
		// if((1 <= age) && (age < 12))
		
		/*
		if((1 <= age) && (age <= 12)) {
			System.out.println("어린이 입니다.");
		} else if((13 <= age) && (age <= 17)) {
			System.out.println("청소년입니다.");
		} else if(18 <= age) {
			System.out.println("성인입니다.");
		} else
			System.out.println("올바른 값을 입력해주세요.");
		}
		*/
		
		if(age < 0) {
			System.out.println("올바른 값을 입력해주세요.");
		} else if(18 >= age) {
			System.out.println("성인입니다.");
		} else if(age <= 12) {
			System.out.println("어린이 입니다.");
		} else {
			System.out.println("청소년입니다.");
		}	
	}
}
