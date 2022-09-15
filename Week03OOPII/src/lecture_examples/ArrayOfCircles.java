package lecture_examples;

import java.util.Random;

import book_examples.Circle;

public class ArrayOfCircles {	
	public static void main(String[] args) {
		final int N = 10;
	
		
		Circle[] circles = new Circle[5];
		
		
		circles[0] = new Circle(4.5);
		circles[1] = new Circle(5.9);
		circles[2] = new Circle(23.78);
		circles[3] = new Circle(48.123);
		circles[4] = new Circle(90.3);
		
		//printAreas(circles);
		
		Circle[] circlesFromMethod = randomCircles(N);
		
		printAreas(circlesFromMethod);
		
		
		
		
	}
	public static Circle[] randomCircles(int numCircles) {
		
		Circle[] circles = new Circle[numCircles];
		Random r = new Random();
		
		for (int i = 0 ; i < circles.length ; i++) {
			
			double randRadious = r.nextDouble() * 100;
			circles[i] = new Circle(randRadious);
		}
		
		return circles;
		
	}
	
	
	public static void printAreas(Circle[] circles) {
		for (int i = 0 ; i < circles.length ; i++) {
			System.out.println(circles[i].area());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
