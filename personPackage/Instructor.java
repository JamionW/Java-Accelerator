package personPackage;

//this is a subclass of the Person superclass

public class Instructor extends Person {

	private int salary;
	
	//get salary from main
	public void setSalary(int salaryInt) {
		salary = salaryInt;
	}
	
	//return salary to main
	public void displaySalary() {
		System.out.println(String.valueOf(salary));
	}
}
