package ch06_04;

public class Calculator {

	public int add(int num1, int num2) {  // 메서드 생성당시 만들때 선언하는 변수 -> 매개변수
		return num1+num2;
		
	}	
	public int minus(int num1, int num2) { 
		return num1-num2;
	}
		
	public int mul(int num1, int num2) { 
		return num1*num2;
	}
	
	public int divid(int num1, int num2) { 
		return num1/num2;
	}
	
	public int total (int[] numbers) {
		int total=0;
		for(int num : numbers) {
			total = total + num;
		
		}
		return total;
		
//		System.out.println("안녕!!!"); ->  return문 뒤에 나오는 코드는 실행되지 않음, 에러
		
	}
	
	
	}
	

