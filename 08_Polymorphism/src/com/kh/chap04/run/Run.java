package com.kh.chap04.run;

import java.util.Scanner;

import com.kh.chap04.model.vo.Bong;
import com.kh.chap04.model.vo.Hong;
import com.kh.chap04.model.vo.Jjimdak;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//손님이 찜닭시켜야지 ~ 가정
		System.out.println("찜닭 주문 서비스에 오신걸 환영합니다.");
		System.out.println("주문하실 찜닭 브렌드를 선택하시기 바랍니다.");
		System.out.println("1. 홍찜닭");
		System.out.println("2. 봉찜닭");
		System.out.print("메뉴를 선택해주세요. > ");
		int menuNo = sc.nextInt();		
		
		Jjimdak dak = null;
		
		switch(menuNo) {
		case 1 : dak = new Hong(); break;
		case 2 : dak = new Bong(); break;
		}
		
		dak.order();
				
	}

}
