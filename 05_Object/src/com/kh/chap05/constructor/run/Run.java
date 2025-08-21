package com.kh.chap05.constructor.run;

import java.util.Scanner;

import com.kh.chap05.constructor.model.vo.Member;

public class Run {

	public static void main(String[] args) {
												
		Member member= new Member(); // 어디서 받을지 꼭 필요,일부러 안한 줄 알고 기본 생성자를 없앤다
		System.out.println(member.info());// <- 유효하지 않다(아직 값을 몰라서)
		
		Member member2 = new Member("하하호호");
		Member member3 = new Member("user01", "1234");
		System.out.println(member3.info());
		//new를 만나면 이미 필드가 올라가있다.
		//생성자를 호출, 인자값을 순서대로 들어간다
		//필드의 생성자들을 초기화
		
		Member member4 = new Member("user01", "pass02","홍길동");
		System.out.println(member4.info());
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원두는 어떤 원두인가요 > ");
		String userId = sc.nextLine();
		member.setUserId(userId);
		System.out.print("사이즈는 어떤 사이즈인가요 > ");
		String userPwd = sc.nextLine();
		member.setUserPwd(userPwd);
		System.out.print("가격은 얼마인가요 > ");
		String nickName = sc.nextLine();
		member.setNickName(nickName);
		
		String info = member.info();
		System.out.println("=============");
		System.out.println(info);
		*/
	}

}
