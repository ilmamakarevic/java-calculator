package calculator;

import java.util.Scanner;  // Import the Scanner class

public class Main {

	public static void main(String[] args) {
		
		Caluclations clc = new Caluclations();
		
		// System.out.println(clc.add(-12, 3));
		// System.out.println(clc.subtract(3, 5));
		// System.out.println(clc.multiply(0, 3));
		// System.out.println(clc.divide(6, -3));
		// System.out.println(clc.remainder(5, 2));
		// System.out.println(clc.exponentiation(5, 2));
		// System.out.println(clc.squareRoot(5));

		Scanner myObj = new Scanner(System.in); //for user input

		// System.out.println("Enter a number: ");
		
		int number1 = myObj.nextInt();
		char operation = myObj.next().charAt(0);

		do {
			

			switch (operation) {
				case '+':
					int number2 = myObj.nextInt();
					System.out.println(clc.add(number1, number2));
					break;

				case '-':
					int number3 = myObj.nextInt();
					System.out.println(clc.subtract(number1, number3));
					break;

				case '*':
					int number4 = myObj.nextInt();
					System.out.println(clc.multiply(number1, number4));
					break;

				case '/':
					int number5 = myObj.nextInt();
					System.out.println(clc.divide(number1, number5));
					break;

				case '%':
					int number6 = myObj.nextInt();
					System.out.println(clc.remainder(number1, number6));
					break;

				case '^':
					int number7 = myObj.nextInt();
					System.out.println(clc.exponentiation(number1, number7));
					break;

				case 's':
					System.out.println(clc.squareRoot(number1));
					break;
				
				// case '=':
				default:
					break;
			}
		} while (operation != 'q' || operation != 'Q');
		

	}

}
