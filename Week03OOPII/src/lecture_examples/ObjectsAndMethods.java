package lecture_examples;

import java.util.Scanner;

public class ObjectsAndMethods {

	public static void main(String[] args) {
		Product p1 = new Product("Logitech Mouse", 24.99, 7);
		
		//Passing an object to a method:
//		printProduct(p1);
//		System.out.println();
//		
//		//Returning an object from a method:
//		Product p2 = createNewProduct();
//		printProduct(p2);
//		System.out.println();
		
		//If you pass an object to a method, and change something about that object,
		// the changes will affect the reference outside the method as well.
		//If you pass a primitive to a method and change the primitive value, 
		// the changes will not affect the primitive outside the method.
		int a = 10;
		System.out.println("a before change(): " + a);
		System.out.println("product before change():");
		printProduct(p1);
		System.out.println();
		
		change(a, p1);
		
		System.out.println("a after change(): " + a);
		System.out.println("product after change():");
		printProduct(p1);
		System.out.println();
	}
	
	public static void printProduct(Product p) {
		System.out.println("Name: " + p.getProductName());
		System.out.println("Price: $" + p.getCost());
		System.out.println("Quantity: " + p.getQuantity());
	}
	
	public static Product createNewProduct() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the product name: ");
		String name = in.nextLine();
		
		System.out.print("Enter the cost of the product: ");
		double cost = in.nextDouble();
		
		System.out.print("Enter the quantity of the product: ");
		int quantity = in.nextInt();
		
		Product p = new Product(name, cost, quantity);
		
		return p;
	}
	
	public static void change(int x, Product p) {
		x = 50;
		p.setCost(42.77);
	}
}