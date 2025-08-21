package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	// 기반 스트림이 input / output 계일일 경우
	// 보조 스트림도 input / output 계일을 사용
	
	// 기반 스트림이 Reader / Writer 계일일 경우
	// 보조 스트림도 Reader / Writer 계일을 사용
	
	// BufferedReader / BufferedWriter
	
	// -> 속도 향상이 목적인 보조스트림
	// -> 임시공간(=Buffer)을 제공해서 한 번에 모아 두었다가 한꺼번에 입/출력을 진행
	
	// [ 표현법 ]
	// 기반스트림클래스이름 기반스트림 = new 기반스트림생성자(외부매체인자값);
	// 보조스트림클래스이름 보조스트림 = new 보조스트림생성자(기반스트림);
	
	// 출력
	public void outputFile() {
		// BufferedWriter
		
		// 0. 변수 선언! (생성 따로)
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
		// 1. 객체 생성
			fw = new FileWriter("c_buffer.txt");
			bw = new BufferedWriter(fw);//기생충, 기반스트림이 있어야 존재
			
			// 2. 출력
			bw.write("하이~~~");
			bw.newLine();
			bw.write("반가워용~~");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {//return을 만나야 의미가 생김 +>무조건 아님, 필요의 의해서
			// 3. 자원반납 => close()
			//기반스트림이 닫히면 보조스트림 못 닫음
			// 자원반납은 반드시 생성의 역순으로 반납
			try {
				if(bw != null) {
					bw.close();
				}
			} catch(IOException e){
				e.printStackTrace();
			}
			try {
			if(fw != null) {
				fw.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
	
	// 입력
	public void inputFile() {
		//FileReader를 기반으로 BufferedWriter를 사용해서 입력받기
		try(BufferedReader bfr = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			String str = "";
			while((str = bfr.readLine()) != null) {
				System.out.println(str);
				
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
	}
}
