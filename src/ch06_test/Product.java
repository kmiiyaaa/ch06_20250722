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


	public int getTotalPrice() { // 총 가격 메서드
		return price * quantity;
	}
	

}
