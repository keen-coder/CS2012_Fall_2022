import java.math.BigInteger;

public class BigNumbers {
	public static void main(String[] args) {		
		BigInteger value1 = new BigInteger("5678765434567876545678989876");
		BigInteger value2 = new BigInteger("23454321234567765432456789876543445987564678965469876546754546");
		
		BigInteger result = value1.multiply(value2);
		
		System.out.println(result);
		
		BigInteger one = new BigInteger("1");
		
	}
}
