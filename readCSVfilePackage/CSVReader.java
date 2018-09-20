package readCSVfilePackage;

import java.util.Scanner;
import java.util.*;

public class CSVReader {
	
	//initialize the variables needed for logical operations
	private Scanner fileIn;
	int rows = 0;
	String currRow = "";
	String currField = "";
	int runningAverageTotal = 0;
	int average = 0;
	
	//constructor
	public CSVReader(Scanner f) {
		fileIn = f;
	}
	
	//isNumeric() is a private tester for numeric Strings
	private boolean isNumeric(String s) {  
		  try {  
		    Integer.parseInt(s);  
		  }  
		  catch(NumberFormatException nfe) {  
		    return false;  
		  }  
		  return true;  
		}
	
	//numberOfRows() will return the number of Rows in the file
	// given to the Scanner.
	public int numberOfRows() {
		rows = 0;
		
		//read the number of rows by incrementing var "rows" 
		// by one until nextLine() returns false
		while (fileIn.hasNextLine()) {
			rows++;
			fileIn.nextLine();
		}
		
		return rows;
	}
	
	//numberOfFields() applies the same logic as numberOfRows()
	// but then looks for the given var row() until found,
	// dumps it to a string, and returns the length of that string
	public int numberOfFields(int row) {
		rows = 0;
		while (fileIn.hasNextLine()) {
			rows++;
			if (row == rows) {
				currRow = fileIn.nextLine();
			}
			fileIn.nextLine();
		}
		
		return currRow.length();
	}
	
	//field() applies the logic of numberOfRows() and 
	// numberOfFields(), but then substrings the currRow
	// until the given field value is found.
	public String field(int row, int column) {
		rows = 0;
		while (fileIn.hasNextLine()) {
			rows++;
			if (row == rows) {
				currRow = fileIn.nextLine();
				currField = currRow.substring(column - 1, column);
			}
			fileIn.nextLine();
		}
		
		return currField;
	}
	
	//fieldAverage() supplies the average of all integer
	// values within a given column.
	public int fieldAverage(int column) {
		rows = 0;
		String tempField = "";
		while (fileIn.hasNextLine()) {
			try {
				//use split to substring the line based on CSV
				String[] temparray = fileIn.next().split(",");
				if (column - 1 < temparray.length) {
					//find the given column number
					tempField = temparray[column - 1];
					//test isNumeric()
					if (this.isNumeric(tempField)) {
						//have to ++ rows here! or else average doesn't work!
						rows++;
						runningAverageTotal = runningAverageTotal + Integer.parseInt(tempField);
					}
				}
				fileIn.nextLine();
			} 
			catch(NoSuchElementException nsee) {
				runningAverageTotal = runningAverageTotal + 0;
			}
		}
		
		average = runningAverageTotal / rows;
		
		return average;
	}
}
