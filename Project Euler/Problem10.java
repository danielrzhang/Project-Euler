
public class Problem10 {

	public static void main(String[] args) {
		boolean isPrime;
		long total = 0;
		
		for (long i = 2; i <= 2000000L; i++) {
			isPrime = true;
			
			for (long j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				total += i;
			}
		}
		System.out.println(total);
	}
}
