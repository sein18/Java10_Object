package com.test.chap01;

public class Score {
	//���
	private String name = "�ڼ���";
	private int kor = 90;
	private int eng = 86;
	private int math = 97;
	
	//������ 
	public Score() {}

	// ������ ���� ����ϴ� ���
	public void sum() {
		System.out.println(name + " ���� ���� ������ " + (kor + eng + math) + " �Դϴ�.");
	}

	// ����� ���� ����ϴ� ���
	public void avg() {
		System.out.println(("��� ������: " + (kor + eng + math) / 3.0));
	}

	// ���� ���� ������ ���� ������ ����ϴ� ���
	public void max() {
		 
		if (kor > eng && kor > math)
			System.out.println("���ϳ��� ����: ����\n������ : " + kor);
		else if (kor < eng && eng > math)
			System.out.println("���ϳ��� ����: ����\n������ : " + eng);
		else if (kor < math && eng < math)
			System.out.println("���ϳ��� ����: ����\n������ : " + math);
	}

	// �ʵ尪 Ȯ���� �� �ִ� ���
	public void prn() {
		System.out.println(name + " �л��� ��������: " + kor+" ������ ��������: " 
	+ eng + " �л��� ��������: " + math+" �̴�.");
	}
}
