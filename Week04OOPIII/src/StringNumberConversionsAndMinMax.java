
public class StringNumberConversionsAndMinMax {

	public static void main(String[] args) {
		String s1 = "2534798";
		String s2 = "3.14159265";
		
		int n1 = Integer.parseInt(s1);
		double pi = Double.parseDouble(s2);
		
		//Min and Max for Numeric Type
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
	}

}
