
public class FormattingOutput {
	public static void main(String[] args) {
		double PI = 3.14159265;
		int x = 0052;
		
		
		
		
		
		String formatted = String.format("x = %5d, The value is: %10.3f", x, PI);
		
		printTable();
	}
	
	public static void printTable() {
		final int WIDTH1 = -5;
		final int WIDTH2 = -20;
		
		
		String s = "%" + WIDTH1 + "d\t%" + WIDTH2 + "d";
		
		for (int i = 1 ; i <= 100000 ; i++) {
			System.out.printf(s, i, i * 10);
			System.out.println();
			
			
			
		}
		
		
		
		
		
	}
	
	
	
}