package ch06_04_test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번
		Book book = new Book("책이름", 10000); 
		book.printInfo();
		
		
		System.out.println("-----------------------");
		
		
		//2번 
		// 생성자 따로 만들지 않아서 기본생성자만 있다
		StringTool st1 = new StringTool();
		st1.printLength("안냥하세요");
		
		System.out.println("-----------------------");
		
		
		//3번
		AverageCalculator ac1 = new AverageCalculator();  
		ac1.getAverage(new int[] {10, 20, 30, 40, 50});
		
		//혹은 배열값 미리선언해서가능
		// int[] scores = {10,20,30,40,50};
		//ac1.getAverage(scores);
		
		System.out.println("-----------------------");
		
		
		//4번
		BmiCalculator bc1 = new BmiCalculator();
		bc1.bmiCalculator(60, 127);
		
		System.out.println("-----------------------");
		
		//5번
		Rectangle rc1 = new Rectangle(2,3);
		rc1.printRectangle();

		System.out.println("-----------------------");
		
		//6번
		Triangle t1 = new Triangle();
		boolean r1 = t1.isValid(3, 4, 5);
		System.out.println(r1);
		//System.out.println(t1.isValid(3, 4, 5));

	}

}
