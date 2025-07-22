package ch06_test;

public class Product {

	String name ;
	int price;
	int quantify;


	public int getTotalPrice() { // 총 가격 메서드
		return price * quantify;
	}
	

}
