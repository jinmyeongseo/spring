package com.config.user1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	private @Value("다자바") String name;
	private @Value("20") int age;
	
	@Override
	public String message() {
		String s = name + " | " + age + " | " + (age >= 19 ? "성인" : "미성년자");
		
		return s;
	}
	
}
