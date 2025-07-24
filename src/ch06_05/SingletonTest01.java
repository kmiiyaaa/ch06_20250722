package ch06_05;

public class SingletonTest01 {  //메모리에 반드시 하나만 존재해야하는 인스턴스를 만들어주는 클래스
	
	
	/*
	public SingletonTest01 st1 = new SingletonTest01(); // 첫번째로 할 것 생성자를 호출하지 못하게 막는다 -> 생성자 호출하면 같은거 여러개 계속 생김/  하나만 존재해야함 - 생성자 private 선언함
		
	
	public SingletonTest01() {
			
	}
	
	
	public  SingletonTest01 getInstance() {
		return st1;
	}
	*/
	
	
	
	//private 선언시 클래스 내에서만 사용할 수 있는 
	private static SingletonTest01 st1 = new SingletonTest01();   //메모리엔 이객체 하나만 존재! 
	// 정적멤버(정적필드) 메인클래스에서 객체 선언하는(인스턴스화 하는) 방법과 동일 ,이클래스 안에서는 사용가능 but 밖에서는 사용불가능
	//외부에서 호출 자체가 안되니까 이 자체를 static으로 걸어준다 -> 객체여부와 상관없이 호출가능. (정적필드)
	
	
	//생성자
	private SingletonTest01() {  

	}
	
	
	//메소드 
	public static SingletonTest01 getInstance() {  //내부에서 만든것을 외부에서 써야할때 이 메소드만 써야한다. / 객체를 선언하지 않아도 호출할 수 있는 - static 써준다.
		return st1;
		
	//다른데서 쓸수 있게 하려고 public으로 선언.
		
	}	
	
	

}
