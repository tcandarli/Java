import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicatedValue {

	public static void main(String[] args) {

		int[] intArr = new int[] { 1, 2, 5, 2, 8, 2, 6, 8 };

		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		// take first element and check array
		for (int i = 0; i < intArr.length; i++) {

			int temp = intArr[i];
			int count = 0;

			for (int j = 0; j < intArr.length; j++) {
				if (temp == intArr[j]) {
					count++;
				}
			}
			map.put(temp, count);

		}

		Set<Integer> duplicate = new LinkedHashSet<Integer>();

		for (int i = 0; i < intArr.length; i++) {
			if (map.containsKey(intArr[i])) {
				System.out.println("Key : " + intArr[i] + " value : " + map.get(intArr[i]));
				// Find duplicate value
				if (map.get(intArr[i]) > 1) {
					duplicate.add(intArr[i]);
				}
			}
		}

		System.out.println("Duplicate chars : " + Arrays.toString(duplicate.toArray()));

	}

}
