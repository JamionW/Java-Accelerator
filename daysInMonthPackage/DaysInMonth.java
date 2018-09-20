package daysInMonthPackage;

public class DaysInMonth {
	private int monthNumber;
	private int numberOfDays;

	// grab input from main as format as number
	public DaysInMonth(String monthNumberInput) {
		monthNumber = Integer.parseInt(monthNumberInput);
	}
	
	// run through the logic to determine which month number gets which days assignment
	public void daysFromMonthNumber() {
		if (monthNumber == 2) 
		{
			numberOfDays = 28;
		} 
		else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11)
		{
			numberOfDays = 30;
		}
		else if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12)
		{
			numberOfDays = 31;
		}
	}
	
	// return to main
	public int getNumberOfDaysFromMonthNumber() {
		return numberOfDays; 
	}
}
