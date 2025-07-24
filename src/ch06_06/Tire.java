package ch06_06;

public class Tire {
	
	private String tirename ; // 접근 못하고 보호하기 위해 private 사용 / private 입력시 해당 클래스 내에만 변수 사용 가능해서 참조하고있던 Car class에서 오류난다. 
	int tirePrice ; 
	
	// private void tirePrint() {    // public -> private로 바꾸면 클래스 내에서만 사용 가능 / 다른 클래스에서 참조하고 있었다면 오류남
	 protected void tirePrint() { // protected -> 같은 패키지 내에서만 접근 가능한 메소드로 지정
		System.out.println("타이어!");

	}
	
	// 변수 : private / 생략
	// 메소드 : private /  pulic 사용

}
