package ch0603_exer;

public class Calculator {
	
	int num1;
	int num2;
	
	public Calculator() {
		
	}

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	/*
	public void result() { 
		System.out.println( num1+num2); 
		System.out.println( num1-num2); 
		System.out.println( num1*num2);
		System.out.println( num1/num2); 
	}
	 */
	
	 public void add() { 
		System.out.println( num1+num2); 
		}
		
	public void minus() { 	
		System.out.println( num1-num2); 
		}
		
	public void smul() { 	
		System.out.println( num1*num2);
		}
		
	public void divid() { 	
		System.out.println( num1/num2); 
	}
	 
	public void square() { 	//제곱
		System.out.println( num1*num1); 
		System.out.println( num2*num2); 
	}
	 
	 
	 
	
	
    

}
