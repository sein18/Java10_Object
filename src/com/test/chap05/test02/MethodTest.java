package com.test.chap05.test02;

public class MethodTest {

	// 1. �Ű����� ����, ��ȯ�� ����.
	public void method1() {
		System.out.println("�Ű������� ��ȯ���� �� �� ���� �޼ҵ� �Դϴ�.");
		return;
	}

	// 2. �Ű����� ����, ��ȯ�� �ִ�.
	public String method2() {
		return "�Ű������� ������ ��ȯ ���� �����ϴ� �޼ҵ� �Դϴ�.";
	}

	// 3.�Ű����� �ִ�, ��ȯ�� ����.
	public void method3(int num, int num2) {
		System.out.println("sum: " + (num + num2));
		return;
	}

	// 4.�Ű����� �ִ�, ��ȯ�� �ִ�.
	public int method4(int num, int num2) {
		int sum = num + num2;
		return num + num2;
	}

	
}
