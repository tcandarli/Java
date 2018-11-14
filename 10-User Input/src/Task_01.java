import java.util.Scanner;

public class Task_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int counter = 1;

		while (counter < 5) {

			System.out.println("Enter a number " + counter + ":");
			boolean bool = sc.hasNextInt();  // checking entered value if it is integer
			if (bool) {

				counter++;
				int number = sc.nextInt();
				sum += number;

			} else {
				System.out.println("Invalid number");
			}
			sc.nextLine(); // to
		}
		System.out.println("Sum : " + sum);
		sc.close();
	}
}
