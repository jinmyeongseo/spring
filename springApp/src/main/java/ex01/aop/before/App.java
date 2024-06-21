package ex01.aop.before;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:ex01/aop/before/applicationContext.xml");
		
		try {
			System.out.println("MethodBeforeAdvice...");
			
			TestService service = (TestService)context.getBean("testService");
			
			service.save("자바");
			System.out.println();
			
			service.write();
			System.out.println();
			
		} finally {
			context.close();
		}

	}

}
