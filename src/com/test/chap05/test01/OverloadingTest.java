package com.test.chap05.test01;

public class OverloadingTest {
	
	
	public int test() {
		return 0;
	}

	public int test(int a) {
		return 0;
	}

	public int test(int a, int b) {
		return 0;
	}

	public int test(String s, int a) {
		return 0;
	}

	public String test(int a, int b, String str) {
		return null;
	}

	/*
	  ��ȯ���� �ٸ��ٰ� �����ε��� ��������� �ʴ´�.
	  public int test(int a, int b, String str) {
	  		return 0; 
	   }
	  
	  ���������ڰ� �ٸ��ٰ� �����ε��� ��������� �ʴ´�.
	  private String test(int a, int b, String str) {
	  		return null; 
	  }
	 */

}
