package com.kh.chap05.model.vo;

public class Hiphop extends Music implements MusicI, Amgn{
	//인터페이스에 있는 추상메서드를 구현하지 않아서
	
	@Override
	public void play() {
		System.out.println("힙합을 재생합니다.");
	}
	
	
	
}
