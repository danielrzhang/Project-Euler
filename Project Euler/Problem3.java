
public class Problem3 {

	public static void main(String[] args) {
		long num = 600851475143L;
		long largestPrimeFactor = 0;
		boolean isPrimeFactor;
		
		for (long i = 2; i <= Math.sqrt(num); i++) { // Check for factors
			if (num % i == 0) { // Check if factor is divisible
				isPrimeFactor = true;
				
				for (long j = 2; j <= Math.sqrt(i); j++) { // Check if factor is prime.
					if (i % j == 0) {
						isPrimeFactor = false;
						break;
					}
				}
				
				if (isPrimeFactor) {
					largestPrimeFactor = i;
				}
			}
		}
		System.out.println(largestPrimeFactor);
		
	}
}
