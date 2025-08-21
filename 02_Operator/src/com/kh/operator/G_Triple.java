package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 * 삼항 연산자 :  피 연산자가 3개 => 값 3개와 1개의 연사자로 이루어짐(조건문의 형식으로 쓰임)
	 * 
	 * 조건문 : 값에 따라 연산을 처리하는 방식
	 * 		  결과값이 true일 경우 첫 번째 문장을 처리~~		
	 * 		  결과값이 false일 경우 두번째 문장을 처리~~
	 * 
	 * [ 표현식 ]
	 * 조건식 ? 조건식이 ture일 경우 결과값 : 조건식이 false일 경우 결과값  
	 */
	
	// 원섬후레이스
	public void method1() {
		System.out.println("시즌 메뉴판 : ");
		System.out.println("1. 더 멜론 오브 프라푸치노");
		System.out.println("2. 자몽 망고 코코 프라푸치노");
		System.out.println("3. 카페 브뤨레 프라푸치노");
		
		// 메뉴번호 가지고 주문받기
		
		// Ctrl + Shift + o  --> import 자동완성 단축키
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴 번호를 입력해주세요 > ");
		int menuNo = sc.nextInt();
							   // 조건식 
		String selectedMenu = (menuNo == 1) ? "1.더 멜론 오브 멜론 프라푸치노를 주문하셨습니다."
							: (menuNo == 2) ? "2. 자몽 망고 코코 프라푸치노를 주문하셨습니다."
							: (menuNo == 3) ? "3. 카페 브뤨레 프라푸치노를 주문하셨습니다."
							: "없는 메뉴를 주문하셨습니다.";
		// 조건식 ? 조건식이 true일 경우 결과 값 : 조건식이 false일 경우 결과 값
		//  (조건식 실행 후 :을 기준으로 true면 왼쪽, false면 오른쪽이 값으로 대입)
		System.out.println(selectedMenu);

		// 선택한 번호에 따라 메뉴명을 출력
		// 1번 입력 시 == "더 멜론 오브 멜론 프라푸치노를 주문하셨습니다"
		// 다시 menuNo를 사용할수없다.
	
		
		// 메소드를 호출한다 -> 프로그램을 실행시킨다
		// 컴퓨터에게 명령하는것(작성하는것) -> 소스코드
		// 컴퓨터가 인식하게 바꿔 주는것 -> 컨파일러
		// 컴퓨터가 실행 할 수 있게 된 소스코드 -> 프로그램
		// 컴퓨터가 실행하는것 -> 프로그래밍
		// 프로그램을 실행해서 메모리에 올라간 것 -> 프로세서(process)
		/*
		메인에서 호출한 것은 static
		메인말고 다른 곳에서 호출한것 stack
		*/
				
		}
	//홀짝 구하기
	public void method2() {
				
	// 사용자에게 정수 값을 하나 입력받아서 
	// 입력받은 정수가 홀 / 짝 판별해서 출력
				
	// 입력도구 별칭 짖기
	Scanner sc = new Scanner(System.in);
				
	//필요한 값을 입력받을 수 있도록 메시지 출력
	System.out.print("숫자를 입력해 주세요 > ");
		
	// 정수형 변수를 선언란 뒤 스캐너의 메소드를 호출해서 입력 버퍼에 있는 정수값을 받아와서
	//전수형 변수 공간에 초기화
	
	int num = sc.nextInt();
	// System.out.println("착하게 사는법 : 변수값 찍어보기 > " + num);
	
	// num % 2 != 0  홀
	// num % 2 == 1  홀
	// num % 2 == 0  짝
	
	// ((num % 2) == 0) ==> 연산(판별)은 이걸로 결정
	
	char oddEven = ((num % 2) == 0) ? '짝' : '홀';	
	
	System.out.print("입력하신 "+ num + "은(는) " + oddEven + "수 입니다.");	
	}
	
	public void test() {
		// 사용자에게 알파벳 한 글자를 입력받아서
		// 입력받은 알파벳이 소문자인지 / 대문자인지 판별 후 출력해주세요.
		
		// 출력형식
		// XXX(사용자가 입력한 알파벳)은 소문자 / 대문자 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 한 글자만 입력해주세요 > ");
		
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch);
		
		// ch == 'a'~~'z' || 'A'~~'Z'
		// 'a' <= ch <= 'z'  == 소문자
		
		
		
		char result = (('a' <= ch) &&(ch <= 'z')) ? '소' : '대';
		System.out.println(ch + "는 "+ result + "문자입니다.");
	}
	
}
