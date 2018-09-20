package measurablePackage;

public class Person implements Comparable<Person> {
	
	private String person;
	
	//construct
	public Person() {
		person = "";
	}
	
	//grab input from main
	public Person(String inputPerson) {
		person = inputPerson;
	}
	
	
	//return to main
	public String getPerson() {
		return person;
	}

	//simple override of compareTo
	public int compareTo(Person o) {
		return this.person.compareTo(o.person);
	}

}
