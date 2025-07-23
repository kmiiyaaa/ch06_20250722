package ch06_04_test;

public class Rectangle {
	//사각형의 가로와 세로 길이를 입력받아 사각형의 둘레를 출력하는 Rectangle 클래스를 만드시오. 
	//단, 생성자에서 가로와 세로를 입력 받고 가로와 세로 길이는 정수와 실수 모두 입력받을 수 있도록 생성하시오.
double width;
double height;
	
	
	public Rectangle(int width,int height) { 
		this.width = width;
		this.height = height;
		}
	
	public Rectangle(double width,double height) {
		this.width = width;
		this.height = height;
		}
	
	
	public void printRectangle() {
		double doubleLength = (width + height)*2;
		System.out.println(doubleLength);
	}

}
//생성자 오버로딩, 정수와 실수 모두 입력 박을 수 있도록 생성