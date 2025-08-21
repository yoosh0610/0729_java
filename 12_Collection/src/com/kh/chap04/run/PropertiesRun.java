package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap04.model.vo.Fish;

public class PropertiesRun {

	public static void main(String[] args) {
		//상속이 문제를 일으키는 예시
		
		// Properties : Map계열 -> Key + Value세트로 저장함
		// 명확한 사용 목적이 있음
		// 외부파일에 입/출력을 하기 위한 용도
		// => .Properties파일로 입/출력
		// 변경하지 않는 설정정보
		// 해당 프로그램이 기본적으로 가져야할 정보들을 담는 파일
		Properties prop = new Properties();
		// 상속을 했기 때문에 put이 노출 됨
		//Properties요소를 추가할때는 setProperty로 추가
		//prop.put("키", new Fish());
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		
		System.out.println(prop);
		
		try {
			// store(OutputStream os, String comment) : 파일에 출력할때 씀
			//prop.store(new FileOutputStream("test.properties"), "쓰고싶은거");
			
			// 입력
			// load(inputStream is) : 입력 받을 때 씀
			// prop.load(new FileInputStream("test.properties"));
			// System.out.println(prop.get("Map"));
			
			prop.storeToXML(new FileOutputStream("test.xml"), null);
			
			// XML에서 입력 loadFromXML(InputStream is);
			// 가독성이 좋음
		
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
