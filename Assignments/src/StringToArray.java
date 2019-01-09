import java.util.HashMap;
import java.util.Map;

public class StringToArray {

	public static void main(String[] args) {

		String numbers = "1 5 9 2 1 5 8 1";
		// Remove spaces between numbers in string
		String[] nums = numbers.split(" ");
		// Array for numbers
		int[] arryNum = new int[nums.length];

		// Store numbers from string to array
		for (int i = 0; i < nums.length; i++) {
			arryNum[i] = Integer.parseInt(nums[i]);
		}

		// map to store results in
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();

		// count each numbers by adding to map
		for (int i : arryNum) {
			if (counts.containsKey(i)) {
				counts.put(i, counts.get(i) + 1);
			} else {
				counts.put(i, 1);
			}
		}

		// Write results from map
		for (int i : counts.keySet()) {
			System.out.println(i + ":" + counts.get(i));
		}
	}
}
