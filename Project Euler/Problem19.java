import java.util.HashMap;

public class Problem19 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("January", 31);
		map.put("February", 28);
		map.put("March", 31);
		map.put("April", 30);
		map.put("May", 31);
		map.put("June", 30);
		map.put("July", 31);
		map.put("August", 31);
		map.put("September", 30);
		map.put("October", 31);
		map.put("November", 30);
		map.put("December", 31);
		
		int sundayCounter = 0;
		int dayCounter = 1;
		
		for (int i = 1901; i <= 2000; i++) {
			if (i % 4 == 0) {
				if (i % 100 == 0) {
					if (i % 400 == 0) {
						
					} else {
						
					}
				} else {
					
				}
			} else {
				
			}
		}
	}
}
