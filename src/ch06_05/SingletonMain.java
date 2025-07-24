package ch06_05;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	SingletonTest01 st1 = new SingletonTest01();   --- singletontest01에서 주석처리한 내용 확인용 main 만듬
	
		
	//	SingletonTest01 s1 = new SingletonTest01(); -error
//		SingletonTest01 s2 = new SingletonTest01(); 
//		SingletonTest01 s3 = new SingletonTest01(); 
		//	s1.getgetInstance();
		
	
		//	SingletonTest01.getInstance(); //return SimgletomTest객체를 선언 , 이렇게 바로 할 수 없다.
		
		SingletonTest01 st1 = SingletonTest01.getInstance();  // SingletonTest01 객체를 변환

		SingletonTest01 st2 = SingletonTest01.getInstance(); //검증을 위해 생성 - 힙영역?에 하나만 있는건지 확인

		if(st1 == st2) {
			System.out.println("같은 객체를 참조하고 있습니다!");
		} else {
			System.out.println("다른 객체를 참조하고 있습니다!");
		}
		
		
		final int scr = 400; // 상수 400으로 고정 , 아무 클래스에서나 불러쓸 수 있는 정적멤버이자 상수 
		//scr=1000;  scr이 final로 인해 값을 변경할 수 없는 변수가 되어 에러발생
		
		
	} 

}
