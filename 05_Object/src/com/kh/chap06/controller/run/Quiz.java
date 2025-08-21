package com.kh.chap06.controller.run;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt1 = 0;
		int cnt2 = 0;
		
		while(true) {
			
			System.out.println("더하기 퀴즈(그만하고 싶으면 '그만하고 싶어요' 입력)");
			//System.out.println("두 개의 정수를 입력해 주세요!");
			System.out.println("난이도를 선택해주세요(상 / 중 / 하) > ");
			String level = sc.nextLine();
			
			int bound = 0;
			int quizCount = 1;
			
			if(level.equals("상")) {
				System.out.println("난이도 (상)를 선택하셨습니다. 1~3000 사이의 범위로 출제됩니다.");
				bound = 3000;
			} else if(level.equals("중")){
				System.out.println("난이도 (중)를 선택하셨습니다. 1~200 사이의 범위로 출제됩니다.");
				bound = 200;
			} else if(level.equals("하")){
				System.out.println("난이도 (하)를 선택하셨습니다. 1~10 사이의 범위로 출제됩니다.");
				bound = 10;
			} else if(level.equals("그만하고 싶어요")) {
				System.out.println("사요우아라~~");
				break;
			}else {
				System.out.println("이상한 난이도를 선택하셨습니다.");
				System.out.println("처음부터 다시 시도해 주세요.");
				continue;
			}
			
			int firstNumber = (int)(Math.random() * bound) + 1;
			int secindNumber = (int)(Math.random() * bound) + 1;
			
			System.out.println(quizCount + "번 문제");
			System.out.println(firstNumber + " + " + secindNumber + " = ? ");
			
			System.out.println("정답을 입력해주세요 > ");
			int anwer = sc.nextInt();
			sc.nextLine();
			
			if(anwer == (firstNumber + secindNumber)) {
				System.out.println("딩동댕~ 정답입니다.");
				cnt1++;
			} else{
				System.out.println("땡! 오답입니다.");
				cnt2++;
			}
			System.out.println("총 문제 풀이 횟수 : " + quizCount + "회");
			System.out.println("정답횟수 : "+ cnt1 + "번 / 오답횟수 : " + cnt2 + "번");
			System.out.println();
			
		}
		
	}

}
