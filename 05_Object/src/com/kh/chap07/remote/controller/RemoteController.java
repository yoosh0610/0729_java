package com.kh.chap07.remote.controller;

import com.kh.chap07.remote.model.vo.Television;

// 데이터(VO)와 화면(view)의 중간다리 역활
public class RemoteController {

	private Television tv = new Television();
		//값을 대입해줘야 on인지 아닌지 알수있음
		// 정수값 많이 사용
	private int channelNo;// 기본값이 0이여서(0을 사용하고 싶을때)
	
	public int powerOn(){
		if(!tv.isOn()/*getter*/) {
			tv.setOn(true);
			return 1; // 성공하면 1
		} 
		return 0; // 아니면 0
	}
	
	public String channeUp() {
		if(!tv.isOn()) {
			// getter메소드를 호출해서 받아오기
					//↓지역변수
			String[] channel = tv.getChannel(); //옅은복사
			if(channelNo < (channel.length - 1)) {
				return channel[++channelNo];
			}                   //인덱스값
			channelNo = 0;
			return channel[0];
		} return null;
	}
	
	public int getChannelNo() {
		return channelNo;
	}
}
