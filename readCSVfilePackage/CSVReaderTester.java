package readCSVfilePackage;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class CSVReaderTester {
	public static void main(String[] args) throws FileNotFoundException {
		
		// the console Scanner writes system input to the scanner
		Scanner console = new Scanner(System.in);
		System.out.println("Give me a CSV file and I'll tell you how many lines it has : ");
		String inputFileName = console.next();
		
		// grab a File from the next system input... keep it around
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		
		// instantiate a CSVReader
		CSVReader myCSVReader = new CSVReader(in);
		
		// test numberOfRows()
		System.out.println(myCSVReader.numberOfRows());
		
		System.out.println("Give me a line number in that file. I'll figure out how many characters are in it: ");
		
		// new Scanner! new instantiation of CSVReader!
		Scanner newin = new Scanner(inputFile);
		CSVReader newCSVReader = new CSVReader(newin);
		int rowNum = console.nextInt();
		
		// test numberOfFields()
		System.out.println(newCSVReader.numberOfFields(rowNum));
		
		System.out.println("Now, if you give me a field position on that line, I'll tell you what letter is in that position: ");
		
		// yet another Scanner. yet another CSVReader.
		Scanner new2in = new Scanner(inputFile);
		CSVReader new2CSVReader = new CSVReader(new2in);
		int colNum = console.nextInt();
		
		// test field()
		System.out.println(new2CSVReader.field(rowNum, colNum));
	}
}
