package ch06_test;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Temperature tem1 = new Temperature();
		tem1.celsius = 14.0;
		
		double toFahrenheit = tem1.toFahrenheit();
			System.out.println("화씨 온도: " + toFahrenheit);

		
	}

}
