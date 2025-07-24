package ch06_04_test;

public class AverageCalculator {
	// 정수형 배열을 입력하면 배열의 모든 요소의 평균을 출력하는 getAverage 메서드를 가지고 있는 AverageCalculator 클래스를 만드시오.
	//메서드만 메서드에 매개변수 배열로	
	
	public void getAverage(int[] arr) { // 메인클래스에 있는 값 받아서 배열, 형식 지정해줌
		
		int sum=0;
		
		for(int i : arr) {
			sum +=i;
		}
		
		double avg = (double)sum / arr.length;  //둘중에 하나만 (double) 바꿔줘도 된다.
		System.out.println("평균 :"+ avg);
		

}

}

