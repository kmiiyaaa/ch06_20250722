package ch06_04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Calculator c1 = new Calculator();
	
	int ad = c1.add(20, 10); // 인자값 -> 넣어서 계산하는 값
	System.out.println(ad);

	int mi = c1.minus(20, 10); // 인자값 -> 넣어서 계산하는 값
	System.out.println(mi);

	int mu = c1.mul(20, 10); // 인자값 -> 넣어서 계산하는 값
	System.out.println(mu);

	int di = c1.divid(20, 10); // 인자값 -> 넣어서 계산하는 값
	System.out.println(di);

	
   //  System.out.println(c1.total(new int[] {10,20,30}));
    
    int[] arr= {10,20,30};
    c1.total(arr);
	   
   
	//생성자 오버로딩
	Rectangle r1 = new Rectangle(20, 10, "blue"); // 모두 다있는 3번째 생성자
	Rectangle r2 = new Rectangle(100,200); //  color 매개변수 없는 2번째 생성자 
	Rectangle r3 = new Rectangle();
	
	
	//메소드 오버로딩
	int area1 = r1.rectArea();  //200
	int area2 = r1.rectArea(200);  //2000
	int area3 = r1.rectArea(30,40); // 1200
	
	
	
	System.out.println(area1); 
	System.out.println(area2);
	System.out.println(area3); 
		

	
	}
		
	}


//매개변수와 인자값 차이 구별하기!

 