package class_examples;

import java.util.ArrayList;
import java.util.Collections;

public class SortablePerson {

	public static void main(String[] args) {
		Person p1 = new Person("Gelens", "Draupadi", 41, 4.0);
		Person p2 = new Person("Vardanyan", "Teona", 25, 3.9);
		Person p3 = new Person("Gelens", "Amun", 29, 3.9);
		
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		System.out.println(people);
		
		Collections.sort(people);
		
		System.out.println(people);

	}

}
