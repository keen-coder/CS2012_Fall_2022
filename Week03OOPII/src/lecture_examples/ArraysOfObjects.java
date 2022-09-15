package lecture_examples;

public class ArraysOfObjects {

	public static void main(String[] args) {
		Product[] products = createArray();
		printProductArray(products);
		
		//You can use the dot operator on an array indexed variable
		System.out.println(products[1].getProductName());
		
		System.out.println("Total Cost: $" + totalProductCost(products));
	}
	
	//Method to create an array of product objects
	public static Product[] createArray() {
		Product[] products = new Product[3];
		
		products[0] = new Product("Logitech Mouse", 24.99, 7);
		products[1] = new Product("Sharpie Marker, Blue", 1.99, 50);
		products[2] = new Product("Composition Notebook", 5.99, 27);
		
		return products;
	}
	
	public static void printProductArray(Product[] items) {
		for (int i = 0 ; i < items.length ; i++) {
			printProduct(items[i]);
			System.out.println();
		}
	}
	
	public static void printProduct(Product p) {
		System.out.println("Name: " + p.getProductName());
		System.out.println("Price: $" + p.getCost());
		System.out.println("Quantity: " + p.getQuantity());
	}
	
	public static double totalProductCost(Product[] items) {
		double totalCost = 0;
		
		for (int i = 0 ; i < items.length ; i++) {
			totalCost += (items[i].getCost() * items[i].getQuantity());
		}
		
		return totalCost;
	}

}
