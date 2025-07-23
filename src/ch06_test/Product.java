package ch06_test;

public class Product {

	String name ;
	int price;
	int quantity;
	
	public Product(String name, int  price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	//나중에 수량 많아지면
	// int result = price * quantity; 선언하고 써주는게 낫다.
	
	public int getTotalPrice() { // 총 가격 메서드
		return price * quantity;
	}
	

}
