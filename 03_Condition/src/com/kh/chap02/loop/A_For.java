package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	public void method0() {
		/*
		System.out.println("월요일 힘내 보아요!");
		System.out.println("월요일 힘내 보아요!");
		System.out.println("월요일 힘내 보아요!");
		// 반복해야 하는 횟수가 328765번이라면...?
		*/ 
		// (~위해, ~동안!)  3가지의 식을 작성(초기식; 조건식; 증감식)
		for(
				int i =0;
				i < 5;
				i++
				) {
			System.out.println("돌려돌려~~");
		}
		
	}
	
	/*
	 * for문 (반복할때 사용)
	 * 
	 * for() {
	 * 
	 * }
	 * 
	 * 괄호안은 반복의 횟수를 지정하는 부분
	 *  초기식; 조건식; 증감식 		세 가지로 이루어짐
	 * 각 식을 세미콜론(;;)으로 구분함
	 * 
	 * [ 표현법 ]
	 * 
	 * for(초기식; 조건식; 증감식) {
	 * 		반복적으로 실행하고자 하는 코드;
	 * }
	 * 
	 * - 초기식 : 반복문을 시작할때 "초기에 단 한번만 실행"될 구문
	 * 			반복을 할때 필요한 변수를 선언하고 초기화 하는 구문(제어변수) => int i = 0;
	 * 
	 * - 조건식 : "반복문이 실행될 조건"을 작성하는 구문
	 * 			조건식의 결과가 true일 경우 반복을 수행
	 * 			조건식의 결과가 false일 경우 반목문을 멈추고 for문 블럭을 빠져나옴 => i <5;(true라서 무한반복)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수에 대입된 값을 증감하는 구문
	 * 			보통 초기식에서 선언된 변수를 가지고 증감식 작성
	 * 			이 때, 보편적으로 증감연산자를 사용함					=> i++
	 * 
	 */
	
	public void method1() {
		// 진~짜 단순하게
		// 1
		// 2
		// 3
		// 4
		// 5
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		System.out.println("1\n2\n3\n4\n5");
		*/
		/*
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
		}
		*/ // if,for문은 무조건 ()안으로 왼쪽부터시작   // Type이 자바에서 가장 중요
		for(/*초기식(1번)*/int i = 1; /*조건식(2번, 5번)*/i <= 5; /*증감식(4번)*/i++) { 
			/*실행하고자 하는 코드(3번)*/System.out.println(i + "번 반복");
		}	
			// 정수형(Type) 변수 i를 선언하고 1이라는 값이 메모리에 올라간다 - 처음 한번만 실행
			// 조건식의 결과값이 true일 경우 반복적으로 실행하고자 하는 코드로 이동한다
			// 실행후 증감식으로 이동해서 값이 증감된다
		    // 값이 증감되 후 조건식으로 이동한다 	- 이후 반복(2->3->4->2->3->4... 반복)
			// 조건식의 결과값이 false일 경우 for문 밖 스코프({})로 이동한다
			
	
			// for문은 무적이 아님(필수X), 극한의 상황 아니면 사용X
		// 자 그러면 짜잘짜잘이들
		// for문을 이용해서 반복을 3번 한다고 가정
		// 단순한 무조건 for문의 자료형과 변수는 int와 i로 쓴다.(i, j, k)
		// 초기화는 보편적으로 0으로 사용 - 컴퓨터는 수의 시작을 0부터 시작하기 때문
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
		}
				// i+=2(2씩 증가) i+=3(3씩증가)
		for(int i = 0; i < 5; i+=2) {
			System.out.println(i);
		}
		System.out.println("----------------------------");
		
		for(int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		// 감소하면서 반복도 가능
		
	}
	
	public void gugudan() {
	
		// 구구단 프로그램
		//
		// 사용자에게 정수를 입력받아서
		// 사용자가 입력한 정수를 이용해서 구구단을 출력해보기
		
		// ※ 구구단 프로그램 ※
		// 몇 단을 출력하시겠습니까? -> 8
		// 8단을 출력하겠습니다
		// 8 X 1 = 8
		// 8 X 2 = 16
		// ...
		// 8 X 9 = 72
		
		// 베이스를 먼저 생각(for문을 생각하고 코드를 생성하면 X) 출력결과을 먼저 생각(문법에 직찹X)
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("※ 구구단 프로그램 ※");
		System.out.print("몇 단을 출력하시겠습니까? > ");
		int dan = sc.nextInt();
		System.out.println(dan + "단을 출력하겠습니다.");
		// 설계(써보고 이해를 해보고) 
		// 5단이라고 입력했다고 가정
		/*
		System.out.println(dan + " X 1 = "	+ (dan * 1));	
		System.out.println(dan + " X 2 = "	+ (dan * 2));
		.....
		System.out.println(dan + " X 9 = "	+ (dan * 9));
		*/  	//고정			   변수      고정     변수
		// 중복은 빼고 아닌 부분은 변수로 빼낸다
		
		
		for(int i =1; i <=9; i++) {
			System.out.println(dan + " X " + i + " = "	+ (dan * i));
		}
	}
	
	public void method2() {
	
		// ★★★
		// ★★★
		// ★★★
		/*
		System.out.println("★★★");
		System.out.println("★★★");
		System.out.println("★★★");
		
		System.out.print("★");
		System.out.print("★");
		System.out.print("★");
		System.out.println("");
		System.out.print("★");
		System.out.print("★");
		System.out.print("★");
		System.out.println("");
		System.out.print("★");
		System.out.print("★");
		System.out.print("★");
		*/
		
		/*
		for(int i =0; i < 3; i++) {
		 	System.out.print("★");
		}
			System.out.println();
		for(int i =0; i < 3; i++) {
		 	System.out.print("★");
		}
			System.out.println();
		for(int i =0; i < 3; i++) {
		 	System.out.print("★");
		}
		*/
		
		for(int i =0; i < 3; i++) {
			for(int j =0; j < 3; j++) {
				System.out.print("★");
			}
		System.out.println();
		}
		
		// 출력 : X번째 반복입니다.
		//		10번째 반복마다 ♥를 하나씩 찍어주기
		//         (조건)
		for(int i = 0; i < 100; i++) {
			System.out.println((i +1) + "번째 반복입니다.");
			
			// (i + 1) == 10 || (i + 1) == 20 || (i + 1) == 30
			// (i + 1) % 10 == 0
			
			if((i + 1) % 10 == 0) {
				System.out.println("♥");
			}
		}
	}
	
	public void method3() {
		
		for(;;) { // (초기식;조건식;증감식) 아무것도 없으면 무한히 반복
			System.out.println("구구단 프로그램 ~~~");
			System.out.println("1. 구구단 프로그램 시작하기");
			System.out.println("2. 구구단 프로그램 설명보기");
			System.out.println("참 재미있어용");
		
		// 내가 종료하기 전까지 프로그램 실행시키기
		
			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴를 선택해주세요 > ");
			int menuNo = sc.nextInt();
			sc.nextInt();
		
			if(menuNo == 1) {
				gugudan();
			} else if(menuNo == 2) {
				System.out.println("구구단을 동작시켜줘용");
				System.out.println("참 재미있어용");
			} else if(menuNo == 3) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
			System.out.println("이런 메뉴는 없어요~~");
			}
		}
	}
}
