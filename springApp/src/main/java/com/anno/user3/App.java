package com.anno.user3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/anno/user3/applicationContext.xml");
		
		try {
			// 스프링 컨테이너에서 빈을 가져옴
			User obj = context.getBean(User.class);
			obj.write();
			System.out.println("--------------------\n");
			
			User2 obj2 = context.getBean(User2.class);
			obj2.write();
			System.out.println("--------------------\n");
			
		} finally {
			context.close();
		}

	}

}
