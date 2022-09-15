package uses_of_this;

public class Person {
	private String name;
	private long cin;

	public Person() {
		this.name = "Default Name";
		this.setCin(123456);
	}

	public Person(String name) {
		this.name = name;
		this.cin = 123456;
	}
	
	//Person p1 = new Person("John", 1234546);
	public Person(String name, long cin) {
		//Calling another constructor using this().
		this(name);
		this.cin = cin;
	}
	
	
	
	
	
	public void setCin(long cin) {
		this.cin = cin;
	}
	
	
	
	
}
