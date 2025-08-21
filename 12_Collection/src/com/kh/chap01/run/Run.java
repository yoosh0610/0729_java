package com.kh.chap01.run;

import com.kh.chap01.controller.Integers;

public class Run {

	public static void main(String[] args) {
		
		// 정수 값을 여러 개 다루고 싶음. 정확하게 몇 개의 정수를 다룰지 알 수 없음
		/* 배열은 크기가 정해져있어 나중에 수정할수 없다 
		int[] integers  = new int[3];
		integers[0] = 1;
		integers[1] = 5;
		integers[2] = 6;
		*/
		
		Integers integers = new Integers();
		integers.add(10);
		integers.add(60);
		integers.add(30);
		integers.add(20);
		integers.add(60);
		integers.add(30);
		integers.add(20);
		
		int element = integers.get(2);
		
		System.out.println(element);
		//n번째 요소를 불러오고싶다.
		
		System.out.println(integers);
		//배열의 크기보다 큰 배열이라 새로만들어야 함(기본 값은 지워져서 값을 똑같이 넣어줘야함)
		//배열의 크기보다 큰 배열을 넣으려면 깊은복사로 해줘야함
		
		
		// 정수가 아니라면(영어단어)
		// 추상적자료형(자바를 많이 다루는 이유)
	}

}
