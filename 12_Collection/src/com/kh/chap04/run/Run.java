package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04.model.vo.Fish;

public class Run {

	public static void main(String[] args) {
		// Map
		// 저장소, List랑 비슷
		// Key + Value 세트로 저장
		
		//HashMap
		//표현법
		//Map 객체이름 = new HashMap();
		
		//Key == 식별자
		//Value == 생선객체
		
		Map<String, Fish> apuarium = new HashMap();
		
		// 비어있는 맴에 요소를 추가해보자!!
		// List, Set => add()
		// Collection을 구현한 클래스
		
		// HashMap -> put()
		// => Key + Value 함께 요소로 추가
		
		// 1. put(K Key, V Value) : Map에 Key + Value세트로 요소로 추가해줌
		apuarium.put("농어", new Fish("단맛","회"));
		apuarium.put("대방어", new Fish("기름진맛","회"));
		apuarium.put("연어", new Fish("담백한맛","스테이크"));
		apuarium.put("고등어", new Fish("맛있음","구이"));
		apuarium.put("메기", new Fish("흙맛","매운탕"));
		
		System.out.println(apuarium);// Key=Value로 출력, 저장 순서 보장 X
		apuarium.put("참치", new Fish("기름진맛","회"));
		System.out.println(apuarium);// Value값의 경우 중복 저장 O
		apuarium.put("참치", new Fish("감칠맛","후토마키"));
		System.out.println(apuarium);// Key == 식별자 --> 중복이 발생하면 덮어씌어짐
		
		
		// 2. get(Object Key) : Object
		// 전달된 Key값에 해당하는 Value값을 반환해주는 메소드
		// Key -> Value를 찾아옴
		
		System.out.println(apuarium.get("농어"));
		System.out.println(apuarium.get("메기"));
		System.out.println(apuarium.get("광어"));// 없는 Key값을 입력 --> null값이 출력
		//효율성(if(),For()안써도 됨)
		
		// 3. size() : Map에 담겨있는 요소의 개수
		System.out.println(apuarium.size());
		
		// 4. replace(K Key, V Value) : Key값으로 요소를 찾아서 Value값을 바꿔줌
		
		apuarium.replace("참치", new Fish("고소한맛","구이"));// put이랑 같음?
		
		apuarium.replace("없는거", null);
		System.out.println(apuarium);
		// 기존에 존재하지 않는 키값을 인자로 전달하면 추가하지 않는다는 것이 put과의 차이점
		
		// 5. remove(Object Key) => 해당 Key값을 찾아서 => Key+Value 세트로 지워주는 메소드
		
		apuarium.remove("참치");
		System.out.println(apuarium);
		
		System.out.println("=======================================================");
		
		// Map에 들어있는 모든 요소들에 순차적으로 접근해야 한다면??
		// for문 X(index가 없어서), 향상된 for문 X, while X
		// addAll(Collection c) => X
		// Iterator => X
		
		//함수형 펑션
		/*
		apuarium.forEach((key, value) -> {
			System.out.println(key + "" + value);
		});
		*/
		
		// Map이 Key - Value를 가지고 있는데
		// Key값들만 Set으로 바꿀수 있음
		//Set으로 바꾸면 Iterator를 사용할 수 있기 때문에 반복
		
		// 1) keySet() 호출하기
		
		// 1_1> Map이 가지고 있는 Key들만 Set에 담는다.
		Set<String> fishSet = apuarium.keySet();
		System.out.println(fishSet);
		
		// 1_2> Set을 Iterator에 담기
		Iterator<String> itKey = fishSet.iterator();
		
		// 1_3> 반복문 사용하기
		while(itKey.hasNext()) {
			String key = itKey.next();
			System.out.println(key + "-------" + apuarium.get(key));
		}
		
		System.out.println("============================================");
		
		
		// 2) entrySet()을 이용하는 방법
		
		// 2_1> Map이 가지고 있는 Key - Value세트를 Set에 담기
		Set<Entry<String, Fish>> entrySet = apuarium.entrySet();
		
		System.out.println(entrySet);
		
		for(Entry<String, Fish> e: entrySet) {
			System.out.println(e.getKey() + ":::::" + e.getValue());
			
		}
		
	}

	
}
