package floatingPointNumberReaderPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatingPointNumberReaderTester {
	public static void main(String[] args) {
		
		//init work vars
		double rollingTotal = 0.0;
		int errors = 0;
		
		//build the Scanner and explain input to user
		Scanner console = new Scanner(System.in);
		System.out.println("Give me a number, and press ENTER.");
		System.out.println("You can keep entering numbers until you enter two non-numeric values.");
		System.out.println("At the end of it, I'll add all your numbers together!");
		
		//keep track of the rolling total of input doubles 
		// until two errors are reached
		do {
			try {
				rollingTotal = rollingTotal + console.nextDouble();
			}
			catch (InputMismatchException ime) {
				errors++;
			}
			console.nextLine();
		} while (errors < 2);

		//output the total to user
		System.out.println("Thanks! Your total is: ");
		System.out.println(rollingTotal);
	}
}
