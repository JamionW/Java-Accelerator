package readCSVfilePackage;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class CSVReaderTester_ColumnAverage {
	public static void main(String[] args) throws FileNotFoundException {
		
		// the console Scanner writes system input to the scanner
		Scanner console = new Scanner(System.in);
		System.out.println("Give me a CSV file, please: ");
		String inputFileName = console.next();
		
		// grab a File from the next system input... keep it around
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		
		// instantiate a CSVReader
		CSVReader myCSVReader = new CSVReader(in);
		
		// grab a column from the user
		System.out.println("Give me a column and I'll compute the average of all its integers: ");
		int colNum = console.nextInt();
		
		// test fieldAverage()
		System.out.println(myCSVReader.fieldAverage(colNum));
	}	
}
