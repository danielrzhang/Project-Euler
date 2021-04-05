import java.math.BigInteger;

public class Problem20 {

	public static BigInteger factorial(BigInteger num) {
		BigInteger one = new BigInteger("1");
		
		if (num.equals(one)) {
			return num;
		} else {
			return num.multiply(factorial(num.subtract(one)));
		}
	}
	
	public static void main(String[] args) {
		String result = factorial(new BigInteger("100")).toString();
		
		int counter = 0;
		
		for (int i = 0; i < result.length(); i++) {
			counter += Integer.parseInt(result.substring(i, i + 1));
		}
		
		System.out.println(counter);
	}

}
