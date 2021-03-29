
public class Problem5 {

	public static void main(String[] args) {
		boolean running = true;
		long counter = 1;
		boolean divideAll;
		
		while (running) {
			divideAll = true;
			for (int i = 1; i <= 20; i++) {
				if (counter % i != 0) {
					divideAll = false;
					break;
				}
			}
			
			if (divideAll) {
				running = false;
			} else {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
