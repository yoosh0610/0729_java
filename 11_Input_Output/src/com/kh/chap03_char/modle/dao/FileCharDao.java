package com.kh.chap03_char.modle.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {
	
	//프로그램 --> 외부매체(파일
	//출력
	public void outputToFile() {
		// FileWriter : 파일로 데이터를 2Byte단위로 출력하는 스트림
		/*
		//0.스트림선언
		FileWriter fw =null;
		
		try {
			fw = new FileWriter("b_char.txt");
			
			//2. 데이터출력 => Write()
			fw.write("와..IO..신기하당..");
			fw.write("E");
			
			
		} catch(IOException e) {
			System.out.println("다시 시도해주세요");
		} finally {
			//3. 자원반납 => 꼭 지켜야하는 약속
			try {
				if(fw != null) {
					fw.close();
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		*/
		try(FileWriter fw = new FileWriter("c_char.txt"); 
				Scanner sc = new Scanner(System.in)){
			fw.write("와..IO..신기하당..");
			fw.write("E");
		}catch(IOException e) {
			e.printStackTrace();
		}
		//.close(); 호출
		/*
		 * try ~ with ~ resource구문
		 *  -JDK7이상부터 사용가능
		 *  try(스트림객체생성; ...){
		 *  	예외가 발샹할수도 있는 구문;
		 *  }catch(예외클래스 e) {
		 * 		예외가 발생했을 때 실행할 구문;
		 *  }
		 *  블럭이 끝나는 시점에 close()를 호출해서 자동으로 자원을 반납해줌
		 *  혹여나 할 수도 있는 실수를 줄일수 있는 아주 훌륭한 문법
		 *  대전제 : closeable를 구현할 것 
		 */
		
		
	}
	
	public void writeTil() {
		
		//사용자에게 오늘 학습내용을 입력받아서
		//외부 파일에 내용을 출력
		
		// 내보낼 파일명은 : 2025년 08월 14일 오늘의 학습일지
		Date now = new Date();
		// System.out.println(now);
		// 2025년 08월 14일(월은 대문자'M' 소문자는 분으로 대입)
		// 포멧팅
		String titlDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(now);
		//System.out.println(titlDate);
		
		//String fileName = titlDate + " 오늘의 학습일지.txt";
		//문자열+문자열
		StringBuilder sb = new StringBuilder();
		sb.append(titlDate);
		sb.append("오늘의 학습일지.txt");
		
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			fw = new FileWriter(sb.toString());
			System.out.println("어디 오늘 배운 내용을 한 번 작성해보시오 > ");
			String content = sc.nextLine();
			fw.write("오늘 학습한 내용 : \t" + content);
		} catch(IOException e) {
			System.out.println("비상비상 문제발생 비상비상");
		}finally {
			try {
				if(sc != null) sc.close();
				if(fw != null) fw.close();
			}catch(IOException e) {
				System.out.println("자원반납을 하다가 문제 발생 비상");
			}
		}
		
	}
	
}
