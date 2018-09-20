package fileNameConcatenatorPackage;

import javax.swing.JOptionPane;

public class FileNameConcatenatorTester {
	public static void main(String[] args) {
		
		// ask for input
		String driveLetterInput = JOptionPane.showInputDialog("Give me a drive letter, please:");
		String pathNameInput = JOptionPane.showInputDialog("Give me a path name, please:");
		String fileNameInput = JOptionPane.showInputDialog("Now give me a file name, please:");
		String fileExtensionInput = JOptionPane.showInputDialog("Finally, give me a file extension, please:");
		
		// construct the Concatenator
		FileNameConcatenator pathInput = new FileNameConcatenator(driveLetterInput, pathNameInput, fileNameInput, fileExtensionInput);
		
		// stitch the string together
		pathInput.stringConcatenator();
		
		// present back to console
		System.out.println("The full name and location of your file is: ");
		System.out.println(pathInput.getFullName());
	}
}
