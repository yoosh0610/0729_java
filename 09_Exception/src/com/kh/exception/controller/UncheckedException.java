package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	/*
	 * 프로그램 실행 시 발생하는 예외들(컨파일러가 안알려주는)
	 * RuntimeException
	 * 
	 * - NullPointerException : 주소값 객체를 참조했더니 null값이 들어있을 경우 발생하는 예외
	 * - ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근했을 때 발생하는 예외
	 * - ClassCastException : 허용할 수 없는 형변환을 진행할 경우 발생하는 예외
	 * - ArithmeticException : 나누기 연산을 0으로 나누면 발생하는 예외
	 * - NegativeArraySizeException : 배열을 할당할 때 크기를 음수로 지정하면 발생하는 예외
	 * ...
	 * 
	 * RuntimeException과 관련된 예외들은 공통점이 있음
	 * - 개발자가 예측이 가능함
	 */
	
	// ArithmeticException
	public void method1() {
		//사용자에게 두 개의 정수값을 입력받아서 나눗셈을 한 뒤 결과를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력해주세요 > ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력해주세요(제발 0은 입력하지 말아주세요) > ");
		int num2 = sc.nextInt();//0이 대입되면 에러
		/*
		//방법 1. 예외발생 자체를 원천 차단해버림
		if(num2 != 0) {
			System.out.println("연산 결과 : " + (num1 / num2));
		} else {
			System.out.println("너 혼구녕 나고싶어?");
		} // 원천차단할수 없는 경우가 더 많음
		*/
		//방법 2. 예외처리를 진행
		//예외가 발생하면 프로그램은 멈춤
		
		// 예외처리 : 
		// 예외 상황을 감지하고 예외 상황 발생 시 
		// 프로그램이 비정상적인 종료가 되는것을 방지하고 적절한 대응 조취를 취하는 것
		
	//	System.out.println(num1 / num2);
		//여기서 에러가 뜨면 멈춤, 밑에는 실행하지 않음 == 들만든 캐이스
	//	System.out.println("하하호호");
		
		/*
		 * try ~ catch문
		 * 
		 *  [ 표현법 ]
		 * 
		 * try {
		 * 
		 * 	  (num1 / num2) // 예외가 발생할수도 있는 구문
		 *		*catch뒤에()를 붙임
		 * } catch(발생할예외클래스명 변수명) { => 매개변수
		 * 
		 * 		해당 예외가 발생했을 때 실행할 구문
		 * 
		 * }
		 */
		//예외를 막을수는 없다(비정상적인 종료를 막아줌)
		try {
			
			System.out.println(num1 / num2);
			
			System.out.println("올바른 정수 입력!");
			// 예외가 발생할 경우 점프(중요한 코드 사용 X)
		} catch(ArithmeticException e) {
			
			System.out.println("두 번째 정수에 0을 입력하시면 나눌 수가 없습니다.");
			//예외의 경우 대응할 방법
			
		}
		//예외가 발생하지 않으면 여기로
		System.out.println("프로그램 종료");
		
	}
	
	public void homeWork() {
		Scanner sc = new Scanner(System.in);
		while(true ) {
			
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 추가하기");
			System.out.println("2. 검색하기");
		    int menuNo = 0;
			try {
				menuNo = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("숫자만 써 이놈아.");
				//출력문만 대입하는게 아님
				// 예외처리 시 catch문에 적어야하는 내용이 출력문은 아님
			}	
			sc.nextLine();
			
			System.out.println(menuNo + "번 메뉴를 선택하셨습니다.");
		}
	}
	
	public void method2() {
		//한번에 같이 처리하는 방법
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요(0은 제외). > ");
		
		try {
			int num = sc.nextInt();
			// InputMismatchException
		
			System.out.println("100을 입력값으로 나눈 결과 : " + (100 / num));
			// ArithmeticException
		} catch(InputMismatchException e) { // 1.  먼저 입력받은 값이 정수인지 판단
			System.out.println("숫자로 된 정수값이 아닙니다.");
		} catch(ArithmeticException e) { // 2.  정수가 맞다면 0인지 판별
			System.out.println("0은 안돼요!!.");
		}	
		
		
		System.out.println("프로그램 종료");
		
	}
	
	public void method3() {
		// 배열
		
		// 사용자에게 정수값을 입력받아서
		// 입력받은 만큼의 크기를 가진 배열을 생성 및 할당하고
		// 100번째 인덱스값 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력해주세요. > ");
		
		// InputMismatchException : 스캐너 메소드의 자료형과 일치하지 않으면 파업
		// NegativeArraySizeException : 배열의 크기를 음수로 지정하면 파업
		// ArrayIndexOutOfBoundsException: 배열의 크기보다 큰 인덱스에 접근하면 파업
		
		// 특정클래스의 후손클래스(RuntimeException의 후손)
		// 부모클래스가 같다면 다형성을 사용해서 대입할수 있다.
		
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println(arr[100]);
		} catch(InputMismatchException e) {
			e.printStackTrace(); // 얘는 꼭 개발단계에서만
			System.out.println("정수넣어랏!");
		} catch(RuntimeException e) {
			System.out.println("아마도 음수나 100보다 크지않아서");
			// 부모클래스가 자식클래스 밑에 있어야 함(먼저 실행해버려서)
		}
		
		/*catch(NegativeArraySizeException e) {
			System.out.println("음수넣지맛!");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("100보다 작은수 넣어랏!");
		}*/
		
	}
}

