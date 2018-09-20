package measurablePackage;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ComparableTester {
	public static void main(String[] args)
	{
		//a list of ten
		final int arraysize = 10;
		
		//construct a new Person() for each arraysize and solicit the user for info
	   Person[] people = new Person[arraysize];
	   for (int i = 0; i < people.length; i++) {
		   people[i] = new Person(JOptionPane.showInputDialog("Give me someone's name?"));
	   }
	   
	   //sort the array--heavy lifting here
	   Arrays.sort(people);
	   
	   //feedback to the user
	   for (int i = 0; i < people.length; i++)
	   {
		   System.out.print(people[i].getPerson() + " ");
		   if ( i == 0 ) {
			   System.out.print(" <-- This is the first lexical item in your array.");
		   } 
		   if ( i == people.length - 1 ) {
			   System.out.print(" <-- This is the last lexical item in your array.");
		   }
		   System.out.printf("%n");
	   }
   }
}
