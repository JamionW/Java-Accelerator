package commaStripPackage;
import javax.swing.JOptionPane;

public class CommaStripTester {
	public static void main(String[] args) {
		/* Storing the below code away to "future-proof" for any delimiter
		 * 
		String delimiterString = JOptionPane.showInputDialog("Give me a delimiter (I suggest a comma):");
		String commaStrIn = JOptionPane.showInputDialog("Give me a number with that delimiter in it.");
		 * 
		 */
		
		// The assignment asks for the comma constant
		final String delimiterString = ",";
		
		// ask for input
		String commaStrIn = JOptionPane.showInputDialog("Give me a number with a comma in it.");
		
		// construct the program and run its component parts in order
		CommaStrip commaNumber = new CommaStrip(commaStrIn);
		commaNumber.stringLength(commaStrIn);
		commaNumber.grabDelimiterPrefix(commaStrIn, delimiterString);
		commaNumber.carveString(commaStrIn, commaNumber.getDelimiterIndex());
		commaNumber.removeFirstDelimiter(commaNumber.getFirstSubstring(), commaNumber.getLastSubstring());
		
		// provide output to the console
		System.out.println("The length of your string is: ");
		System.out.println(commaNumber.getStringLength());
		System.out.println("The first occurrence of the given delimiter in your string is: ");
		System.out.println(commaNumber.getDelimiterIndex());
		System.out.println("The first part of your string is: ");
		System.out.println(commaNumber.getFirstSubstring());
		System.out.println("The last part of your string is: ");
		System.out.println(commaNumber.getLastSubstring());
		System.out.println("Therefore, your sanitized string is: ");
		System.out.println(commaNumber.getStringNoDelimiter());
	}
}
