package ch06_05;

public class MiniTest {
	//책 307p singleton 풀어보기
	
	int a;
	int b;
	
	private static MiniTest m1 = new MiniTest();
	
	private MiniTest() {
	}
	
	static MiniTest getInstance() {
		return m1;
	}
	
	
	

}
