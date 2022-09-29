
public class StringVsStringBuilder {

	public static void main(String[] args) {
		final int N = 1000000;
		
		long start1 = System.currentTimeMillis(); 
		method1('@', N);
		long end1 = System.currentTimeMillis(); 
		
		long start2 = System.currentTimeMillis();
		method2('@', N);
		long end2 = System.currentTimeMillis();
		
		System.out.println("String Time: " + (end1 - start1) + "ms");
		System.out.println("StringBuilder Time: " + (end2 - start2) + "ms");
		
		
	}
	
	public static void method1(char ch, int n) {
		String result = "";
		
		for (int i = 1 ; i <= n ; i++) {
			result += ch;
		}
	}
	
	public static void method2(char ch, int n) {
		StringBuilder result = new StringBuilder();
		
		for (int i = 1 ; i <= n ; i++) {
			result.append(ch);
		}
	}

}
