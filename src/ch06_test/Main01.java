package ch06_test;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product prd1 = new Product();
		prd1.name = "상품명";
		prd1.price = 100000;
		prd1.quantify = 2;
		
		int getTotalPrice = prd1.getTotalPrice();
		System.out.println("총 가격: " + getTotalPrice);

	}

}
