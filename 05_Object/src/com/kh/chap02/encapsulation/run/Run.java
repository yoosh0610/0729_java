package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Cafe;

public class Run {
	//System.out.println("아무생각이 없이 썼던거 같아요.");
	//메인메소드는 JVM이 호출하는데 public이 아니면 호출할 수 없다.
			
	// 캡슐화 (encapsulation)
	// 속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것
	// 정보은닉(information hiding)
			
	// 데이터 추상화의 방법
	// 방금 우리는 Puppy에 몰아서 사용했음
	// 안쪽의 있는 내용물을 외부로 부터 보호하려고(외부에서 수정하지 못하게)
	
	// 접근제한자 (예약어) 반환형 메소드식별자(매개변수)
	public static void main(String[] args) {
		// 개체생성하면 무조건 new
		// 변수선언    대입연산자  객체 생성(메모리에 적재)
		Cafe cafe = new Cafe();
		/*
		cafe.name = "KH카페";
		System.out.println(cafe.name);
		cafe.signatureMenu = "KH커피";
		cafe.signaturePrice = -500;
		System.out.println(cafe.signatureMenu);
		System.out.println(cafe.signaturePrice);
		*/
		
		//필드가 보이지 않아서(외부에서 불가능해서) 오류 발생! 
		//접근제한자를 public에서 private으로 변경했기 때문에 직접 접근이 불가능
		//직접 접근이 불가능하기 떄문에 간접적으로 접근할 수 있는 방법을 만들어주어야 함
		//Cafe라는 클래스에 getter / setter라는 메소드 만들기
		
		// ****객체의 내부적 관점 / 외부적 관점
		
		//cafe.dishWash();
		//cafe.cleanig();
		//cafe.windowCleanig();
		// 내부에서 변환되면 외부에서 오류
		//cafe.open();
							// 인자값!
		cafe.setSignatureMenuPrice(5000);
		//메서드 호출 부에서는 오로지 값만 넘길 수 있음
		//넘기고 싶은 값은 (인자값)안에 넣는다
		//넘어오는 값은 모르기 때문에 공간을 만들어야(변수) 한다
		// 자료형은 맞춰줘야 한다.
		//System.out.println("메인메소드에서 찍어본 cafe의 주소 : " + cafe);
		//객체에 찾아가서(주소) 참조 set변수명(값);
		cafe.setName("KH카페"); // <- 이걸로 바꿔줘
		cafe.setAddress("서울시 중구 남대문로 120 2층");
		
		//System.out.println(cafe.name);<- 안됨(외보로부터 접근을 막아서)
		//cafe.getName();
		String cafeName = cafe.getName();
		//값을 출력하기 위해서 저장을 해야(변수)지정
		System.out.println(cafeName);
		// 값이 생기면 담을공간(변수) 생각! 
		String cafeAddress = cafe.getAddress();
		System.out.println(cafeAddress);
		int Price = cafe.getSignatureMenuPrice();
		System.out.println(Price);
		
		String info = cafe.info();
		System.out.println(info);
	}
}
