package ch06_04_test;

public class AverageCalculator {
	// 정수형 배열을 입력하면 배열의 모든 요소의 평균을 출력하는 getAverage 메서드를 가지고 있는 AverageCalculator 클래스를 만드시오.
	
	public void getAverage(int[] arr) {
		int sum=0;
		
		for(int i : arr) {
			sum +=i;
		}
		
		double avg = (double)sum / arr.length;
		System.out.println("평균 :"+ avg);
		

}

}
//메서드만 메서드에 매개변수 배열로	
