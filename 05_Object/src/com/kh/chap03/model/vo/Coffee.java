package com.kh.chap03.model.vo;

public class Coffee {
	
	// 상품명, 가격, 원두 크기
	
	// 필드부
	private String name;    //상품명
	private String bean; 	//가격
	private String size; 	//원두
	private int price; 		//크기

	// 생성자부
	
	// 메소드부  getter / setter / info
	
	//필드값을 반환해주는 메소드 == getter
	public String getName( ) {
		return name;
	}
	public String getBean( ) {
		return bean;
	}
	public String getSize( ) {
		return size;
	}
	public int getPrice( ) {
		return price;
	}
	
	// 필드값을 셋팅 해주는 메소드
	public void setName(String name) {
		this.name= name;
	}
	public void setBean(String bean) {
		this.bean= bean;
	}
	public void setSize(String size) {
		this.size= size;
	}
	public void setPrice(int price) {
		this.price= price;
	}
	
	//info()
	public String info() {
		String info = "상품명 : " + name
					+ ", 원두 : " + bean
					+ ", 사이즈 : " + size
					+ ", 가격 : " + price;
		return info;
	}
	
}
