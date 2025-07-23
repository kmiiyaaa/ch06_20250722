package ch0603_exer;

public class EngineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine engine = new Engine("가솔린",2);
		
		Car car = new Car("소나타", 200, engine);	
		
		car.carEngineType();
		
		
	}

}
