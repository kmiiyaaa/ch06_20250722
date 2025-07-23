package ch0603_exer;

import java.nio.channels.Pipe.SourceChannel;

public class Car {
	
	String name;
	int maxspeed;
	
	Engine engine; //Engine 클래스로 만든 객체를 필드(멤버변수) 선언

	
	public Car() {
	}


	public Car(String name, int maxspeed, Engine engine) { //마지막은 엔진 클래스로만든 객체 넣어주기
		this.name = name;
		this.maxspeed = maxspeed;
		this.engine = engine;
	}
	
	
	public void carEngineType() {
		System.out.println("엔진타입:" + engine.type);
		engine.printEngine();
	}
	
	// -------------------------------------ch06-04 리턴값

	public Engine outputEngine() {  //타입에 클래스 Engine 넣으면 된다.
		engine.type = "디젤";
		engine.displacement = 2;
		return engine;
	}
	
	public String[] outputCars() {  
		String[] cars = {"소나타", "아반떼", "k5"};
		
		carEngineType(); //클래스 안에서 서로 불러서 메서드 사용 가능
		
		return cars; //배열
}

}
