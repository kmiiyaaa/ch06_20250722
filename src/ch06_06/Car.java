package ch06_06;

import ch06_06_01.AutoCar; //autocar에서 public 지우면 not visible오류 - 다른데서 가져와서 쓸 수 없다. 

public class Car {
	
	
	public static void main() {
	
	AutoCar ac = new AutoCar(); //다른 패키지 -> import문 반드시 필요!
	
	Tire tire  = new Tire();  // 같은 패키지 / public 없애도 같은패키지면 가져다 쓸수 있다.
	
	// tire.tirename = "금호";  tire에서 private 처리해서 오류난다
	tire.tirePrice = 100000;
	// tire.tirePrint();   tire에서 private 처리해서 오류난다
	
	}
	
	
	
	

}
