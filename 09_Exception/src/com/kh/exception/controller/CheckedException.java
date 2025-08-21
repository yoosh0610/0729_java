package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	/*
	 * CheckedException
	 * 
	 * 문법적으로 반드시 예외처리를 해야하는 예외들
	 * => 주로 외부 매체 입/출력 시
	 */
				   	   // throws 클래스명
	public void method1() throws IOException {
		// 사용자에게 문자열을 하나 입력받아서
		// 입력받은 문자열의 길이를 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		// 방법 1. try ~ catch문을 작성한다.
		/*
		try {
			str = br.readLine();
		//예외처리 하지 않아서(예외처리 하지 않으면 못쓰는 코드)
		} catch(IOException e) {
			e.printStackTrace();
		}
		*/
		// 스케너는 이미 예외처리 되어있음
		
		//방법 2.throws : 코드작성부 말고 메소드를 호출하는 부분으로 예외처리를 위임
		// 나를 부르는 곳에서 예외처리하게끔 한다(던지기)
		System.out.println(str.length());
	}
	
	
	
	
}
