import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. Create a program using arrays that sorts a list of integers in descending order. 
 * Descending order is highest value to lowest.
    In other words if the array had the values in int 106,26,81,5,15 your program 
    should ultimately have an array with 106,81,26,15,5 in it.
2. Set up the program so that the numbers to sort are read in from the keyword.
3. Implement the following methods - getIntegers, printArray, and sortIntegers.
    getIntegers returns an array of entered integers from keyword.
    printArray prints out the contents of the array and sortIntegers should sort the array 
    and return a new array containing the sorted numbers
4. You will have to figure out how to copy the array elements from passed array into a 
new array and sort them and return the new sorted array. 
 */
public class Assignment18 {

	public static void main(String[] args) {

		int[] myArray = getIntegers(4);
		System.out.println(Arrays.toString(myArray));
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
		int[] sortArray = descSortArray(myArray);	
		System.out.println(Arrays.toString(sortArray));

	}

	public static int[] getIntegers(int num) {

		Scanner s = new Scanner(System.in);
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter your " + (i + 1) + ". element");
			int input = s.nextInt();
			array[i] = input;
		}
		s.close();
		return array;

	}

	public static int[] descSortArray(int[] arr) {
		int[] descSortArray = new int[arr.length];
		int j = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			descSortArray[j] = arr[i];
			j++;
		}
		return descSortArray;
	}
}
