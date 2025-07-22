package java_ch06_01;

public class Triangle {

	//삼각형의 추상화 -> 속성 필드 멤버변수
	int height;
	int width;
	String color;
	
	//메소드
	
	//삼각형 면적
  public double triangleArea() {
//	 double area = hgight * width *0.5;
//	 return area; // 반환 , 값이 하나씩 들어간다
	 
	 return height*width*0.5;  //간단한 수식에 사용
  }// 반환값이 없는 매서드 일때
  
  
//삼각형의 color 변환
  public String trianglecolor() {
	 System.out.println("삼각형의 색 :"+color );
	 return color;
  }
}
