package lecture_examples;

public class MouseTester {

	public static void main(String[] args) {
		//Create a default instance of the Mouse class;
		Mouse mouse1 = new Mouse();
		
		//Print the color of the default mouse.
		mouse1.printMouse();
		
		//Create a mouse with custom values:
		Mouse mouse2 = new Mouse("red", true, 7, 3, 2);
		
		//Print the color of mouse2.
		System.out.println(mouse2.getColor());
		
		
		
		
		
		

	}

}
