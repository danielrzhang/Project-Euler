import java.math.BigInteger;

public class Problem15 {

	public static BigInteger factorial(BigInteger num) {
		BigInteger one = new BigInteger("1");
		
		if (num.equals(one)) {
			return num;
		} else {
			return num.multiply(factorial(num.subtract(one)));
		}
	}
	
	public static void main(String[] args) {
		BigInteger forty = new BigInteger("40");
		BigInteger twenty = new BigInteger("20");
		
		BigInteger answer = factorial(forty).divide(factorial(twenty)).divide(factorial(twenty));
		
		System.out.println(answer);
	}

}
