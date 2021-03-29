
public class Problem4 {

	public static void main(String[] args) {
		long number;
		long checkNumber;
		long palindrome;
		long remainder;
		long biggestPalindrome = 0;
		
		for (long i = 100; i <= 999; i++) {
			for (long j = 100; j <= 999; j++) {
				number = i * j;
				checkNumber = number;
				palindrome = 0;
				remainder = 0;
				
				while (number > 0) {
					remainder = number % 10;
					palindrome = palindrome * 10 + remainder;
					number /= 10;
				}
				
				if (palindrome == checkNumber && biggestPalindrome < palindrome) {
					biggestPalindrome = palindrome;
				}
			}
		}
		System.out.println(biggestPalindrome);
	}
}
