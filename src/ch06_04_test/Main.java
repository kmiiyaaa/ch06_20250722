package ch06_04_test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번
		Book book = new Book("책이름", 10000);  // 이게 실행하게되면 - book이란 이름의 인스턴스가 생김 - 열어보면 안에 name, price있어서 사용할 수 있음
		book.printInfo();
		
		// new Book 선언 없으면 -> name.price 사용할수 없다
		// 인스턴스화 전에 사용하지 못하는건 인스턴스멤버
		
		//만약 static int price; 선언시 - price 객체 메모리 생성 여부와 상관없이 메모리에 생긴다 
		
		//정적멤버들은 객체선언 여부과 상관없이 그냥 가져다 쓸 수있다. 
		// System.out.println(Book.price);  - price 정적멤버로 선언한경우 다른내용 없어도 '클래스이름.static변수이름(여기선 price)' 쓰면 사용가능하다 
		
		//static final 붙여 선언하면 - 더이상 수정 x , 초기화 x -> 상수화 된다.
		
		// final String name; 으로 선언시 - 초기값 지정후(초기화 후) 값 수정불가능 -> 초기값 넣은 객체만 사용가능 , 기본생성자 쓴경우는 사용불가 <참고>
		
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
