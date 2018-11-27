/*
 * Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Sample Outputs:
isLeapYear(-1600); = > false
isLeapYear(1600); = > true
isLeapYear(2017); = > false
isLeapYear(2000); = >true
 
 */

public class Assignment5 {

	public static void main(String[] args) {

		System.out.println(isLeapYear(-1600)); // false
		System.out.println(isLeapYear(1600)); // true
		System.out.println(isLeapYear(2017)); // false
		System.out.println(isLeapYear(2000)); // true

	}

	public static boolean isLeapYear(int year) {

		if (year <= 1 || year >= 9999) {
			return false;
		} else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
			return true;
		}
		return false;
	}

}
