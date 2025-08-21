package com.kh.chap03.escape;

import java.util.Scanner;

public class B_Continue {

	/*
	 * continue : 반복문 안에서 사용하는 문법
	 * 
	 * continue문을 만나면 continue 이후에 어떤 코드가 존재하던 실행하지 않고 pass
	 * 반복문 scope 최상단으로 올라가는 것을 의미
	 */
	public void method1() {
		
		// 1부터 10까지 반복을 하면서 정수값을 출력하는데
		// 홀 수 일때만 출력
		for(int i = 1; i < 10; /*i+=2*/ i++) {
			//if(i % 2 == 1)
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		} //continue 나오는 구간 -> 무시하고 다음 실행하는 코드식으로
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원가입 서비스입니다.");
		
		while(true) {
			System.out.print("아이디를 입력해 주세요(10자 이하) > ");
			String userId = sc.nextLine();
			
			if(userId.length() > 10) {
				System.out.println("아이디는 10자 이하만 사용 가능합니다.");
				continue;
			} else {
				System.out.println("사용 가능한 아이디입니다.");
				break;
			}
		}
		System.out.println("어쩌고 저쩌고 ~~");
	}
	
}
