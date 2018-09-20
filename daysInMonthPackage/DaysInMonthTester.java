package daysInMonthPackage;

import javax.swing.JOptionPane;

public class DaysInMonthTester {
	public static void main(String[] args) {
		
		// ask for input
		String monthNumberInput = JOptionPane.showInputDialog("Please input the number corresponding to a calendar month, 1-12:");

		// construct DaysInMonth
		DaysInMonth calDayGrabber = new DaysInMonth(monthNumberInput);
		
		// run the logic
		calDayGrabber.daysFromMonthNumber();
		
		// return to console
		System.out.println("The number of days in month number " + monthNumberInput + " are:" );
		System.out.println(calDayGrabber.getNumberOfDaysFromMonthNumber());
	}
}
