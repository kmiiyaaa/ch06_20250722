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
	   
   }
	

	
	
	
		
	}


//매개변수와 인자값 차이 구별하기!

 