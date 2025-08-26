package com.kh.run;

import com.kh.variable.B_KeyboardInput;
import com.kh.variable.A_Variable;
import com.kh.variable.Casting;

public class Run {
	
	public static void main(String[] args) {
		
		// 외부 매서드에 존재하는 메소드를 호출하고 싶다.
		// 생성해야 한다. 별칭 붙여서 => 변수선언
		// 클래스이름 클래스별칭 = new 클래스이름();
		// 패키지가 불러올 클래스와 현재 클래스가 다를때 패키지까지 입력 
		// com.kh.variable.A_Variable a = new com.kh.variable.A_Variable();
		//풀 클래스 명
		
	    // a.findSeasonMenu();
		// a.declareVariable();
		
		// com.kh.variable.B_KeyboardInput b = new com.kh.variable.B_KeyboardInput();
	    
		// 패키지와 클래스 사이에 import으로 소환	
		// 두번할 것을 한번으로(중복코드 없애야)
		// 1.실수의 확률이 올라감
		// 2.효율이 올라가고 생산성이 낮아진다
		// 3.인권비가 올라감
		
		B_KeyboardInput b = new B_KeyboardInput();
		// b.inputTest();
		
		Casting c = new Casting();
		//c.autoCasting();
		c.forceCasting();
		
		
		
		
	}

}
