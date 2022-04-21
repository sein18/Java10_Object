package com.test.chap05.test02;

public class Run {
	public static void main(String args[]) {
		MethodTest mt =new MethodTest();
		
		// 매개변수와 반환값이 없는 메소드 호출
		mt.method1();

		// 매개변수 없고 반환값이 있는 메소드 호출
		System.out.println(mt.method2());

		// 매개변수 있고 반환값이 없는 메소드 호츨
		mt.method3(10, 20);

		// 매개변수와 반환값이 있는 메소드 호출
		System.out.println(mt.method4(30, 40));

	}
}
