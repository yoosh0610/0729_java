package com.kh.chap03.model.vo;

public class Football extends Sports {
	
	@Override
	public void rule() {
		System.out.println("골키퍼말고 손으로 공 만지면 안됨 큰일남");
	}
	
	
}
