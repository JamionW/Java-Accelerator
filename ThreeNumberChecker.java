package threeNumberPackage;

import java.util.Scanner;

public class ThreeNumberChecker {
	public static void main(String[] args) {
		//the max length of the array (the "zero"-ness of the first position is handled in the while loop below)
		final int ARRAYMAX = 3;
		//init the array and static positional
		int[] myArray = new int[ARRAYMAX];
		int position = 0;
		
		System.out.println("Please enter any three whole numbers.");
		
		//capture input from the console
		Scanner in = new Scanner(System.in);
		while (position < myArray.length)
		{
			myArray[position] = in.nextInt();
			position++;
		}
		
		//do a simple arithmetic test to determine the sequence
		// and report back to console
		if (myArray[0] > myArray[1] && myArray[1] > myArray[2])
		{
			System.out.println("The sequence you entered is a decreasing series of numbers.");
		} 
		else if (myArray[2] > myArray[1] && myArray[1] > myArray[0])
		{
			System.out.println("The sequence you entered is an increasing series of numbers.");
		} 
		else
		{
			System.out.println("The sequence you entered is neither constantly decreasing or increasing.");
		} 
	}
}
