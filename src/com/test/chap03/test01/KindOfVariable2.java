package com.test.chap03.test01;

public class KindOfVariable2 {

	public static int staticNum;
	
	
	public static final int STATIC_NUM = 1;
	// public ���������ڿ� static+final Ű���带 �԰� ����ϴ� ����
	// '��� �ʵ�'

	public final static int STATIC_NUM2 = 1;
	
	
	public void methodTest() {
		//static int localStaticNum;
		
	}
	
	public static void staticMethodTest() {
		//static int localStaticNum; ���� ���������� static ��� �Ұ�
	}
}
