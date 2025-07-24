package ch06_04_test;

public class BmiCalculator {
	//BMI의 계산식은 BMI = weight / (height²) 이다. 키와 몸무게를 넣으면 BMI를 출력하는 bmiCalulator 메서드를 가지고 있는 BMI 계산기 클래스를 만드시오.
	//메서드만 
	
	
	public void bmiCalculator (double weigth, double height) {
		double bmi = weigth / (height*height);
		System.out.println("bmi = "+bmi);
	}
		
	public void bmiCalculator (int weigth, int height) { // 메소드 오버로딩
		double bmi = weigth / (height*height);
		System.out.println("bmi = "+bmi);	
		
	}

}

