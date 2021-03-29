
public class Problem2 {

	public static void main(String[] args) {
		long first = 1;
		long second = 2;
		long sum = first + second;
		long totalSum = 2;
		
		while (sum <= 4000000) {
			sum = first + second;
			if (sum % 2 == 0) {
				totalSum += sum;
			}
			first = second;
			second = sum;
		}
		System.out.println(totalSum);
	}
}
