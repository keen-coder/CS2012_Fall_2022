
public class MyImmTester {

	public static void main(String[] args) {
		String soc = "0-02–4534";
		String regex = "\\d{3}–\\d{2}–\\d{4}";
		
		System.out.println(soc.matches(regex));
		
		
//		int[] arr = {1, 2, 3, 4, 5};
//		
//		MyImmClass mc1 = new MyImmClass(4, 4.3, 
//				"hello", arr ); 
		
		

	}

}
