
public class Problem12 {

	public static void main(String[] args) {
		boolean running = true;
		long currentTriangularNumber = 1;
		long currentAdding = 2;
		long numFactors;
		
		while (running) {
			numFactors = 0;
			for (int i = 1; i <= Math.sqrt(currentTriangularNumber); i++) {
				if (currentTriangularNumber % i == 0) {
					if (i == Math.sqrt(currentTriangularNumber)) {
						numFactors++;
					} else {
						numFactors += 2;
					}
				}
			}
			
			if (numFactors >= 500) {
				break;
			} else {
				currentTriangularNumber += currentAdding;
				currentAdding++;
			}
		}
		System.out.println(currentTriangularNumber);
	}

}
