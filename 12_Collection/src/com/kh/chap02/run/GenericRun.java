package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.vo.Plant;

public class GenericRun {

	public static void main(String[] args) {
		//귀찮은것을 없애기 위한 문법
		/*
		 * 제네릭 <Generic(일반적인,일반화)>
		 * 
		 * 컬렉션을 사용하면서 다룰 타입들을 미리 지정할 수 있는 기능
		 * => 명시적으로 <Integer>, <Plant>
		 * => 특정 타입의 요소들만 컬렉션에 담을 수 있도록 지정할 수 있음
		 * 
		 * 별도의 제네릭 없이 객체 생성(E == Object)
		 * 
		 * 1. 다룰 요소의 타입을 제한할 수 있음 => 실수를 줄일 수 있음
		 * 2. 매 번 형변환하는 정차를 없앨 수 있음 => 코드 짤 때 쫌 편함
		 * 
		 */
		/*
		ArrayList plants = new ArrayList();
		plants.add("asdfg");
		plants.add(new Plant());
		plants.add(1);
		plants.add(1.1);
		//int i = 1;
		//System.out.println(((Object)i).toString());
		//기본자료형을 Object[](참조자료형)로 하려면 Wrapper로 포장(Integer,Double)
		*/
		/*Array*/List<Plant> plants= new ArrayList();
		//ArrayList<Plant> plants= new ArrayList();
		// 좋은 개발자가 되려면 부모자료형(다형성)적용해서 상위클래스를 사용
		// 나중에 바꿔도 큰 지장 없음(타입숨기기)
		plants.add(new Plant("관엽", "산세베리아"));
		//plants.add("asdfg");
		//Plant타입이 아니면 담을수없다
		
		//String name = ((Plant)plants.get(0)).getName();
		Plant p = plants.get(0);
		
		for(Plant plant : plants) {
			System.out.println(plant);
		}
		//
	}

}
