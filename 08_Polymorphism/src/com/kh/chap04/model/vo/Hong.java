package com.kh.chap04.model.vo;
// implements 구현하고자하는 클래스명(타입-자료형)
// 실체화, 재정의, 오버라이딩 해줘야 함
public class Hong implements Jjimdak {

	@Override
	public void order() {
		System.out.println("비법양념에 숙성한 후 400도 가까운 온도로 조리해서 찜닭 만들기");
	}
}
