package com.test.chap03.test02;

public class MTest {

	public static void main(String[] args) {
		InitBlock p = new InitBlock("È«¹Ì5", 100, "»þ¿À¹Ì");
		
		p.setName("È«¹Ì6");
		String pName = p.getName();
		
		p.information();
	}

}
