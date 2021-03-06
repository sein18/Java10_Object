package com.test.chap03.test02;

public class InitBlock {

	private String name = "아이폰";
	private int price = 200;
	private static String brand = "애풀";
	
	{
		name = "갤럭시";
		price = 300;
		brand = "삼성";
		System.out.println("초기화불럭");
	}
	
	static { //우선 순위
		brand = "LG";
	}
	
	// 생성자
	// 기본 생성자
	public InitBlock() {
	}

	// 매개변수 있는 생성자
	public InitBlock(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		InitBlock.brand = brand;
	}

	public void information() {
		System.out.println(name + ", " + price + ", " + brand);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
