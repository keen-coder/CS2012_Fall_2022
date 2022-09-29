
public class MyImmClass {
	private int x;
	private double y;
	private String s;
	private int[] arr;
	
	public MyImmClass(int x, double y, String s, int[] arr) {
		this.x = x;
		this.y = y;
		this.s = s;
		this.arr = new int[arr.length];
		System.arraycopy(arr, 0, this.arr, 0, arr.length);
	}
	
	
	
	
	
	
	
	
	
	
}
