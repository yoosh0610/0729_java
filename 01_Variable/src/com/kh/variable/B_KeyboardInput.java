package com.kh.variable;

// 1절. import절을 작성해서 어떤 패키지에 존재하는 클래스를 사용할것인지 선언!

import java.util.Scanner;

public class B_KeyboardInput {
	/*
	 * 키보드를 이용해서 사용자에게 값을 입력받을 예정
	 * 자바에서 제공해주는 Scanner라는 클래스를 사용합시다!
	 * Scanner 쿨래스에 존재하고 있는 메소드들을 호출해서 입력을 받을수 있음
	 * 
	 */
	
	public void inputTest() {
		
		// System.out.println("하하호호~");
		
		// 2절. 클래스의 별칭을 지어주면서 new(생성?)를 해줌!
		Scanner sc = new Scanner(System.in);
		// System.in : 표준 입력 도구에서 입력받은 값들을 받겠다.(바이트 단위)
		
		// 원섬후레이즈
		// 사용자에게 주문할 음료를 입력받아서 출력해보자~~~
		
		// 입력받고자 하는 내용을 알려주거나 먼저 질문을 해서 입력을 유도
		System.out.println("원섬 후레이스에 오신 것을 환영합니다.");
		System.out.println("=========메뉴판==================");
		System.out.println("한교동 갈릭쉬림프 프레첼");
		System.out.println("KH정보교육원 A강의실에서 만든 딸기라떼");
		System.out.println("물");
		System.out.println("================================");
		System.out.print("주문하실 메뉴를 입력해주세요 > ");
		
		// next(); : 사용자가 입력한 값 중 공백이 있을 경우 공백문자 이전까지만 입력받음 
		
		String menu = sc.next();
	   // 변수 선언  기준 
		// 사용자가 입력한 메뉴를 출력해주기
		// "물을 주문하셨습니다."
		System.out.println(menu + "를 주문하셨습니다.");
		
		// 몇 잔 이요?
		System.out.print("몇 개 주문하시겠습니까?(숫자로 입력해주세요) > ");
		// nextInt()
		// nextDouble()
		// 변수 선언 방법은?
		// 타입 변수명
		int number = sc.nextInt();
		System.out.println(menu + "를 " + number + "개 주문하셨습니다.");
		
		System.out.print("주소지를 입력해주세요 > ");
		// nextLine() : 사용자가 입력한 값을 공백과 무관하게
		// 				개행문자 이전까지 전체를 다 읽어옴
		// nextLine() : 입력버퍼에서 개행문자 이전까지의 모든 값을 가져온후
		//				입력버퍼에 존재하는 "개행문자"를 날려줌
		
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println(menu + " " + number + "개를 " + address + "로 배달합니다.");
		
		
		
		
		
	}
	
}
