package silsub1.run;

import silsub1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member mb = new Member();
		//setter로 값 변경
		mb.setMemberId("user01");
		mb.setMemberPwd("pass01");
		mb.setMemberName("박세인");
		mb.setAge(20);
		mb.setGender('M');
		mb.setPhone("010-1111-1111");
		mb.setEmail("user01@naver.com");
		
		//getter로 값 조회
		System.out.println(mb.getMenberId());
		System.out.println(mb.getMenberPwd());
		System.out.println(mb.getMenberName());
		System.out.println(mb.getAge());
		System.out.println(mb.getGender());
		System.out.println(mb.getPhone());
		System.out.println(mb.getEmail());
	}

}
