
public class Problem14 {

	public static void main(String[] args) {
		long longestCounter = 0;
		long longestNumber = 0;
		long currentCounter = 0;
		long currentNumber;
		long copyCurrentNumber;
		
		for (long i = 1; i <= 1000000L; i++) {
			currentNumber = i;
			copyCurrentNumber = i;
			currentCounter = 0;
			
			while (currentNumber != 1) {
				if (currentNumber % 2 == 0) {
					currentNumber /= 2;
				} else {
					currentNumber = 3 * currentNumber + 1;
				}
				currentCounter++;
			}
			
			if (currentCounter > longestCounter) {
				longestCounter = currentCounter;
				longestNumber = copyCurrentNumber;
			}
		}
		System.out.println(longestNumber);
	}
}
