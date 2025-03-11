package calculator;

public class Caluclations {
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public double subtract(double a, double b) {
		return a-b;
	}
	
	public double multiply(double a, double b) {
		return a*b;
	}
	
	public double divide(double a, double b) {
		if(b==0) {
			throw new ArithmeticException("Error: Division by 0.");
		}
		else {
			return a/b;
		}
	}

	public double remainder(double a, double b) {
		return a%b;
	}
	
	public double exponentiation(double a, double b) {
		double result=1;
		
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
		System.out.print("Square root of " + a + " is " );
		return Math.sqrt(a);
	}
}
