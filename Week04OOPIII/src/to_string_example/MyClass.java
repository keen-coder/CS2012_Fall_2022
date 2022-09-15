package to_string_example;

public class MyClass {
	private int x;
	private String s1;
	private double y;
	private int[] arr;
	
	public MyClass(int x, String s1, double y, int[] arr) {
		this.x = x;
		this.s1 = s1;
		this.y = y;
		this.arr = arr;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		result += "x: " + this.x + "\n";
		result += "s1: " + this.s1 + "\n";
		result += "y: " + this.y + "\n";
		result += "arr: ";
		
		for (int i = 0 ; i < this.arr.length ; i++) {
			result += this.arr[i] + " ";
		}
		
		return result;
	}
	
	
	
	
	
	
}
