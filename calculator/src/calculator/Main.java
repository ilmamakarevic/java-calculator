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
		char operation;
		double result = 0;
		boolean firstIn = true;

		System.out.println("Key + triggers sum operation.\n Key - triggers subtraction operation.\n Key * triggers multiplication.\n Key / triggers division.\n Key ^ triggers exponentiation.\n Key s triggers square root operation.\n Key % triggers remainder operation.\n Key = triggers particular operation to execute.\n To quit program use 'q' or 'Q'\n  ");

		do {
			if(firstIn){
				result = myObj.nextDouble();
				firstIn = false;
			} else {
				System.out.print("Do you want to continue with the previous result (" + result + ") or enter a new number? (Enter 'c' for continue or 'n' for new): ");
                char choice = myObj.next().charAt(0);
                
                if (choice == 'n') {
                    System.out.print("Enter a new number: ");
                    result = myObj.nextDouble();  // Get a new number
                }
				else if(choice == 'q'){
					System.out.println("End.");
					break;
				}
			}

			operation = myObj.next().charAt(0); //enter operation

			if(operation == 'q' || operation == 'Q'){
				System.out.println("End.");
				break;
			}

			double number2 = 0;

            if (operation != 's' && myObj.hasNextDouble()) {
                number2 = myObj.nextDouble();
            } else {
				
			}

			switch (operation) {
				case '+':
					result = clc.add(result, number2);
					break;

				case '-':
					result = clc.subtract(result, number2);
					break;

				case '*':
					result = clc.multiply(result, number2);
					break;

				case '/':
					result = clc.divide(result, number2);
					break;

				case '%':
					result = clc.remainder(result, number2);
					break;

				case '^':
					result = clc.exponentiation(result, number2);
					break;

				case 's':
					result = clc.squareRoot(result);
					break;
				
				default:
					System.out.println("Error. Try again. ");
					break;
			}
			System.out.println(result);
			
		} while (true);
	
		myObj.close();

	}

}
