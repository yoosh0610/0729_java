package com.kh.chap02.model.vo;

public class BeerDrinker extends Drinker{
	
	private boolean limit;
	
	public BeerDrinker() {}
	public BeerDrinker(boolean limit) {
		this.limit = limit;
	}
	
	public boolean getLimit() {
		return limit;
	}
	public void setLimit(boolean limit) {
		this.limit = limit;
	}
	
	@Override
	public void drink() {
		System.out.println("소주를 마십니다");
	}
	@Override
	public void eat() {
		System.out.println("곱창을 먹습니다");
	}
	
	
}
