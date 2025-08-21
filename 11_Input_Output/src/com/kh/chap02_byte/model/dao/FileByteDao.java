package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//DAO(Byte Access Object)
//데이터가 보관되어있는 공간에 직접 접근해서
//입력/출력하는 메소드들을 만들어줌



public class FileByteDao {
	//데이터엑세스오브젝트
	
	//파일에 데이터를 출력(Byte Stream사용)
	public void outputToFile() {
		//Scanner sc= new Scanner(System.in);
		//sc.close();
		
		//출력 : 프로그램 내의 데이터를 밖으로 내보내겠다
		// 프로그램 --> 외부(파일)
		
		//FileOutputStream : "파일"로 데이터를 출력할 때, 파일과 연결하는 1byte단위의 스트림
		
		// 1. FileOutputStream 객체생성
		//파일과 연결하는 스트림을 생성하는 과정
		FileOutputStream fos = null;
		try {
		//생성자 호출시 인자값으로 파일명을 전달하는데 파일명이 존재하지 않을 경우
		// 해당 파일을 생성하면서 통로를 연결
		
		 fos = new FileOutputStream("a_byte.txt"/*, true*/);
		// 매개변수 생성자 호출 시
		// 두번째 인자로 true값을 전달하려면 => 해당 파일 내용에 이어서 작성
		// 않쓰면 => 덮어쓰기
		
		
		
		// 2. 연결통로를 가지고 데이터를 출력 : write()호출
		fos.write(97);
		fos.write(98);
		fos.write(99);
		
		byte[] arr = {101, 102, 103};
		fos.write(arr);
		
		fos.write('A');
		fos.write('B');
		
		fos.write('가');
		fos.write('나');
		fos.write('다');
		
		// 1Byte의 범위 : -128 ~ 127
		// 한글은 2Byte기 때문에 깨짐
		// 바이트스트림으로는 한글/ 일어/ 한자 해결이 안됨
		// 문자 스트림을 사용해야 해결이 가능
		
		
		// 3. 스트림 사용이 끝났다면 반드시 꼭 무조건 너무너무 해야하는 작업이 잇음
		// 코드상에서 사용이 전부 종료되었다면 자원반납을 해주어야 함 <-- 약속!!☆★
		// 너무 정말정말정말정말정말정말정말정말정말정말정말정말중요한 약속
		// 자비지커넥터가 수거를 안함(메모리상에 계속 남음)
		
		// 자원반납하는 방법
		// .close()
		//fos.close();
		
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			
			return;
		} finally { //어디에서 return하던지 무조건 !!! finally블럭 구문을 수행
			
		}
		// 반납이 이뤄지지 않을수 있으니 트라이 밖으로
		
		try {
		    if(fos != null) {
				 fos.close();
		 	}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		//null값에 .close();를 하면 에러가 달라짐
		//null값이 아닌 경우에 하기
	}	
	//마지막 try catch문 뒤에 finally{}붙이면 무조건 수거처리
	
	
	
	//프로그램 <== 외부매체(파일)
	//입력 : 파일로부터 데이터를 가지고 오겠다.
	// FileInputStream
	//파일로부터 데이터를 가져와서 입력받을건데, 1Byte단위로 입력받겠다.
	
	public void InputFromToFile() {
	
	FileInputStream fis = null;
	
	try {
	//1.객체생성 => 스트림연결하기
	fis = new FileInputStream("a_byte.txt");
	
	//2. 스트림으로 입력받기
	// read()호출
	//1Byte단위로 읽어옴
	/*
	System.out.println((char)fis.read());
	System.out.println(fis.read());
	System.out.println(fis.read());
	System.out.println(fis.read());
	System.out.println(fis.read());
	System.out.println(fis.read());
	System.out.println(fis.read());
	파일의 마지막 데이터를 입력받고 나서 read()를 호출 시 -1을 반환
	System.out.println(fis.read());
	*/
	/*
	while(fis.read() != -1) {
		
		System.out.println(fis.read());
		
	}
	*/
	/*
	while(true) {
		int value = fis.read()
		
		if(value != -1) {
		System.out.println(value);
		} else {
			break;
		}
	}
	*/
	//메소드를 두번 호출해서 퐁당퐁당 됨
	//메소드 호출을 한번에 하려면 변수로 선언해서 사용
	//값으로 생각해야한다
	
	int value = 0;
	while((value = fis.read()) != -1) {
		System.out.println((char)value);
	}
	// 변수를 먼저 선언하고
	// while()안의 조건식에서 다 처리한다.
	// 조건식 안에 변수도 사용 가능
	
	// 3. 마지막으로 꼭 해야할 일
	
		// 문자열비교
		//Abc abc = new Abc();
		//System.out.println(abc.equals("아씨발")); //공격적 코드
		//System.out.println("아씨발".equals(abc)); //방어적 코드
		//코드짤때 항상 방어적으로 해야한다
	
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}finally {
		
		try {
			if(fis != null) {
				fis.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	}
	
}
