
public class Problem17 {

	private static final String[] ones = new String[] {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	private static final String[] doubles = new String[] {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", 
			"seventeen", "eighteen", "nineteen"};
	private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	private static String convertNumberToWord(int number) {
		String word = "";
		int num = number % 100;
		
		if (num < 10) {
			word = word + ones[num];
		} else if (num < 20) {
			word = word + doubles[num % 10];
		} else {
			word = tens[num / 10] + ones[num % 10];
		}
		
		if (number / 100 > 0) {
			if (number % 100 == 0) {
				word = ones[number / 100] + "hundred";
			} else {
				word = ones[number / 100] + "hundredand" + word;
			}
		}
		return word;
	}
	
	public static void main(String[] args) {
		int counter = 0;
		
		String word;
		for (int i = 1; i <= 999; i++) {
			word = convertNumberToWord(i);
			//System.out.println(word + " " + word.length());
			counter += word.length();
		}
		System.out.println(counter + 11);
	}

}
