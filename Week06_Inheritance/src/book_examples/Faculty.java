package book_examples;

/**NOTE: This example shows that it is possible to define multiple classes within the same .java file.
 * DO NOT DO THIS.  This is a bad practice to get in the habit of doing, and it can lead to messy and poorly written
 * code.
 */

public class Faculty extends Employee {

  public static void main(String[] args) {
    new Faculty();
  }
  
  public Faculty() {
    super();
    System.out.println("(4) Faculty's no-arg constructor is invoked");
  }

}

class Employee extends Person {
  public Employee() {
    this("(2) Invoke Employee's overloaded constructor");
    System.out.println("(3) Employee's no-arg constructor is invoked");
  }

  public Employee(String s) {
    super();
    System.out.println(s);
  }
}

class Person {
  public Person() {
    System.out.println("(1) Person's no-arg constructor is invoked");
  }
}












