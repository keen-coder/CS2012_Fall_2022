package lecture_examples;

import java.util.ArrayList;

public class PCProgramMain {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		
		TestDataField test = new TestDataField(list);
		
		System.out.println(test.getList());
		
		

	}
	
}
