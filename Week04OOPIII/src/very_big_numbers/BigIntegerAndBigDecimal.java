package very_big_numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerAndBigDecimal {
	public static void main(String[] args) {
		//BigInteger for very very large integers.
		BigInteger int1 = new BigInteger("567876543345678765345654345");
		BigInteger int2 = new BigInteger("6765456765456784871234971258961208347619283467091823561802734609182374");		
		
		BigInteger result1 = int1.multiply(int2);
		
		System.out.println(result1);
		
		BigDecimal dec1 = new BigDecimal("54323456789876543456.87654345678765434");
		BigDecimal dec2 = new BigDecimal("9876543234567654345434567898765.8765432345678989876543432345");
		
		BigDecimal result2 = dec1.multiply(dec2);
		System.out.println(result2);
		
		
		
	}
}
