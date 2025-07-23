package ch06_test;

public class Movie {

	String title; 
	String genre; 
	int runtime;

	
	public Movie() {  //  기본 생성자 -> 안에 변수 따로 선언x , 일단은 기본생성자 만들어놓는게 좋다
	   
	 }
	
	
	
	
	/*
	public Movie{        생성자는 원하는 것만 매개변수 추가 가능
	Srtring title;
	 int runtime;
	}
	*/ 
	
	public Movie (String title, String genre, int runtime) { // 새로운 생성자 추가 , 이름이 같아도 안에 매개변수가 달라서 다른걸로 인식
		this.title = title;  // = t; 이름 다르게 설정은 가능하나 가독성 떨어짐
		this.genre = genre;
		this.runtime = runtime;
	}
	
	
	// 명시적으로 다른 생성자를 만든 경우 기본생성자는 생략 할 수 없다





	public boolean isLongMovie() {
		if (runtime>=120) {
		return true;
	}else {
		return false;
	}
	
		//public boolen isLongMovie() {
		// return runtime>=120;	
		
	}


	
}
