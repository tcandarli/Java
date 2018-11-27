/*
 * Write a method called printNumberInWord

This method should have one parameter called number which a whole number(type int)

The method needs to print "ZERO" if the number parameter is passed with the value of 0
The method needs to print "ONE" if the number parameter is passed with the value of 1
The method needs to print "TWO" if the number parameter is passed with the value of 2

... and so on up to and including "NINE" if the number parameter is passed with the value of 9

If the number parameter has any other value than 0 to 9, then the method should print "OTHER"
 * 
 */

public class Assignment12 {

	public static void main(String[] args) {

		printNumberInWord(0);
		printNumberInWord(5);
		printNumberInWord(11);
		printNumberInWord(3);
		printNumberInWord(8);
	}

	public static void printNumberInWord(int num) {

		switch (num) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;

		default:
			System.out.println("Other");
			break;
		}

	}

}
