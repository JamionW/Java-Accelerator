package taxBracketCalculatorPackage;

public class TaxBracketCalculator {
	private double userSalary;
	private double tierTax;
	
	//the below constants are the maximum accruable tax between each tier
	final double maxTierOne = 500.00;
	final double maxTierTwo = 500.00;
	final double maxTierThree = 750.00;
	final double maxTierFour = 6000.00;
	final double maxTierFive = 12500.00;
	
	// grab user salary from main
	public TaxBracketCalculator(double userSalaryInput) {
		userSalary = userSalaryInput;
	}
	
	// establish the amount of tax needed by calculating which bracket
	// the user's salary falls in and then calculating the amount of tax 
	// applicable to that bracket PLUS the maximum amount of tax accumulated
	// from previous brackets... i.e. the aggregate amount.
	public void tierPicker() {
		if ( userSalary <= 50000.00 ) {
			tierTax = userSalary * .01;
		} else if ( userSalary > 50000.00 && userSalary <= 75000.00 ) {
			tierTax = ((userSalary - 50000.00) * .02) + maxTierOne;
		} else if ( userSalary > 75000.00 && userSalary <= 100000.00 ) {
			tierTax = ((userSalary - 75000.00) * .03) + maxTierOne + maxTierTwo;
		} else if ( userSalary > 100000.00 && userSalary <= 250000.00 ) {
			tierTax = ((userSalary - 100000.00) * .04) + maxTierOne + maxTierTwo + maxTierThree;
		} else if ( userSalary > 250000.00 && userSalary <= 500000.00 ) {
			tierTax = ((userSalary - 250000.00) * .05) + maxTierOne + maxTierTwo + maxTierThree + maxTierFour;
		} else if ( userSalary > 500000.00 ) {
			tierTax = ((userSalary - 500000.00) * .06) + maxTierOne + maxTierTwo + maxTierThree + maxTierFour + maxTierFive;
		}
	}

	//return back to main
	public double getTierTax() {
		return tierTax;
	}
	
}
