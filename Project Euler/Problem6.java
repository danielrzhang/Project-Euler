
public class Problem6 {

	public static void main(String[] args) {
		long eachSquared = 0;
		long allSquared = 0;
		
		for (int i = 1; i <= 100; i++) {
			eachSquared += i * i;
			allSquared += i;
		}
		allSquared = (long) Math.pow(allSquared, 2);
		System.out.println(allSquared - eachSquared);
		
	}

}
