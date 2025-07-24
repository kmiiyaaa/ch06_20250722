package ch06_04_test;


public class Book {
	//책이름 ,가격 -필드
	// 생성자로 필드 초기화
	
	
	
	//클래스 내에 선언된 변수 -> 속성, 필드, 멤버변수
	String name;
	int price;
	
	
	//생성자
	public Book() {

	}


	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	
	//메소드
	public void printInfo() {
		System.out.println("책이름 :"+ name);
		System.out.println("가격 :" + price);
	}

	
	
	
	
	
	
	
	

	
	
	
	
	
	
       
	

}
