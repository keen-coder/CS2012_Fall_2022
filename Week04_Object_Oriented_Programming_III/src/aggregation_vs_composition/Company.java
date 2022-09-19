package aggregation_vs_composition;

import java.util.ArrayList;

public class Company {
	
	/* Aggregation: Object A "uses" Object B, Object B will live on if Object A disappears.
	 * 				There is no sense of ownership.
	 * 
	 * Company and Person are an aggregation.  The company "uses" people as employees.  If the company were to close
	 * the people would still exist.
	 */
	private ArrayList<Person> employees;
	
	/* Composition: Object A "owns" Object B, Object B will disappear if Object A disappears.
	 * 				There is a sense of ownership.
	 * 
	 * Company and Account are a composition.  The Company "owns" the accounts.  If the company were to close,
	 * the accounts would cease to exist.
	 */
	private ArrayList<Account> accounts;
	
	
	
	

	/* Other Example: University -> Departments -> and Professors.
	 * A University is made up of Departments and each Department is made up of Professors.  The University
	 * "owns" the Departments, but each Department "uses" the Professors as instructors.  We can say the relationship
	 * between University and Department is a composition and the relationship between each Department and its
	 * Professors is an aggregation.
	 */
}