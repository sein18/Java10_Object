package com.test.chap05.test02;

public class Run {
	public static void main(String args[]) {
		MethodTest mt =new MethodTest();
		
		// �Ű������� ��ȯ���� ���� �޼ҵ� ȣ��
		mt.method1();

		// �Ű����� ���� ��ȯ���� �ִ� �޼ҵ� ȣ��
		System.out.println(mt.method2());

		// �Ű����� �ְ� ��ȯ���� ���� �޼ҵ� ȣ��
		mt.method3(10, 20);

		// �Ű������� ��ȯ���� �ִ� �޼ҵ� ȣ��
		System.out.println(mt.method4(30, 40));

	}
}
