package class_examples;

public class Person implements Attack, Comparable<Person> {
	private String lastName;
	private String firstName;
	private int age;
	private double gpa;

	public Person() {
		
	}
	
	public Person(String lastName, String firstName, int age, double gpa) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.gpa = gpa;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return lastName + ";" + firstName + ";" + this.age ;
	}

	@Override
	public void canAttack() {
		System.out.println("Throws a spear.");	
	}

	@Override
	public int compareTo(Person o) {
		
		if (this.age < o.age) {
			return -1;
		}
		else if (this.age > o.age) {
			return 1;
		}
		else  {
			return 0;
		}
		
	}
	
	
	
	/*CompareTo Sorting by Last Name First Name*/
//	@Override
//	public int compareTo(Person o) {
//		
//		int result = this.lastName.compareTo(o.lastName);
//		
//		if (result == 0) {
//			return this.firstName.compareTo(o.firstName);
//		}
//		else {
//			return result;
//		}
//		
//		
//			
////		if (this.lastName.compareTo(o.lastName) < 0) {
////			return -1;
////		}
////		else if (this.lastName.compareTo(o.lastName) > 0) {
////			return 1;
////		}
////		else {
////			if (this.firstName.compareTo(o.firstName) < 0) {
////				return -1;
////			}
////			else if (this.firstName.compareTo(o.firstName) > 0) {
////				return 1;
////			}
////			else {
////				return 0;
////			}
////		}
//		
//		
//	}
	
	
	
	
	
}
