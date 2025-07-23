package ch06_04;

public class Rectangle {
	
	int width;
	int height;
	String color;
	
	
	public Rectangle() {
		
	}
	
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}


	public Rectangle(int width, int height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	
	//메소드 오버로딩 - 개념알고 있기 , 다시보기
	//메소드는 같은이름이면 쓸 수 없지만 , 매개변수를 다르게...?  매개변수와 오버로딩차이?
	
	public int rectArea() {
		return width*height;
	}
	
	public int rectArea(int width, int height) {
		return width * height;
	}
	
	public int rectArea(int width) {
		return width * this.height;
	}
	
	// public int rectArea(int w) {  이름만 바꾼다고 다른게 아니다. 위에와 같은걸로 처리
	// return w * this.height;
     //}
	
	
	
}
