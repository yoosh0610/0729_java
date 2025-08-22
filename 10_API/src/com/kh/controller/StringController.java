package com.kh.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.run.Run;

public class StringController {
	
	// 웹은 이미지냐, 문자열이냐 두가지
	
	// String 클래스 => 불변(Immutable)변하지 않음을 의미
	// String 바이트형 배열(원래 char형) => 공간 아낄려고(4byte)
	/*
	 * String 클래스 사용법
	 * 
	 * 1. new 연산자를 사용해서 String클래스의 생성자를 호출하는 방법
	 *		=> 왜?
	 * 2. 대입연산자를 이용해서 문자열 리터럴값을 대입하는 방법
	 * 		String쓸때는 2번 방법으로만 써야 함
	 */
	
	// 생성자를 호출해서 문자열 객체를 생성하는 방법
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		Run run = new Run();
		//String str3 = "hello";
		
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		System.out.println(run.toString()); //run클래스의 부모클래스 - toString클래스의 메소드
		//toString을 오버라이딩 했다 - 논리적 접근
		
		//1. String 클래스의 toString()의 경우
		//실제 담겨있는 문자열 리터럴 value값을 반환하겠끔 오버라이딩
		
		Run run2 = new Run();
		System.out.println(run.equals(run2)); //동등비교(주소값비교)
		
		//equals() 문자열의 동등비교로 주로 사용
		System.out.println(str1.equals(str2));
		// true ==> 같다  //값이 같으면 같다라고 -> 값이 같은지 비교할수 있도록 오버라이딩했다
		// 주소값 비교는 물론이고, 문자열 값도 비교하도록 오버라이딩
		
		// hashCode() - 주소값 나타내주는 코드
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("hello".hashCode());
		//hashCode 자신의 value값을
		
		// 3. String클래스의 hashCode()
		// 주소값을 해싱하는것이 아니라 실제 담긴 문자열값을 기반으로 해시코드  값을 만들도록 오버라이딩
		
		//진짜 저 참조형 변수들을 식별할 수 있는 값을 알아내는 법
		// System.identityHashCode(참조형변수)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2); // 객체가 같은지 비교
		
	}
	
	
	// 문자열 리터럴 대입 방식
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";
		
		// toString()
		System.out.println(str1);
		System.out.println(str2);
		//오버라이딩 됐으니까
		
		// equals()
		System.out.println(str1.equals(str2));
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// System.identityHashCode
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2);
		// true => 두개가 같아짐
		
	}
	
	
	
	// String Constant pool -> String pool로 주로 씀
	//       상수 부분에 Constant들어감
	
	// heap 영역에 상수만 들어가는 부분이 있음, 그중에 문자열만 들어가는 부분
	// 어떻게 쓰는지에 따라 heap영역에 올라가는 곳이 다름
	public void method3() {
		//Constant pool(상수풀) 특 - 똑같은 이름으로 다시 들어갈수없다->같은 이름의 주소를 가져옴
		
		String exam = new String("hello");
		String str = "hello";
		// 트루펄스 정수
		// 문자열 리터럴은 대입 연산자응 사용해 대입할 때 
		// String Constant pool영역에 등록됨
		// 특 : 동일한 내용의 문자열 리터럴이 존재할 수 없음
		
		System.out.println(System.identityHashCode(str));
		
		str = "bye";
		System.out.println(System.identityHashCode(str));
		//대입을 해도 문자열 리터널이 변하지 않는다 -> 새로 생성  ==> 변하지 않는다(String 특)
		
		str += "!!";
		System.out.println(System.identityHashCode(str));
		
		
		String a = "a";
		String b = "a";
		
		System.out.println("결과 : " + a == b);
		// 연산기호로 a가 문자에 더해져서 b랑 비교
		// 문자열로 +하면 하는 만큼 메모리에 계속 생성 => 잘 사용하지 않는다
		
	}
	
	public void method4() {
		
		// Arrays.toString(new int[2]); 
		
		// StringBuffer (동시 제어 기능이 있음)
		// Buffer == 임시저장공간(100%아님, 대체로 사용)
		// 문자열은 불변객체라서 내용뭉이 변경될때 마다 새로운 공간을 할당해서 잡는다.
		// 이를 해결하기 위해서 임시공간(Buffer)을 출력해서
		// 임시공간에 차곡차곡 담았다가 한번에 처리해주는 클래스
		
		StringBuffer sb = new StringBuffer();
		
		//System.out.println("Hello" + "world!");
		sb.append("Hello");
		sb.append("world!");
		System.out.println(sb);
		
		//StringBuilder (동시 제어 기능이 없음, 속도는 더 빠름) => 일방적인 방식에 더 많이 쓰임
		StringBuilder sr = new StringBuilder();
		sb.append("Hello");
		sb.append("world!");
		System.out.println(sr);
		
		// 동시제어기능(Thread-Safe)이
		//외부에서 제공이 많이 되고 있기 떄문에
		//충돌황경이 아니라면 굳이 구현할 필요가 없음
			
	}
		
