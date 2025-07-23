package ch0603_exer;


public class Circle {
	
	int radius;  //반지름
	double PI = 3.14;   // 변경할 수 없는값(상수) - 파이값

	
	public Circle() { //기본생성자
		
	}


	public Circle(int radius) { // 파이값은 이미 값이 설정되어있어서 radius만 
		this.radius = radius;
	}
	
	
	//원의 입력된 반지름을 가진 원의 면적을 반환하는 메서드
	// circleArea
	
	public double circleArea() {
		return radius * radius * PI;
	
	}
	
	
}
