package com.kh.chap06.controller.run;

import java.util.Arrays;

import com.kh.chap06.controller.MethodController;
import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		
		//Human human = new Human();
		//new생성자와 함께 Human생성자에 Human
		//method = 하나의 기능 단위
		//객체지향에서 중요한 것 = 기능을 수행하는 주체
		/*
		MethodController mc = new MethodController;
		int a = mc.add(1, 2);
		int b = mc.add(2, 3);
		int c = mc.add(5, 6);
		int d = mc.add(1, 2);
		int e = mc.add(1, 2);
		System.out.println("총합 : " + e);
		*/
		
		MethodController mc = new MethodController();
		//int[] dd = new int[3];
		//자료형 변수갑 대입 자료값(3)
		//mc.method1();
		//mc.method2();
		//String returnValue = mc.method2();
		//System.out.println(returnValue);
		//System.out.println(mc.method2());
		//System.out.println("method3 호출 결과 : " + mc.method3());
		//출력하는 용도의 메소드(인자값으로 출력할 값을 받음)
		// String parameter = "method3 호출 결과 : " + mc.method3();
		//
		//int result = mc.method5(2);
		//System.out.println(result);
		// mc.a();  stick터짐
		// 인자값을 정수값으로 대입해줬었음
		
		      //↓ MethodController mc = mc; 주소값이 들어감
		//☆★☆★☆★☆★☆★☆★☆★☆★
		//mc.test(mc);
		// 인자값을 변수값을 대입
		/*
		//객체를 생성하지 않고 메소드를 호출할수있음
		Math.random();
		int[] arr = {2, 3}; //{} //null
		System.out.println(Arrays.toString(arr));
		*/
		//MethodController.staticMethod();
		//staticMethod는 그냥 올라갈수 있다.
		
	// 메서드 호출조건 (메모리에 올라와있어야 함) - 객체생성
	// 객체를 만들지 않고 쓸수 있는 방법은 static으로 만드는 방법 뿐
	// static 안쓰려고 클래스를 쪼개서 씀
	/*
	System.out.println(1);
	System.out.println(1.1);
	System.out.println('a');
	System.out.println("어라?");
	System.out.println(mc);
	System.out.println();
	*/
		OverloadingController oc = new OverloadingController();
		// 정적 바인딩(Static Binding)
		// 컴파일이 끝난 시점 어떤 메소드가 호출될지 결정
		//컴파일러가 알아서 코드를 분석해서 메소드 호출연결(쌍을 묶는다-바인드(Binding))
		oc.test();
		oc.test(2);// 매소드 호출부, 인자값(argument value)
		//프린드ln은 메소드 오버로딩 되어있기 때문(모든 인자값을 받아도 구현될수있는) 편의성↑
		oc.test("3");
		oc.test(1, 2);
		oc.test(2, "sdf");
		oc.test("vvv", 3);
	}
}
