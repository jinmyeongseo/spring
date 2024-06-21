package com.anno.user2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
 - @Qualifier
   : @Autowired와 함께 사용(단독 사용 불가)
   : 이름으로 설정하여 의존성 주입
 */
public class User2 {
	@Autowired
	@Qualifier("userService2")
	private UserService service;
	
	public void write() {
		System.out.println("-- 애노테이션 : 동일한 타입이 둘 이상인 경우 - @Autowired --");
		System.out.println(service.message());
	}
}
