package java_ch06_01;

public class Student {
	
	
	//클래스 내에 선언된 변수 -> 속성, 필드, 멤버변수
	String schoolName = "중앙고등학교";
	String name; // 학생의 이름
	String hakbun ; //학생 학번
	int age ; //학생 나이
	String phone; // 학생의 전화번호
	String address; // 학생의 집주소
	
	int[] scores = new int[3]; // 배열선언
	

		
	// 클래스 내에 선언된 함수 -> 매서드
	public void outputName() {
		System.out.println(name);
	}

}
