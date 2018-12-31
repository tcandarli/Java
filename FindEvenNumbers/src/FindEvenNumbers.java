/*
 * Find and print 5 even numbers between 10 and 100
 * Create a method called isEvenNumber that takes a parameter of type int
 * Its purpose is to determine if the argument passed to the method is an even number or not.
 * Return true if an even number, otherwise return false.
 * 
 */

public class FindEvenNumbers {

	public static void main(String[] args) {

		int startNumber = 10;
		int finishNumber = 100;
		int evenNumbersFound = 0;

		while (startNumber <= finishNumber) {
			if (!isEvenNumber(startNumber)) {
				startNumber++;
				continue;
			}

			System.out.println("Even number: " + startNumber);
			startNumber++;
			evenNumbersFound++;

			if (evenNumbersFound >= 5) {
				break;
			}
		}
		
		System.out.println("Total even numbers found = " + evenNumbersFound);
	}

	public static boolean isEvenNumber(int number) {

		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
