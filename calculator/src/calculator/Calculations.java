package calculator;

public class Calculations {
	
	public int add(int a, int b) {
		System.out.print(a + " + " + b + " = " );
		return a+b;
	}
	
	public int subtract(int a, int b) {
		System.out.print(a + " - " + b + " = ");
		return a-b;
	}
	
	public int multiply(int a, int b) {
		System.out.print(a + " * " + b + " = ");
		return a*b;
	}
	
	public double divide(double a, double b) {
		if(b==0) {
			throw new ArithmeticException("Error: Division by 0.");
		}
		else {
			System.out.print(a + " / " + b + " = ");
			return a/b;
		}
	}
}
