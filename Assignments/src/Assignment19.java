import java.util.Scanner;

/*
 * -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
-Finally, print the minimum element in the array.
 */
public class Assignment19 {

	public static void main(String[] args) {
		
		int[] MyArray = readIntegers(3);
		int minValue = findMin(MyArray);
		System.out.println(minValue);
	}

	public static int[] readIntegers (int count) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[count];
		
		for (int i=0; i < count; i++) {
			System.out.println("Enter the " + (i+1) + ". value: ");
			int input = scanner.nextInt();
			array[i] = input;
		}
		scanner.close();
		return array;
		
		
	}
	
	public static int findMin (int[] arr) {
		int min = arr[0];
		
		for (int elementsOfArray : arr) {
			if (elementsOfArray < min) {
				min = elementsOfArray;
			}
		}
		return min;
	}
}
