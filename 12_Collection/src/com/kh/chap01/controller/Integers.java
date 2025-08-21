package com.kh.chap01.controller;

import java.util.Arrays;

public class Integers {
	
	private int[] integers;
	private int size;
 	
	public Integers() {
		integers = new int[3];
	}
	
	public void add(int element) {
		// 값을 대입하려면 매개변수가 필요
		if(integers.length == size + 1) {
			integers = Arrays.copyOf(integers, (integers.length * 2));
		}
		integers[size++] = element;
		//add할때마다 2배로 늘어나서 어마어마하게 커짐, 조건으로 
	}
	//인덱스 필요, 매개변수 int
	public int get(int index) {
		return integers[index];
		
	}
	
	@Override
	public String toString() {
		return Arrays.toString(integers);
		
		
		
		
	}
	
}
