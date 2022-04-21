package com.test.chap01;

public class Score {
	//멤버
	private String name = "박세인";
	private int kor = 90;
	private int eng = 86;
	private int math = 97;
	
	//생성자 
	public Score() {}

	// 총합을 구해 출력하는 기능
	public void sum() {
		System.out.println(name + " 님의 과목 총합은 " + (kor + eng + math) + " 입니다.");
	}

	// 평균을 구해 출력하는 기능
	public void avg() {
		System.out.println(("평균 점수는: " + (kor + eng + math) / 3.0));
	}

	// 제일 높은 점수를 받은 과목을 출력하는 기능
	public void max() {
		 
		if (kor > eng && kor > math)
			System.out.println("제일높은 과목: 국어\n점수는 : " + kor);
		else if (kor < eng && eng > math)
			System.out.println("제일높은 과목: 영어\n점수는 : " + eng);
		else if (kor < math && eng < math)
			System.out.println("제일높은 과목: 수학\n점수는 : " + math);
	}

	// 필드값 확인할 수 있는 기능
	public void prn() {
		System.out.println(name + " 학생의 국어점수: " + kor+" 영어의 국어점수: " 
	+ eng + " 학생의 수학점수: " + math+" 이다.");
	}
}
