package ch06_05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticTest st1 = new StaticTest (); // st1 인스턴스(객체) 생성
		st1.width=20;
		st1.height=10;   //초기화 완료
		st1.color="red";
		
		StaticTest st2 = new StaticTest (); // st2 인스턴스(객체) 생성
		st2.width=40;
		st2.height=50;
		st2.color="blue";
		// st2.PI=3.141592;  // static final 지정된 PI 값 -> 수정안된다., 상수지정

	}

}
 