import java.util.Scanner;

/**************************************************
 * Task:
 *
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered. -Before the user enters the number,
 * print the message "Enter number" -If the user enters an invalid number, break
 * out of the loop and print the minimum and maximum number. Hint: -Use an
 * endless while loop.
 *
 */

public class FindMinMax {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		while (true) {

			System.out.println("Enter number: ");
			boolean isInt = scanner.hasNextInt();

			if (isInt) {

				int number = scanner.nextInt();
				if (number > max) {
					max = number;
				}

				if (number < min) {
					min = number;
				}

			} else {
				break;
			}

		}

		System.out.println("min = " + min + ", max = " + max);
		scanner.close();

	}

}
