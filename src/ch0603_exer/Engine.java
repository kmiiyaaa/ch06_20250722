package ch0603_exer;

public class Engine {
	
	String type;
	int displacement; //배기량
	
	
	public Engine() {
	}


	public Engine(String type, int displacement) {
		this.type = type;
		this.displacement = displacement;
	}


	public void printEngine() { //메서드
	 System.out.println("엔진타입 :" + type); //print는 값을 리턴하는게아니고 화면에 찍는거라 void 써준다
	}


}
