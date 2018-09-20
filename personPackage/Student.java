package personPackage;

//this is a subclass of the Person superclass

public class Student extends Person {

	private String major;
	
	//get major from main
	public void setMajor(String majorText) {
		major = majorText;
	}
	
	//return major to main
	public void displayMajor() {
		System.out.println(major);
	}
}
