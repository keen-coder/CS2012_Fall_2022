package lecture_examples;

import java.util.Comparator;

public class MyClass implements Comparator<MyClass> {

	
	
	public void method1() {
		System.out.println("Method1 from MyClass");
	}

	@Override
	public int compare(MyClass o1, MyClass o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	
}

abstract class MySubClass extends MyClass {
	
	@Override
	public abstract void method1();
}





