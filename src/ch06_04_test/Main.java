package ch06_04_test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번
		Book book = new Book("책이름", 10000);
		book.printInfo();
		
		
		//2번
		StringTool st1 = new StringTool();
		st1.printLength("안냥하세요");
		
		
		//3번
		AverageCalculator ac1 = new AverageCalculator();  //다시보기
		ac1.getAverage(new int[] {10, 20, 30, 40, 50});
		
		
		//4번
		BmiCalculator bc1 = new BmiCalculator();
		bc1.bmiCalculator(60, 127);
		
		//5번
		Rectangle rc1 = new Rectangle(2,3);
		rc1.printRectangle();
		
		
		//6번
		Triangle t1 = new Triangle();
		boolean r1 = t1.isValid(3, 4, 5);
		System.out.println(r1);
		

	}

}
