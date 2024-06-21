package com.anno.user3;

import org.springframework.stereotype.Component;

/*
- @Component
  : 빈 생성
  : 이름을 부여하지 않으면 클래스명의 첫 글자를 소문자로한 이름이 된다
    클래스명이 UserServiceImpl 이면 빈의 이름은 userServiceImpl
*/

@Component
public class UserServiceImpl implements UserService {
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl() {
		name = "김자바";
		tel = "010-1111-2222";
		age = 20;
	}
	
	@Override
	public String message() {
		String s = name + " : " + tel + " : " + age + " : ";
		s += age >= 19 ? "성인" : "미성년자";
		
		return s;
	}
}
