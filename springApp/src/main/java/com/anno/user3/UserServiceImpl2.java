package com.anno.user3;

import org.springframework.stereotype.Component;

@Component("userService") // 이름 부여
public class UserServiceImpl2 implements UserService {
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl2() {
		name = "이자바";
		tel = "010-1111-2222";
		age = 17;
	}
	
	@Override
	public String message() {
		String s = name + ", " + tel + ", " + age + ", ";
		s += age >= 19 ? "성인" : "미성년자";
		
		return s;
	}
}
