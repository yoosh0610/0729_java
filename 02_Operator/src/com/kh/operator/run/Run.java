package com.kh.operator.run;

// 1절 import절 작성하기!
// import 패키지경로.클래스명;

import com.kh.operator.A_Arithmetic;
import java.util.Scanner;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Compound;
import com.kh.operator.D_LogicalNagation;
import com.kh.operator.E_Comparison;
import com.kh.operator.F_Logical;
import com.kh.operator.G_Triple;

//이 클래스를 만든 이유 : 프로그램 실행하려고
public class Run {

	public static void main(String[] args) {
		
		// method();
		// 2절 import 해 온 클래스에다가 별칭 붙이고 new(생성) 해주기
		A_Arithmetic a = new A_Arithmetic();
		// a.method();
		// a.presentToStudent();
		// Run이라는 클래스에 12행의 위치한 MainMethod의 스코프({})에 진입한다.
		// 한줄씩(위에서 아래로, 왼쪽에서 오른쪽)
		// A_Arithmetic 클래스에 별칭을 정해주고
		// 별칭에 접근연산자 하면 A_Arithmetic클래스에 접근(넘어감)
		// 스코프({})가 종료되면 나를 부른 곳으로 이동
				
		B_InDecrease b = new B_InDecrease();
		// b.method1();
		// b.method2();
		// b.method3();
		
		C_Compound c = new C_Compound();
		// c.method1();
		
		D_LogicalNagation d = new D_LogicalNagation();
		// d.method1();
		
		E_Comparison e = new E_Comparison();
		// e.method1();
		
		F_Logical f = new F_Logical();
		//f.method1();
		//f.method2();
		//f.method3();
		
		G_Triple g = new G_Triple();
		//g.method1();
		//g.method2();
		//g.test();
	}
	
	
}
