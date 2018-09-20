package taxBracketCalculatorPackage;

import javax.swing.JOptionPane;

public class TaxBracketCalculatorTester {
	public static void main(String[] args) {
		
		// ask for input
		String userSalaryInputString = JOptionPane.showInputDialog("What is your salary? Please include to two decimal places.");
		Double userSalaryInput = Double.parseDouble(userSalaryInputString);
		
		// construct
		TaxBracketCalculator taxTime = new TaxBracketCalculator(userSalaryInput);
		
		// calculate the tax
		taxTime.tierPicker();
		
		// return to console
		System.out.println("The full amount of tax you are liable for is: ");
		System.out.println(taxTime.getTierTax());
	}
}
