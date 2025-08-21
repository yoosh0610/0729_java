package com.kh.chap06.controller;

public class MethodController {
			/*자료형으로 사용(타입)*/
	/*
	 * 메소드(Method) 클래스가 가지고 있는 기능 == 맴버 함수
	 * :입력값을 가지고 특정 동작을 수행한 뒤 결과물을 내놓는다.
	 * 
	 * 프로그래밍 언어에서 함수 : 특정 작업을 수행하기 위해서 만들어진 코드 블럭
	 * 1. 재사용성(사용하고 싶을때 호출해서 계속 사용 가능) 중복
	 * 2. 모듈화(부품화) 작은 단위로 여기저기 사용할수 있다
	 * 
	 * 객체지향 프로그래밍에서의 메소드란 : 객체가 수행할 수 있는 행동을 정의한 코드 블럭
	 * 
	 * 특정 자료형에서만 사용이 가능한 함수
	 * 
	 * [ 표현법 ] 
	 * 
	 * 접근제한자 예약어 반환형 메소드식별자(매개변수의자료형 매개변수식별자) {
	 * 	
	 * 			수행할 코드;
	 * 
	 * 			return 반환값;
	 * 
	 * }
	 * 
	 * 생략 가능한것 : 예약어, 매개변수, return문(void일 경우)
	 * 반환형 : return반환할 값의 자료형
	 * 호출할 떄 메소드 전달 인자값 => 매개변수의 자료형과 개수가 정확하게!! 일치해야함☆
	 * 
	 * 한번 정의해두면 필요할때마다 호출 가능!
	 */
	
	// 더하기를 해서 결과를 반환해주는 코드 블럭을 만들고 싶다.
	public void add(int a, int b) { // 메소드 시그니처
		//피연산자의 수를 ()안에 작성
		// 본문(메소드 바디)
		int sum = a + b; 
		return;  //변환값(자료값 통일)
		
	}
	
	// 1. 매개변수가 존재하지 않고 반환값도 존재하지 않는 메소드
	public void method1() {
		
		System.out.println("매개변수와 변환값이 둘 다 존재하지 않습니다.");
		
		//return; // 클래스의 기본생성자 같은
		//returnType 이 void일 경우 return문을 생략할수 있다.
		
	}
	
	
	// 2. 매개변수는 존재하지 않지만 반환값은 존재하는 메소드
	/*
	public String getName() {
		return "이름";		
	}
	*/
	public String method2() {
		System.out.println("매개변수는 존재하지 않지만 변환값은 존재합니다.");
		//반환타입에 자료형일때 반드시 return문 작성
		return "returnValue"; // 값
				// ↑ String(참조자료형) 주소값대입 - 사라지지 않게 저장하려면 변수에 저장
				// 
	}
	
	public String method3() {
		return method2();
		// 메소드를 호출했을때 진행할수 있는건 값이 있을때만 가능
	}
	
	public void println(String parameter) {
		System.out.println(parameter);
	}
	
	// 3. 매개변수는 존재하지만 반환값은 존재하지 않는 메소드
	/*
	public void setName(String name) {
		this.name = name;
	}
	*/
	public void method4(int num) {
		System.out.println("매개변수는 존재하고 반환값은 존재하지 않습니다.");
		System.out.println("전달받은값 + 100" + (num + 100));
	}
	// 메소드의 사용법이라 부름
	
	// 4. 매개변수도 존재하고 반환값도 존재하는 메소드
	public int method5(int num) {
		System.out.println("매소드도 있구요 반환값도 있어요");
		return num + 50;
	}
	
	
	public void a() {
		System.out.println("매소드 a호출!");
		b(); //a();
	}
	public void b() {
		System.out.println("매소드 b호출!");
		a();
	}
	
	       //매개변수↓ (자료형 식별자) //같은 주소값이 들어감
	public void test(MethodController mc) {
		mc.method1();
	}
	// 다른 객체인데 값은 주소값을 가르침 => 얕은 복사☆★☆★☆★☆★
	
	public static void staticMethod() {
		System.out.println("안녕 나는 스태틱 메소드임");
		// static 공유의 목적
	}
	
	
	
	
	
	
	//☆★☆★☆★ 복습 ☆★☆★☆★☆★☆★
	
	
	
	
}
