package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	/*
	 * (단일) if문 (만약에~~라면)
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식) {
	 * 
	 * 		조건식이 true일 경우 실행하고자 하는 코드;
	 * }
	 * 
	 * => 조건식의 결과가 true일 경우 : if문 Scope({})안의 코드가 수행
	 * => 조건식의 결과가 false일 경우 : if문 Scope({})를 건너뜀!
	 */
	public void method1() {
		
		// System.out.println("모범시민 맞다~");
	 //무조건 ↓를 봄
		if(0 < 1) {
			System.out.println("0이 1보다 작아용");			
		}
		
		// if문의 조건식자리에는 결론적으로 true 아니면 false값이 들어가도록 만들어야 함!
		if(false) {
			System.out.println("애는 죽어다 깨나도 안나옴");
		}
		if(true) {
			System.out.println("조건식 자리에는 최종적으로 true가 와야 함");
		}

	}
	
	public void method2() {
		
		boolean loginCheck = true; // 로그인 상태를 저장해둔 변수
		
		if(!loginCheck) {
			System.out.println("네이버를 더 안전하고 편리하게 이용해보세요.");
			System.out.println("NAVER 로그인");
			System.out.println("아이디 찾기 | 비밀번호 찾기 | 회원가입");
		}
		
		if (loginCheck) {
			System.out.println("홍길동님 환영합니다 :)");
			System.out.println("메일 | 카페 | 블러그 | 쇼핑 | 예약");
		}
		// 복습!!!
	}
	
	public void lunchMenu() {
		
		// 오늘의 날씨를 입력받아서
		Scanner sc = new Scanner(System.in);
		
		// 더움 / 맑음 / 비옴
		System.out.print("오늘의 날씨는 어떤가요(더움 / 맑음 / 비옴) > ");
		String weather = sc.nextLine();
		//System.out.println(weather);	
		// 점심 메뉴를 추천해주는 프로그램
		// 비옴을 이력했다면 김밥천국을 가라고 하자
		
		// 사용자가 입력한 값과 "비옴"이라는 문자열값을 동등비교해서 일치하는지 비교
		// weather 동등비교(==) "비옴"
		//System.out.println(weather == "비옴");
		// 문자열값 비교
		// 동등비교연산자(==)를 사용할 수 없음
		// .equals()를 호출해야 함
		//System.out.println(weather.equals("비옴"));
		
		// 조건
		// 만약에 사용자가 입력한 문자열이 "비옴"과 일치한다면
		// if      weather          "비옴"   .equals()
		// 김밥천국
		
		if(weather.equals("비옴")) {
			System.out.println("김밥천국에서 스페셜정식 드세요~");
		}
							// 조건식은 연산(여기서 연산은 비교)
		//만약에 사용자가 입력한 문자열이 "더움"과 일치하다면
		if(weather.equals("더움")) {
			System.out.println("김밥일번가에서 냉모밀 드세요~");
		}
		
		// 만약에 사용자가 입력한 문자열이 "맑음"과 일치한다면
		if(weather.equals("맑음")); {
			System.out.println("청개천에서 도시락 드세요~");	
		}	
	}
	
	public void method3(){
		
		// 사용자에게 정수값을 입력받아서 
		// 홀 / 짝을 판별 => 출력
		// if문을 이용해서 출력!
		// 단, 입력받은 정수가 0보다 클 경우에만 조건문을 실행!
		// 			(조건)      ==> if
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0보다 큰 정수 주세요 > ");
		int number = sc.nextInt();
		// System.out.println(number);
		// 조건식은 비교연산(값, 으로 만든다
		// 조건식
		// 1. 입력받은 정수가 0보다 클 경우에만
		//		number > 0
		//					&&
		//2. 홀 / 짝
		// 입력받은 정수를 2로 나눈 나머지를 0과 동등비교해서 
		// 	number  %   2 	== 		0  짝수(true 일 때)
		// 	number  %   2	== 		0  홀수(true 일 때)
		
		if(number % 2 == 0 && number > 0){ System.out.println("짝수");}
		if(number % 2 != 0 && number > 0) System.out.println("홀수");
			//스코프({}) 안에 하나의 주문만 있드면 스코프 안쓸수도 있다
		
		boolean flag = number > 0;
		
		if(flag && number % 2 == 0){ System.out.println("짝수");}
		if(flag && number % 2 != 0) System.out.println("홀수");
			//이렇게 줄일 수 있다.
		//개발자는 처음부터 줄이는 걸 생각하는게 아니라 구연 먼저 한후
		// 줄이는걸 생각한다.(수정, 유지보수)
		
		//if문 중첩
		if(number > 0) {
			if(number % 2 == 0) System.out.println("짝수");
			if(number % 2 != 0) System.out.println("홀수");
		}
	}
	
	
	public void method4() {
		
		// 1. 메뉴번호로 메뉴 입력받기
		// 출력문 == System.out.println();
		
		System.out.println("술집메뉴");
		System.out.println("1. 맥주 (5000원)");
		System.out.println("2. 소주 (3000원)");
		System.out.println("메뉴를 번호로 선택해주세요 > ");
		
		// 2. 메뉴번호로 메뉴 입력받기
		// Scanner사용해서 nextInt();
		Scanner sc = new Scanner(System.in);
		int menuNo = sc.nextInt();
		//System.out.println("선택한 메뉴 번호 : " + menuNo);
		
		// 3. 수량 입력받기
		// Scanner사용해서 nextInt();
		System.out.println("몇 잔 주문하실건가요? > ");
		int cup = sc.nextInt();
		//System.out.println("입력한 잔 개수 : " + cup);
		
		// 4.조건문
		// if문을 이용해서 입력한 메뉴번호 따라 메뉴명 대입하기
		// 혹시 없는 메뉴 번호를 입력했다면 없는 메뉴라고 대입하기
		// 만약에 사용자가 입력한 메뉴번호가 1번이라면
		// 	if 				menuNo  ==  1
		String menuName = "";
		if(menuNo == 1) menuName = "맥주";
		if(menuNo == 2) menuName = "소주";
		if(!(menuNo == 1) && !(menuNo == 2)) menuName = "없는 메뉴";
		
		// 5. XXXX메뉴를 XXX잔 주문하셨습니다. 출력해주기 println();
		System.out.println(menuName+ "를(을) " + cup + "잔 주문하셨습니다.");
		
		// 6. 진짜 주문할건지 물어보기
		// Y / N 입력받아서 확인하기
		System.out.println("\n위 주문내역으로 주문하시겠습니까? ( Y / N )");
		sc.nextLine();
		char answer = sc.nextLine().charAt(0);
		System.out.println(answer);
		
		// 7. 6번에서 입력받은 단일 문자가 'Y'또는'y'와 일치한다면
		// 메뉴명과 수량과 가격 출력하기 if문 + 중첩 if문 + 출력문
		if(answer == 'Y' || answer == 'y') {
			int price = 0;
			if(menuNo == 1) price = 5000;
			if(menuNo == 2) price = 3000;
			System.out.println("총 결제금액은 " + (price * cup) + "원 입니다.");
		}
	
		
	}
	
	
}
