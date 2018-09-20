package personPackage;

public class Person {
	private String name;
	private String yearOfBirth;
	
	//construct
	public Person() {
		name = "";
		yearOfBirth = "";
	}
	
	//receive the name from main
	public void setName(String nameText) {
		name = nameText;
	}
	
	//receive the yob from main
	public void setYearOfBirth(String yearOfBirthText) {
		yearOfBirth = yearOfBirthText;
	}
	
	//display the name in main
	public void displayName() {
		System.out.println(name);
	}
	
	//display the yob in main
	public void displayYearOfBirth() {
		System.out.println(yearOfBirth);
	}
}
