package calculator;

public class Caluclations {
	
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

	public int remainder(int a, int b) {
		System.out.print(a + " % " + b + " = ");
		return a%b;
	}
	
	public int exponentiation(int a, int b) {
		int result=1;
		
		if(b==0) {
			return 1;
		}
		else if(b==1) {
			return a;
		}
		else {
			for(int i = 1; i<=b; i++) {
				result = result*a;
			}
			return result;
		}
	}
	
	public double squareRoot(double a) {
		System.out.print("Square root of " + a );
		return Math.sqrt(a);
	}
}
