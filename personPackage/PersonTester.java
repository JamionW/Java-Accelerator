package personPackage;

public class PersonTester {
	public static void main(String[] args) {
		
		Instructor newWu = new Instructor();
		Student newWilliams = new Student();
		
		newWu.setName("Dalei Wu");
		newWu.setYearOfBirth("1985");
		newWu.setSalary(1000000);

		newWilliams.setName("Jamion Williams");
		newWilliams.setYearOfBirth("1982");
		newWilliams.setMajor("Pottery");
		
		newWu.displayName();
		newWu.displayYearOfBirth();
		newWu.displaySalary();
		
		newWilliams.displayName();
		newWilliams.displayYearOfBirth();
		newWilliams.displayMajor();
	}
}
