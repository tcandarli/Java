import java.util.Scanner;

/*
 * Read the numbers from console entered by the user and print the minimum and maximum number the user has entered.
Before the user enters the number, print the message "Enter number"
If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

Hint:
Use an endless while loop
 */

public class Assignment17 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int min = 0;
		int max = 0;

		while (true) {
			System.out.println("Enter a number: ");
			boolean b = s.hasNextInt();

			if (b) {
				int num = s.nextInt();

				if (num > max) {
					max = num;
				}

				if (num < min) {
					min = num;
				}

				if (num == 0) {
					System.out.println("Invalid value");
					break;
				}
				s.nextLine();
			}

		}
		System.out.println("Max value: " + max + " min value: " + min);
		s.close();

	}
}
