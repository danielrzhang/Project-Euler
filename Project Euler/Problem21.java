
public class Problem21 {

	public static int checkIfAmicable(int num) {
		int sumOfDivisorsNum = 0;
		int sumOfDivisorsAmicable = 0;
		int amicablePairNumber;
		
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sumOfDivisorsNum += i;
			}
		}
		amicablePairNumber = sumOfDivisorsNum;
		
		for (int i = 1; i < amicablePairNumber; i++) {
			if (amicablePairNumber % i == 0) {
				sumOfDivisorsAmicable += i;
			}
		}
		
		if (num == sumOfDivisorsAmicable && sumOfDivisorsNum != sumOfDivisorsAmicable) {
			return num;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		int counter = 0;
		
		for (int i = 1; i < 10000; i++) {
			counter += checkIfAmicable(i);
		}
		System.out.println(counter);
	}

}