//문자열 배열 클렉션
	
	//문자열과 관련된 메소드들
	public void	StringMethod() {
		
		String str1 = "경실련하이텔 아카데미";
		
		// 1. 문자열.length() : int (문자열의 길이)
		// 문자열의 길이를 반환
		System.out.println("str1의 길이 : " + str1.length());
		
		// 여러개의 값을 저장하는 것은 배열뿐!
		
		//2. 문자열.(int index) : char
		char ch = str1.charAt(3);
		System.out.println("하 : " + ch);
		
		String phoneNemmer = "010-1234-5678";
		// 3. 문자열.substring(int beginindex(시작하는위치,끝나는 위치) : String
		// => 문자열의 beginindex위치에서 문자열 끝까지의 문자열을 추출해서 반환
		// '-'도 하나의 공간
		// 배열의 순서는 시작점에 0부터 붙는다.
		System.out.println(phoneNemmer.substring(4));
		System.out.println(phoneNemmer.substring(4, 8));
		//문자열을 원하는 위치부터 추출
		
		// 4. 문자열.indexOf(str) : int
		System.out.println(str1.indexOf("텔"));
		//문자열의 위치를 int로 출력
		
		
		String[] email = {"sckimty@naver.com", "ki@kh.com"};
		
		for(int i = 0; i < email.length; i++) {
			System.out.println(email[i].substring(0, email[i].indexOf("@")));
		}
		// 5.문자열.toCharArray() : char[]	
		// 문자열의 각 문자들을 char[]로 반환해주는 메소드
		char[] chArr = email[0].toCharArray();
		for(int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		/*
		for(char c : chArr) {
			System.out.println(c);
		}
		new String(chars).chars().mapToObj(c -> (char)c).forEach(System.out::println);
		
		반목문 앞으로 익숙해지자,, 할게 많다,,
		*/
			
		// char[] -> 
		System.out.println(String.valueOf(chArr));
		
		// 6. 문자열.replace(char old, char new) : String
		System.out.println(email[0].replace("kh", "naver"));
		
		String str3 = "         Java           ";
		// 7. 문저열.trim() : String
		System.out.println(str3.trim());
		
		
		// 8. 문자열.toUpperCass() : String -> 싹 다 대문자
		//    문자열.toLowerCass() : String -> 싹 다 소문자
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정말 하시겠어요(Y/N) > ");
		String answer = sc.nextLine();//.toUpperCass();
		//String upperAnswer = answer.toUpperCass();
		//메소드 체이닝(풀맥카트)
		if(answer.equals("Y") || answer.equals("y")) {
			System.out.println("나 찐으로 해야겠다 참을 수 없다");
			
		}
		
	}
		
	public void split() {
		
		// 문자열 분리시키기
		String str = "배고파요,졸려요,하기싫어요,즐거워요";
		// 문자열을 나눠서 사용
		
		//문자열.split(String 구분자) : String[]
		
		String[] arr = str.split(",");
		
		for(int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		// 향상된 for문
		for(String s : arr) {
			System.out.println(s);
		}
		// 초기식, 조건식, 증감식 안씀
		//for(값을 받아줄 변수 선언 : 순차적으로 요소에 접근할 배열 || 컬렉션) {  }
		//배열을 순차적으로 하나씩 반복 -> 출력하거나 대입할때 사용
		// 배열의 요소를 수정할순 없음
		
		
		//java.util.StringTokenizer 클래스를 이용하는 방법
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		//System.out.println(stn);
		
		System.out.println("토크나이저로 뽑아야지~");
		/*
		System.out.println(stn.nextToken()); //기준을 중심으로 하나씩 뽑여서 나옴
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		*/
		
		while(stn.hasMoreTokens()) {
			// 남아있는 토큰이 있다면 true / 토큰 다 뽑혔다면 false
			System.out.println(stn.nextToken());
		}
		
	}
	
}
	

