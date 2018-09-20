package salesTaxPackage;
import javax.swing.JOptionPane;

public class SalesTaxTester {
	/* The Tester for SalesTax */
	public static void main(String[] args) {
		// Ask user for the initial purchase price
		String priceString = JOptionPane.showInputDialog("What was your purchase price?");
		// Convert the input string into the requisite double datatype
		Double price = Double.parseDouble(priceString);
		// Construct the SalesTax calculation by passing in the local and sales tax.
		//  ...if we were smart, we'd make these args user input too!
		SalesTax jamionsPurchase = new SalesTax(6.0, 4.0);
		// Do the calculative work...
		jamionsPurchase.taxCalc(price);
		// Print our calculations and expectations.
		System.out.println("Total Sales Tax Dollars are: "); 
		System.out.println(jamionsPurchase.getSalesTax());
		System.out.println("Expected, assuming a State Tax Rate of 6%, a Local Tax Rate of 4%, and a purchase of $50: 5.0");
		System.out.println("Therefore, total price is: ");
		System.out.println(jamionsPurchase.getTotalPrice());
		System.out.println("Expected, assuming a State Tax Rate of 6%, a Local Tax Rate of 4%, and a purchase of $50: 55.0");
	}
}

