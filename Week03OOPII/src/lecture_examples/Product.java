package lecture_examples;

//Uses of keyword this:
// 1. refer to a data field
// 2. invoke an instance method in the same class.
// 3. call a constructor in the same class.

public class Product {
	private String productName;
	private double cost;
	private int quantity;
	
	public Product() {
		this.productName = "Test Product";
		this.cost = 1.0;
		this.quantity = 1;
	}
	
	public Product(String productName) {
		this.productName = productName;
	}
	
	public Product(String productName, double cost) {
		this(productName);
		this.setCost(cost);
	}
	
	public Product(String productName, double cost, int quantity) {
		this(productName, cost);
		this.setQuantity(quantity);
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getCost() {
		return this.cost;
	}
	
	//NOTE: Cost cannot be negative
	public void setCost(double cost) {
		if (cost < 0.0) {
			System.out.println("[ERROR]: Cost cannot be negative.");
		}
		else {
			this.cost = cost;
		}
	}

	public int getQuantity() {
		return this.quantity;
	}

	//NOTE: Quantity cannot be negative.
	public void setQuantity(int quantity) {
		if (quantity < 0.0) {
			System.out.println("[ERROR]: Quantity cannot be negative.");
		}
		else {
			this.quantity = quantity;
		}
	}
	
	
	
}
