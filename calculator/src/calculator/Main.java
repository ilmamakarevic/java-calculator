package calculator;

public class Main {

	public static void main(String[] args) {
		
		Caluclations  clc = new Caluclations();
		
		System.out.println(clc.add(-12, 3));
		System.out.println(clc.subtract(3, 5));
		System.out.println(clc.multiply(0, 3));
		System.out.println(clc.divide(6, -3));
		System.out.println(clc.remainder(5, 2));
		System.out.println(clc.exponentiation(5, 2));
		System.out.println(clc.squareRoot(5));
	}

}
