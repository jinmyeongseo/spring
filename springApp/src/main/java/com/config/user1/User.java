package com.config.user1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User {
	@Autowired
	private UserService userservice;
	
	public void write() {
	System.out.println("-- 자바로 환경 설정 --");
	System.out.println(userservice.message());
	}
}
