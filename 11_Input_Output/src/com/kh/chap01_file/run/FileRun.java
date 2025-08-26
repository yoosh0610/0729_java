package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// 정말 간단하게 소스코드를 이용해서 파일을 만들어보자
		// 기준점(작업하는 프로그램)을 정해서 생각
		// File 클래스를 가지고 작업
		// java.io 패키지에 존재
		
		// 파일클래스를 이용해서 객체 생성
		File file1 = new File("test.txt");
		
		try {
		// 파일 만들기
		file1.createNewFile(); //CheckedException
		// createNewFile() : 파일 생성 메소드
		
		// 폴더 만들기
		// (make)directory => mkDir (folder) 
		File foler = new File("foler");
		foler.mkdir();
		//경로지정까지
		File file2 = new File("foler/test.txt");
		file2.createNewFile();
		
		// 파일클래스에서 제공하는 메소드
		
		System.out.println("파일맞니? " + file2.isFile());
		System.out.println("파일명 : " + file2.getName());
		System.out.println("상위 폴더 : " + file2.getParent());
		System.out.println("절대 경로 : " + file2.getAbsolutePath());
		System.out.println("파일 크기 : " + file2.length());
		
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	/*
	 * => IO(Input & Output), 입/출력
	 * 
	 * 프로그램 상의 데이터를 외부매체(모니터, 스피커, DB, 프로세스, 콘솔, "파일")로 출력하거나
	 * 입력장치(마우스, 키보드, 마이크, "파일")로 입력받는 과정
	 * 
	 * IO를 진행하고 싶으면
	 * 우선적으로 반드시 프로그램과 외부매체간의 "통로"를 만들어야 함
	 * => 스트림(Stream)
	 * 
	 * 스트림의 특징
	 * 
	 * - 단반향 : 출력이면 출력 / 입력이면 입력
	 * 			입력용과 출력용 스트림이 각각 따로 존재함
	 * 
	 * - 선입선출(First In First Out) ==> 시간지연 문제가 발생할 수 있음
	 * 
	 * 스트림의 구분
	 * 
	 * - 스트림의 사이즈
	 * 
	 * 바이트스트림 : 1Byte짜리가 이동할수 있는 통로(한글은 2Byte, 영어 라틴 아니면 아직)
	 * 			=> 입력(XXXXXInputStream) / 출력(XXXXOutputStream)
	 * 
	 * 문자스트림 : 2Byte짜리가 이동할수 있는 통로
	 * 			=> 입력(XXXReader) / 출력(XXXXWriter)
	 * 
	 * - 외부매체와의 직접적으로 연결되는 스트림
	 * 
	 * 기반 스트림 : 외부매체와 직접적으로 연결하는 스트림
	 * 
	 * 보조 스트림 : 기반스트림만으로 부족한 성능을 향상시켜주는 용도로 만들어진 스트림
	 * 				=> 단독 사용 불가(반드시 기반스트림이 존재해야만 사용이 가능함)
	 * 				=> 속도 향상, 자료형에 맞춰서 변환, 객체단위로 입출력, 바이트 <==> 문자
	 * 
	 */
	
	
	
	
}


