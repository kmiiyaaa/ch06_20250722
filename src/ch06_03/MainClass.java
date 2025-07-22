package ch06_03;

import java.security.PublicKey;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rec1 = new Rectangle(); // 객체 선언 -> 생성자 호출
		rec1. width = 10;
		rec1. height = 20;
		int rec1Area = rec1.rectArea();
		System.out.println(rec1Area);
		
		
		Rectangle rec2 = new Rectangle(100,200); // 생성자에 매개변수 입력한거 없으면 에러난다.! Rectangl에 public Rectangle(int width, int height) 
		
	}

}
