package com.test.chap01;

public class Main {

	public static void main(String[] args) {
		Account my = new Account();
		Account your = new Account();
		
		//���� �ܾ� ��ȸ
		my.display();
		
		//�Ա�
		my.in(100);
		my.display();

		my.in(150);
		my.display();
		
		//���
		my.out(50);
		my.display();
		
		//my.balance -= 200;// X

		my.out(50);
		my.display();
	}

}
