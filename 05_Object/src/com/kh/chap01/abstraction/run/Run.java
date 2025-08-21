package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.vo.Puppy;

public class Run {

	public static void main(String[] args) {
		/*
		 * 객체 지향 프로그래밍 : 현실세계에서의 독립적인 존재(개체)를 속성과 행위를 가진 객체로 만들어서
		 *   				 객체간의 상호작용을 통해 프로그래밍 하는 기법
		 * 구현하고자 하는 프로그램에 객체를 만들기 위해서는(생성하기 위해서는)
		 * => 클래스를 먼저 생성해야 함!
		 * 
		 * 클래스란? 각 개체들의 정보(속성, 행위)들을 담아내는 그릇 또는 틀 또는 설계도 또는 명세
		 * 설계도
		 */
		/* 사람이 생각하는 방식대로 프로그래밍을 하는 법
		 * 구조체(정보)를 정해서 값을 정하고 함수(기술)파일을 합쳐서 사용 => 클래스
		 * 지금까지 C언어의 클래스를 사용
		 * 기술을 사용하기 위해서는 주체가 필요
		 * 정보와 기능을 하나로 묶어 단위로 정해
		 * 하나로 묶은 단위를 개체지향의 시작점
		 * 추상적인 기술을 객체로 만듬
		 * 객체를 만들 때 만들고자 하는 목적에 부합하여 만듦
		 */
		//  클래스 : VO(Value Object)
				/*
		 		* 오늘의 숙제!
		 		* 
		 		* 현실세계에 존재하는 나만의 그 무언가를 찾아서
		 		* VO클래스를 만들고
		 		* PuppyCareRun 클래스를 참고하여 생성한 객체를 관리할 수 있는 프로그램을 작성하시오.
		 		* 
		 		* 개수 ) VO 클래스 5개 + VO 관리프로그램 5개
		 		* 각 VO클래스의 최소 필드 수 5개
		 		* 최초 한 개 이상의 필드 값을 변경할 수 있는 메소드 생성 --> Puppy클래스의 bark()처럼
		 		* 
		 		* 제출할 곳 : 우리반게시판 게시글 작성
		 		* 			과제 탭을 선택 할 수 있음
		 		* 제한시간 : 2025 / 08 / 07 / 07:59까지
		 		* 게시글 제목 : 유성현 VO 클래스 만들기
		 		* 텍스트 or 캡쳐로  
		 		* 
		 		* + 메모리구조 그리기
		 		*/
		/*
		Test 사람 = new Test();
		사람.hairCut();
		사람.sleep();
		*/
		
		// 현실세계
		// 동물 => 강아지
		// 정보
		// 종 : 포메라니안
		// 이름 : 똘똘이
		// 나이 : 4살
		// 성별 : 암컷
		// 색상 : 갈쌕
		// 몸무게 : 3Kg
		
		// 정말 필요한 정보만 소프트웨어에 가져오는 방법 => 추상화
		// 정보를 추상화 하여 가져오는데 클래스 단위까지 올려서 가져오자
		
		//클래스화
		
		// 객체 생성해보기
		// 강아지 객체 생성 (클래스가 있어야)
		// 우리는 지금까지 객체 생성을 함(객체지향)
		
		Puppy smart = new Puppy(); // 객체 생성
					// new 라는 예약어를 사용(배열도 객체)
					// Memory의 heap영역에 데이터를 생성
					// 값을 저장할수 있는 공간(6개)가 있고 기능(1개)가 있다.
		//smart.sniff(); // 대상(smart)에 접근해서 기능을 호출
		
		//System.out.println(smart);  주소값이 출력
		//System.out.println(smart.name);
		// 값을 저장하는 공간에 가려면 대입한 곳에 접근(참조연산자)한 후 클래스 안 공간의 값을 출력
		// 값을 대입하기 전까지 null 또는 0이라는 값이 존재
		
		// 값을 넣는 방법 공간 = 값
		smart.name = "똘똘이";
	 //smart에 접근해서 name이라는 공간
		smart.species = "포메라니안";
		smart.age = 4;
		smart.gender = "암";
		smart.color = "갈색";
		smart.weight = 3;
		
		System.out.println(smart.name + "는 " + smart.color + " "
				         + smart.species + "입니다.");
		System.out.println(smart.age + "살 " + smart.gender + "컷에 "
				         + smart.weight + "Kg입니다.");
		
		
		Puppy soldier = new Puppy();
					//new를 만나면 heap영역에 공간이 생긴다.
		soldier.name = "상근이";
		soldier.age = 22;
		soldier.species = "그레이트 피레니즈"; 
		soldier.gender = "수";
		soldier.color = "흰색";
		soldier.weight = 60;
		
		System.out.println(soldier.name + "이는 " + soldier.color + " "
					 	 + soldier.species + "입니다.");
		System.out.println(soldier.age + "살 " + soldier.gender + "컷이며, "
						 + soldier.weight + "Kg이예용");
		// 내가 원하는 자료형 + 여러 기능들을 생성
		// 클래스는 내가 생각하는 모양새로 만듦
		// 모양새 ==> 자료형
		// 클래스는 개발자가 만드는 사용자 자료형
		// 자료형을 만들고 객체명(주소) ==> 참조자료형(사용자 정의 자료형)
		// 기본자료형 제외하면 전부 참조자료형(포인터-가르키는 곳)
		// 참조자료형은 항상 주소값이 대입
		
		System.out.println("===========================");
		
		smart.sniff();
		soldier.sniff();
		//이름을 붙여 같이 출력
		
		System.out.println("짖기 전 상근이 몸무게 : ");
		System.out.println(soldier.weight);
		
		soldier.bark();
		soldier.bark();
		soldier.bark();
		
		System.out.println("짖고 난 후 : ");
		System.out.println(soldier.weight);
	}
}
