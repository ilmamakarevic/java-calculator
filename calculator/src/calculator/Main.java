package calculator;

public class Main {

	public static void main(String[] args) {
		
		Calculations clc = new Calculations();
		
		System.out.println(clc.add(-12, 3));
		System.out.println(clc.subtract(3, 5));
		System.out.println(clc.multiply(0, 3));
		System.out.println(clc.divide(6, -3));
		
	}

}
