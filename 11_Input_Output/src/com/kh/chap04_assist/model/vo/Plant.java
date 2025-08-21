package com.kh.chap04_assist.model.vo;

import java.io.Serializable;

public class Plant implements Serializable {
	private String name;
	private String Type;

	
	public Plant() {
		super();
	}


	public Plant(String name, String type) {
		super();
		this.name = name;
		this.Type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	@Override
	public String toString() {
		return "Plant [name=" + name + ", Type=" + Type + "]";
	}
	
}
