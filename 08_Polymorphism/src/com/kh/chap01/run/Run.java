package com.kh.chap01.run;

import com.kh.chap01.model.vo.Child1;
import com.kh.chap01.model.vo.Child2;
import com.kh.chap01.model.vo.Parent;

public class Run {
	/*
	 * 상속구조
	 * 
	 * 필드 / 메소드 => 별로 안 중요함
	 * 
	 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
	 *   자식클래스가 부모클래스로부터 상속받을 때 타입!(자료형!)을 물려받는다
	 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
	 */
	public static void main(String[] args) {
		
		// 1. 부모타입 자료형으로 부모 타입 객체를 다룸
		Parent p1 = new Parent();
		p1.printParent();
		//p1.printChild1(); <- 안됨(부모입장에서는 자식이 누군지 뭘 가졌는지 모름)
		// 자식이 가지고 있는 맴버는 부모가 사용할수 없다
		// p1변수로는 Parent에만 접근이 가능
		
		//2. 자식 타입 자료형으로 자식 타입 객체를 다룸
		Child1 c1 = new Child1();
		c1.printChild1(); //내껀 내꺼
		p1.printParent(); //부모껏도 내꺼
		// c1변수로는 Child1, Parent랑 둘 다 접근 가능
		
		// = <-- 얘를 기준으로 양변의 자료형이 같아야 한다.
		// 3. 부모 타입 자료형으로 자식 타입객체를 다룸 ==> 다형성 적용
		Parent p2 = /*(Parent)*/new Child1();// Parent타입으로 변환 됨, 상속구조이기 때문
		p2.printParent();
		//상속되면 부모클래스에서 타입(자료형)을 상속받는다.
		//p2.printChild1(); <-- 부모클래스에서는 자식클래스를 호출할 수 없다
		// 모든 클래스는 object클래스의 자식클래스이다.
		// p2로는 Parent타입만 접근할 수 있다.
		
		//양쪽의 자료형이 다름에도 불구하고 에러가 발생하지 않는 이유는
		// 부모클래스인 Parent가 자식클래스 Child1에게 타입을 물려주어서
		//클래스 형변환이 일어났기 때문
	
		/* 클래스 형 변환
		 * 
		 * "상속 구조"일 경우에만 가능
		 * 
		 * 1. Up Casting
		 * 자식타입 => 부모타입
		 * 생략이 가능함
		 * 
		 * 2. Down Casting
		 * 부모타입 => 자식타입
		 * 생략이 불가능하다.
		 */
		((Child1)p2).printChild1();
		
		
		// Child1타입의 객체 두 개
		// Child2타입의 객체 두 개
		// 총 네개의 객체르 다뤄 볼 것
		/* 변수
		Child1 child1 = new Child1();
		Child1 child2 = new Child1();
		Child2 child3 = new Child2();
		Child2 child4 = new Child2();
		
		child1.printChild1();
		child2.printChild1();
		child3.printChild2();
		child4.printChild2();
		*/
		
		// 배열을 사용해보자
		// 배열 == 한종류의 자료형인 값들을 묶어서 관리할 수 있음
		
		Child1[] arr1 = new Child1[2];
		Child2[] arr2 = new Child2[2];
		arr1[0] = new Child1();
		arr1[1] = new Child1();
		arr2[0] = new Child2();
		arr2[1] = new Child2();
		
		arr1[0].printChild1();
		arr1[1].printChild1();
		arr2[0].printChild2();
		arr2[1].printChild2();
		
		System.out.println("\n\n\n다형성을 적용해보자");
		Parent[] arr = new Parent[4];
		arr[0] = (Parent)new Child1();
		arr[1] = (Parent)new Child2();
		arr[2] = new Child2();
		arr[3] = new Child1();
		
		// arr[0].printChild1(); <- X
		// ((Child1)arr[0])arr[0].printChild1(); <- O
		for(int i = 0; i < arr.length; i++) {
			arr[i].printParent();
		}
		
		System.out.println("\n\n\n\n");
		for(int i = 0; i < arr.length; i++) {
			/*
			if(i == 0 || i == 3) {
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
			*/
			/*
			if(arr[i] instanceof Child1) {
				// instanceof => true/ false
				// 현재 참조변수가 실질적으로 어떤 클래스타입을 참조하고 있는지 확인할 때 사용
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
			*/
			
			arr[i].print();
			// 부모클래스 머시기 X 4 (자식타입 객체)
			// 부모클래스와 자식클래스에 모두 존재하면 자식클래스가 우선
			
			// 상속은 객체를 조금더 효율적으로 사용하기 위해 사용
			
			/*(반대 : 오버로딩 정적바인딩)
			 * 동적바인딩 : 프로그램 "실행 전" 컴파일 시전에 정적바인딩 수행(자료형의 메소드를 가리킴)
			 * 			 실질적으로 참조하고 있는 객체가 해당 메소드를 오버라이딩 했다면
			 * 			 프로그램 "실행시점" 동적으로 자식클래스의 오버라이딩된 메소드를 샐행
			 * 					(Runtime)
			 * 
			 * 다형성 : 부모클래스 자료형으로 여러 자식클래스를 다루는 기술
			 * 		부모타입 자료형으로 여러 자식클래스를 사용할수 있다.
			 * 
			 * 다향성 전제 : 상속관계이여야 한다.
			 */
			
			// 객체지향의 목적! - 서로 모르게 할라고
		}
		
		
	}

}
