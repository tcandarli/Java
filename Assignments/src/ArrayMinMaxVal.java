
public class ArrayMinMaxVal {

	public static void main(String[] args) {

		int numbers[] = {2, 3, 4, -1};
		System.out.println("Max number is: " + getMaxValue(numbers));
		System.out.println("Min number is: " + getMinValue(numbers));

	}

	//Find maximum (largest) value in array using loop
	public static int getMaxValue(int[] numbers) {
		int maxValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}
	
	//Find minimum (lowest) value in array using loop
	public static int getMinValue(int[] numbers) {
		int minValue = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] < minValue) {
				minValue = numbers[i];
			}
		}
		
		return minValue;
		
	}
}
