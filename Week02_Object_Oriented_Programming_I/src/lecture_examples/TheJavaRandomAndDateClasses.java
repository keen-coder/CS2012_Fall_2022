package lecture_examples;

import java.util.Date;
import java.util.Random;

public class TheJavaRandomAndDateClasses {

	public static void main(String[] args) {
		Random r1 = new Random(10);
		Random r2 = new Random(10);
		
		int randomInt1 = r1.nextInt(10000);
		int randomInt2 = r2.nextInt(10000);
		
		System.out.println(randomInt1);
		System.out.println(randomInt2);
		
		Date d1 = new Date();
		
		System.out.println(d1);
		

	}

}
