package ch06_03;

public class Rectangle { //사각형 클래스
	
	int width; // 사각형 가로길이
	int height;  // 사각형 세로길이

	
	
	
	public Rectangle() { // 기본 생성자(생략가능) -> 반환타입이 아예없고, 이름이 해당클래스의 이름으로 고정되어있다.
 		
	}
//	
//	public Rectangle(int width, int height) {  // (괄호안에 매개변수)
// 		this.width = width;      // 관례상 위에 ing~ 한거랑 이름 같이 써야한다 그때 this 같이 써줌 -> 다시 제대로 보기
// 		this.height = height;
//	}


	public Rectangle(int width, int height) { // 오른쪽 마우스 - source - generate constructor usingfield로 만든거
		this.width = width;
		this.height = height;
	}




	public int rectArea() { // 사각형 면적 반환 메소드 
		return width * height;
	}
}
