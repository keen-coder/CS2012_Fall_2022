package custom_class_data_fields;

import java.util.ArrayList;

public class PersonBirthdayTester {
	public static void main(String[] args) {
		Birthday temp = new Birthday(12, 1, 1900);
		Person p1 = new Person("John Smith", temp);
		
		//Birthday is an Anonymous Instance
		Person p2 = new Person("Sue Smith", new Birthday(4, 23, 1986));
					
		//How do I print the month of p1's birthday?
		//Example of method chaining.
		System.out.println(p1.getBday().getMonth());
		
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(p1);
		people.add(p2);
		
		//print the year of each person's birthday
		for (int i = 0 ; i < people.size(); i++) {
			System.out.println(people.get(i).getBday().getYear());
		}	
	}
}