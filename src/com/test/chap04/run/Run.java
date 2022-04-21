package com.test.chap04.run;

import java.util.Date;

import com.test.chap04.model.dto.User;

public class Run {

	public static void main(String[] args) {
		//기본생성자로 객체 생성
		User u1 =new User();
		u1.informathion();
		
		//매개변수 있는 생성자로 객체 생성
		User u2 =new User("user01","pass01","박세인");
		u2.informathion();

		User u3 =new User("user02","pass02","박세인", new Date());
		u3.informathion();
	}

}
