package com.kh.chap07.remote.view;

import java.util.Scanner;

import com.kh.chap07.remote.controller.RemoteController;

// 사용자에게 값을 입력받고 내용을 출력해주는 메소드를 넣어줄 클래스
public class RemoteView {
	private Scanner sc = new Scanner(System.in);
	RemoteController rc = new RemoteController();// 필드로 선언해야 프로그램 종료때까지 살아남는다
	// 프로그램 시작 시 보여질 메인메뉴를 출력해주는 메소드

	public void mainMenu() {
		while (true) {
			System.out.println("리모콘 조작 프로그램입니다.");
			System.out.println("이렇게 저렇게 조작을 열심히 해보세요");
			System.out.println("이용하실 메뉴를 선택해주세요.");
			System.out.println("1. 전원켜기");
			System.out.println("2. 채널 바꾸기 ↑");
			System.out.println("3. 채널 바꾸기 ↓");
			System.out.println("4. 전원끄기");
			System.out.println("5. 프로그램 종료");
			System.out.print("어떤 기능을 이용하시겠습니까? > ");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:	powerOn();break;
			case 2: channelUp();break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("리모콘 조작하기은 즐거우셨나요? 안녕히 가세요.");
				return; // 1.와일문 밖으로 2.자신을 소환한 곳으로 돌아가는것
			default:
				System.out.println("없는 메뉴를 선택하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	private void powerOn() {
		//RemoteController rc = new RemoteController();
		System.out.println("====================");
		System.out.println("전원 켜기 메뉴입니다.");
		System.out.println("====================");
		
		int result = rc.powerOn();
		if(result > 0) {
			System.out.println("전원이 켜졌습니다. 축하드립니다~");
		} else {
			System.out.println("이미 전원이 켜져 있습니다.");
		}
		System.out.println();
		System.out.println();
	}
	
	private void channelUp() {
		// 0번채널
		// 1번채널
		// 컨트롤러야 채널 올려줘 그리고 뭐하는지 알려줘
		// 객체가 요구하려면 메서드 호출해야한다.(==객체간의 상호작용)
		String channel = rc.channeUp();
		if(channel != null) {
			int channelNo = rc.getChannelNo();
			System.out.println(channelNo + "번 채널입니다.");
			System.out.println("현재 상영중인 프로그램입니다 : " + channel);
		} else {
			System.out.println("먼저 전원을 켜주시기 바랍니다.");
		}
		System.out.println("");
	}

}
