package ex02.aop.after;

public class TestServiceImpl implements TestService {
	private String value;
	
	public TestServiceImpl() {
		value = "AOP 테스트 !!!";
	}
	
	@Override
	public void save(String value) {
		System.out.println("[save 메소드] ...");
		this.value = value;
	}

	@Override
	public void write() {
		System.out.println("[write 메소드] ...");
		
		// int a = Integer.parseInt("a");
		
		System.out.println(value);
	}
}
