package com.anno.scope2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/anno/scope2/applicationContext.xml");
		
		try {
			User user = context.getBean(User.class);
			user.execute();
			user.execute();
			
			System.out.println("------------------\n");
			
		} finally {
			context.close();
		}

	}

}
