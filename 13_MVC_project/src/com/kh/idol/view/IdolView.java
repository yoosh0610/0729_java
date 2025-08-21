package com.kh.idol.view;

import java.util.List;
import java.util.Scanner;

import com.kh.idol.controller.IdolController;
import com.kh.idol.model.vo.Idol;

public class IdolView {

	// 필드부
	
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();
	
	// 생성자
	
	// 메소드부
	// 프로그램을 실행했을 때 가장 먼저 보여질 화면을 출력해주는 기능
	public void mainMenu() {
		
		System.out.println("aespa 커뮤니티에 오신것을 환영합니다.");
		// """  """ <- 블럭으로 묶어서 사용할수 있음
		
		while(true) {
			System.out.println();
			System.out.println("이용하실 서비스를 선택해주세요 > ");
			System.out.println("1. 에스파 정보보기");
			System.out.println("2. 회원가입");
			System.out.println("3. 로그인");
			System.out.println("4. 게시판 서비스");
			System.out.println("5. 프로그램종료");
			System.out.print("메뉴번호 입력 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : infoMenu(); break;
			case 2 : signUp(); break;
			case 3 : login(); break;
			case 4 : break;
			case 5 : return;
			default : System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
		}
		
	}
	
	private void infoMenu() {
		System.out.println();
		System.out.println("정보보기 서비스입니다.");
		System.out.println("이용하실 메뉴를 선택해주세요! > ");
		System.out.println("1. 카리나의 정보보기");
		System.out.println("2. 지젤의 정보보기");
		System.out.println("3. 윈터의 정보보기");
		System.out.println("4. 닝닝의 정보보기");
		System.out.println("5. 모든 멤버 정보보기");
		System.out.println("6. 메인메뉴로 돌아가기");
		System.out.print("이용하실 메뉴를 입력해주세요 > ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1, 2, 3, 4 : findMember(menuNo); break;
		case 5 : findAll(); break;
		case 6 : return;
		}
	}
	// menu에서 번호를 받아야암
	private void findMember(int menuNo) {
		// 특정 멤버의 주소값을 반환해줄래?
		Idol idol = ic.findMember(menuNo);
		System.out.println();
		System.out.println(" §    " + idol.getName() + "    § ");
		System.out.println(idol.getImage());
		System.out.println("포지션 : " + idol.getPosition());
		System.out.println("전투 기술 : " + idol.getSkill());
		System.out.println();
	}
	
	private void findAll() {
		// 모든 맴버의 정보를 접근할 수 있는 값을 줘
		List<Idol> aespa =  ic.findAll();
		
		if(aespa.isEmpty()) {
			System.out.println("멤버가 남아있지 않습니다...");
		} else {
			for(Idol i : aespa) {
				System.out.println("**오로라**");
				System.out.println();
				System.out.println("프로필 이미지 : " + i.getImage());
				System.out.println("이름 : " + i.getName());
				System.out.println("포지션 : " + i.getPosition());
				System.out.println("전투기술 : " + i.getSkill());
				System.out.println();
			}
			System.out.println("============================");
		}
	}
	
	public void signUp() {
		// Fan이라는 자료형에 맞춰 필드에 set할 값 3개를 사용자에게 입력받음
		
		System.out.println("\n에스파 커뮤니티에 오신것을 환영합니다.");
		System.out.println("회원가입서비스입니다");
		
		// 입력 => userId, userPw, nickName
		
		// 제약조건 => 아이디는 4글자에서 10글자 사이일 것
		//		  => 아이디는 다른 Fan의 아이디와 중복되면 안될 것
		
		String userId;// while의 지역변수가 되버려서
		while(true) {
			System.out.print("가입하실 아이디를 입력해주세요. > ");
			userId = sc.nextLine();
		
			// 하나의 메소드는 하나의 기능만 => 분리!!
			// 하나의 메소드는 하나의 기능만을 수행해야 한다.
			// 하지만 지금 이 회원가입 메소드는 
			// 회원가입 뿐만 아니라 아이디값에 대한 유효성검증을 진행하고 있다.
			// 이렇게 되면 이 메소드는 하는일이 
			// 1. 유효성 검증
			// 2. 회원가입
			// 두개
			//
			
			// 1. 아이디는 4글자에서 10글자 사이만 가능
			if(!(3 < userId.length() && userId.length() < 11)) {
				System.out.println("아이디는 4글자에서 10글자 사이만 사용 가능합니다.");
				continue;
			}
			
			// 2. 중복 체크
			//값을 Fan에 Fan은 heap에 heap은 List에 저장
			boolean duplicateId = ic.checkId(userId);
			
			if(duplicateId) {
				System.out.println("이미 존재하는 아이디입니다. 다시 입력해주세요.");
			}else {
				System.out.println("사용 가능한 아이디입니다.");
				break;
			}
		}
		
		System.out.print("비밀번호를 입력해주세요. > ");
		String userPw = sc.nextLine();
		
		System.out.print("닉네임를 입력해주세요. > ");
		String nickName = sc.nextLine();
		
		// View는 일단 자신의 할일은 1절까지 마무리함
		// 사용자가 입력한 아이디와 비밀번호와 닉네임을 가지고 Fan객체를 생성해서 필드에 담아서
		// controller에 있는 fans라는 List의 요소로 추가
		boolean result = ic.signUp(userId, userPw, nickName);
		
		if(result) {
		System.out.println("회원가입에 실패했습니다. 다시 시도해 주세요.");
		} else { 
			System.out.println("추카추카포카양파링~");
		}
	}
	
	private void login() {
		
		System.out.println("\n로그인 서비스입니다.");
		
		System.out.println("아이디를 입력하세요. > ");
		String userId = sc.nextLine();
		System.out.println("비밀번호를 입력하세요. > ");
		String userPw = sc.nextLine();
		
		ic.login(userId, userPw);
		
		
	}
	
}
