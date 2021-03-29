import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
		BigInteger two = new BigInteger("2");
		String num = two.pow(1000).toString();
		
		long sum = 0;
		
		for (int i = 0; i < num.length(); i++) {
			sum += Long.parseLong(num.substring(i, i + 1));
		}
		
		System.out.println(sum);
		
		
	}

}
