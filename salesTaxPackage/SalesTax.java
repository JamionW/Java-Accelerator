package salesTaxPackage;

public class SalesTax {
	// get our private vars set up
	private double stateTaxRate;
	private double localTaxRate;
	private double taxDollars;
	private double initialPrice;
	private double totalPrice;
	
	// construct SalesTax with the requisite inits
	public SalesTax() {
		stateTaxRate = 0;
		localTaxRate = 0;
	}
	
	// grab the proper vars from the main program
	public SalesTax(double stateTax, double localTax) {
		stateTaxRate = stateTax;
		localTaxRate = localTax;
	}
	
	/* 
	 * Calculate the amount, in dollars, of tax which the previously given
	 *  tax rates generate as a function of @param purchasePrice.
	 */
	public void taxCalc(double purchasePrice) {
		initialPrice = purchasePrice;
		taxDollars =  (purchasePrice * (stateTaxRate / 100)) + (purchasePrice * (localTaxRate / 100));
		totalPrice = initialPrice + taxDollars;
	}
	
	// The method to return the total Sales Tax 
	public double getSalesTax() {
		return taxDollars;
	}
	
	// The method to return the total price
	public double getTotalPrice() {
		return totalPrice;
	}
}
