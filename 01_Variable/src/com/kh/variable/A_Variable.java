package com.kh.variable;

public class A_Variable {
	
	// 변수 : Memory(저장장치,Ram)에 값을 저장하기 위한 공간 , 변하는 값X(전혀 다름)
	
	//변수를 사용하면 뭐가 좋을까 ??
	
	// 원섬플레이스 키오스크(시즌 메뉴)
	public void findSeasonMenu() {
		
		// 1. 시즌 메뉴들을 출력(메뉴명, 가격)
		// 2. 사용자가 메뉴판을 보고 주문을 했다 가정
		// 3. 고객이 구매한 메뉴의 가격을 출력
		
		System.out.println("---변수를 사용하기 전 ---");
		System.out.println("시즌 메뉴 : ");
		//System.out.println("1. 딸기라떼(6700)");
		System.out.println("1. 한교동 갈릭쉬림프 프레첼(1800)");
		System.out.println("2. 요거 젤리 소다 플렛치노(3900)");
		System.out.println("3. 케로케로케로피 멜론라떼(4200)");
		
		// 가정
		// 딸리라떼를 25잔 시킴
		// 케로케로케로피 멜론라떼 30잔 시킴
		
		System.out.println("----------------");
		//System.out.println("딸기라떼를 25잔 시켰습니다.");
		System.out.println("한교동 갈릭쉬림프 프레첼을 17개 시켰습니다.");
		// 주문가격 => 165000원
		// 메뉴가격 X 개수
		// 자바에서 곱하기 연산을 해야하는 경우
		// * 기호를 사용한다.
		// 167500원 입니다.
		//System.out.println(6700 * 25);
		//System.out.println("원 입니다.");
		
		// 자바에서 문자열 값과 다른 형태의 값을 붙여서 사용하고 싶은 경우
		// + 기호를 사용한다.
		//System.out.println((6700 * 25) + "원 입니다.");
		System.out.println((1800 *17) + "원 입니다.");
		
		//출력문을 두번 작성하여
		//다음과 같이 출력하시오.
		// ↓
		// 케로케로케로피 멜론라떼 30잔을 시켰습니다.
		// (메뉴가격X 개수)원 입니다.
		
		System.out.println("---------------");
	    System.out.println("케로케로케로피 멜론라떼 30잔 시켰습니다.");
	    System.out.println((4200 * 30) + "원 입니다.");
		
		System.out.println("==================");
		
		System.out.println("변수를 사용해 봅시다!");
		
		System.out.println("시즌 메뉴 : ");
	    // 메뉴명과 가격이라는 값을 담을 공간
		//즉, 변수를 선언라고 변수공간에 값을 대입해서 사용
		String seasonMenu = "KH정보교육원 A강의장에서 만든 딸기라떼";
	           //변수식별자(공간의 이름)
		int price = 6700;
		
	    /*
	    System.out.println("1. KH정보교육원 A강의장에서 만든 딸기라떼 (6700)");
	    System.out.println("KH정보교육원 A강의장에서 만든 딸기라떼 17개를 시켰니?");
	    System.out.println("가격은 " + (6700*17) + "원 입니다.");
	    System.out.println("KH정보교육원 A강의장에서 만든 딸기라떼 17개를 시켰니?");
	    System.out.println("가격은 " + (6700*12) + "원 입니다.");
	    */
	    
	    System.out.println("메뉴명 : " + seasonMenu);
	    System.out.println("가격 : " + price);
	    System.out.println(seasonMenu + "를 17개 시켰니?");
	    System.out.println((price * 17) + "원 입니다.");
	    System.out.println(seasonMenu + "를 12개 시켰니?");
	    System.out.println((price * 17) + "원 입니다.");
	    
	    /*
	     *  변수를 사용했더니 ?
	     *  
	     * 1. 단 한번 값을 대입해서 필요한 순간마다 다시 사용할 수 있음
	     *    => 재사용성이 높아짐
	     * 2.값에 의미를 부여할 수 있음
	     *    => 가독성이 높아짐
	     *    
	     * 가독성과 재사용성이 높아지면 유지보수가 용이해짐  
	     */   
	}
	
