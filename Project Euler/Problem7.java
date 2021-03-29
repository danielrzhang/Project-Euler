
public class Problem7 {

	public static void main(String[] args) {
		int primeCounter = 0;
		long n = 2;
		boolean isPrime;
		
		while (primeCounter <= 10001) {
			isPrime = true;
			
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				primeCounter++;
				
				if (primeCounter == 10001) {
					break;
				}
				
				if (n == 2) {
					n++;
				} else {
					n += 2;
				}
			} else {
				n += 2;
			}
		}
		System.out.println(n);
	}
}
