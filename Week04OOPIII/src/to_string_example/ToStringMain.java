package to_string_example;

public class ToStringMain {

	public static void main(String[] args) {
		int[] arr = {6, 3, 4, 8, 2, 6, 5};
		MyClass mc = new MyClass(5, "blue", 3.14, arr);

		System.out.println(mc);
		
	}

}