	//변수 선언 사용 방법에 대해 알아봅시다.
	public void declareVariable() {
		/*
		 * 변수 선언 방법
		 * 
		 * int price;
		 * 
		 * 자료형(DataType) 변수식별자;
		 * 권장하는 방법은 아니지만 동일한 타입의 변수를 선언할 때는 한번에 선언 가능
		 * int a, b, c; <-- 권장하지 않음
		 * 변수를 선언라고 난 뒤 처음 값을 대입하는 것을 초기화(Initialization)라고 함
		 * 초기화를 통해 대입한 값을 초기값☆☆☆☆☆이라고 함
		 * 
		 *
		 */
		//System.out.println(price);
		//변수는 자신이 선언된 {scope} 에서만 사용할 수 있음
		//local variable(지역변수)
		
		/*
		 * 식별자(Identifier) 노란색글씨
		 * 
		 * 클래스명, 매소드명, 변수명 등등 개발자가 만들어서 이용하는 고유의 이름
		 * 
		 * - 식별자를 생성할 때 꼭 지켜야 하는 규칙!(안 지키면 안만들어짐)
		 * 
		 * 1. keyword(예약자)는 식별자로 사용할수 없음 (보라색 글씨)
		 * 2. 공백은 포함할수 없음 (다음 단어를 대문자로 사용)
		 * 3. 대, 소문장를 구분하고 길이제한은 없음
		 * 4. 문자, 숫자, _, $를 포함할 수 있음 (한글도 가능) 숫자로는 시작X
		 * 5. 문자, _, $로만 시작할 수 있음
		 * 
		 * - 개발자들끼리의 암묵적인 약속(안 지키면 욕먹음) => 영어 말고 쓰지말자
		 * 
		 * 1. 클래스 / 인터페이스 명명 규칙
		 * 
		 * - 첫 글자는 대문자로 표기
		 * - 연결된 단어들의 첫 글자도 대문자로 표기
		 *   --> WelcomeToJavaWorld
		 * - 명사, 형용사를 서술적으로 연결해서 사용
		 * 
		 * 2. 변수 명명 규칙
		 * 
		 * - 명사적 의미를 갖게 만들어 줌
		 * - 첫 글자는 소문자로 표기, 연결된 단어들을 첫글자를 대문자로 표기
		 *   --> phoneNumber
		 *   
		 * 3. 메소드 명명 규칙
		 * 
		 * - 동사적 의미를 갖게 만들어 줌(명령어 어조)
		 * - 첫 글자를 소문자로 표기, 연결된 단어들은 첫 글자로 표기
		 * - 메소드 식별자의 경우 식별자 뒤에 반드시 한 쌍의 "()"를 붙임
		 * - 메소드에는 일반적으로 _를 사용하지 않음
		 *   --> join(), signUp()
		 * 
		 * 4. 상수 명명 규칙
		 * 
		 * - 모든 문자를 대문자로 표기
		 * - 단어와 단어 사이는 _를 사용해서 구분한다.
		 *   --> LOGIN_OK
		 */
		
		//변수의 자료형
		// Java의 기본자료형, 원시자료형
		//    PrimitveType
		
		/*
		 * 1. 논리자료형(논리 값 : true / false) 
		 */
		//자료형 변수식별자;
		
		boolean isTrue; // 변수 선언
		//System.out.println(isTrue); 출력되지 않음
		// 지역변수(localVariable)은
		// 초기화(Initialization)를 하지 않은면 사용할 수 없음
		isTrue = true; // 초기화(처음에 넣은것)
		System.out.println(isTrue);
		isTrue = false; // 대입(두번째 넣은것)
		System.out.println(isTrue);
		
		/*
		 * 2. 숫자 자료형
		 * 
		 * 정수형
		 * 
		 * 정수형에는 4가지 자료형이 존재함
		 * byte, short, int, long 형이 있음
		 * int 형을 주로 씀
		 * long형을 사용할 때는 대입할 숫자뒤에 "L"을 붙임
		 * 
		 * 실수형
		 * 
		 * 실수형에는 2가지 자료형이 존재한다.
		 * float, double(기본)형이 있음
		 * float형은 사용하기 위해서는 할당할 숫자뒤에 "F"를 붙임
		 * 
		 * 
		 * 
		 */
		
		// 2_1. 정수형
		byte byteNumber = 1;     // 1Byte 값의 범의(-128~127)
		short shortNumber = 2;   // 2Byte
		int intNumber = 3;       // 4Byte
		long longNumber = 4L;    // 8Byte
		
		// 2_2. 실수형
		float floatNumber = 2.22F;    // 4Byte
		double doubleNumber = 3.33;   // 8Byte
		
		// 변수 선언과 동시에 초기화
		
		// 3. (단일)문자형
		char gold = '밥';   // 2Byte
	    //단일문자에는 반~~~~드시 홀  따음표를  붙여준다.
		
	    // 여기까지가 기본자료형 / 원시자료형 8개!
	    
		// 4. 문자열(기본자료형이 제공X) : 참조자료형
		String str = "abc"; // 문자열 같은 경우 반드시 쌍따옴표를 앞 뒤로 붙여줌!
		
		// 9개의 자료형을 가지고 변수를 선언
		// 각각의 변수 초기값을 대입 초기화를 진행
		// 9개의 변수에 값이 잘 대입되었는지 확인을 해보고 싶음!
		
		//논리자료형 1개
		System.out.println("논리 자료형 : " + isTrue);
		//정수자료형 4개
		System.out.println("정수자료형 : " + byteNumber);
		System.out.println("정수자료형 : " + shortNumber);
		System.out.println("정수자료형 : " + intNumber);
		System.out.println("정수자료형 : " + longNumber);
		//실수자료형 2개
		System.out.println("실수자료형 : " + floatNumber);
		System.out.println("실수자료형 : " + doubleNumber);
		//단일 문자 자료형 1개
		System.out.println("단일 문자 자료형 : " + gold);
		//문자열 자료형 1개
		System.out.println("문자열 자료형 : " + str);
		
		// 출력문의 종류
		// System.out.print();
		// System.out.println(); => 개행한다.(행을 새롭게 연다.)
		
		// System.out.printf(); => f는 format, 개향 안함
		// 우리가 원하는 출력 결과물 ↓
		// isTrue라는 변수에 대입한 값 : false , char형은 : gold
		System.out.printf("isTrue라는 변수에 대입한 값 : %b, char형은 : %c", isTrue, gold);
		
		// %b : true / flase타입의 변수 공간
		// %d :byte, short, int, long 정수형 변수 공간
		// %f : float, double 실수형 변수 공간
		// %c, %c : char문자형 변수를 담기 위한 공간
		// %s, %s : string문자열형 변수를 담기 위한 공간
		// System.out.println();
		System.out.printf("\ndoubleNum 값 : %.2f" , doubleNumber);
		// \n 개행문자, \t 
		
		System.out.println("=========================");
		
		// 상수(프로그래밍 언어)
		// => 값을 변경하지 않을 변수 공간
		
		//잘나가는 KH가 설립된 년도를 저장할 공간이 필요함
		int startYear = 1998;
			startYear = 2025;
		// 이러면 값이 변함
		
				
		System.out.println("KH 설립연도 : " + startYear);
		// 완전한 상수(절대로 변하지 않는 값)를 사용하기 위해 앞에 키워드(final)를 사용
		final int START_YEAR = 1998;
			// START_YEAR = 2026; <- 사용되지 않음
			
	}
		
}

