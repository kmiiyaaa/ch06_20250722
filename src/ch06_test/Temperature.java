package ch06_test;

public class Temperature {
	
	double celsius;
	
	public Temperature (double celsius) {
		this.celsius = celsius;
	}
    
	public double toFahrenheit() {
	
	 return (celsius * 1.8) + 32;
	 
	// double fahrenheit = celscius*1.8+32  먼저 선언		
    // return fahrenheit;
}

	
	
}

