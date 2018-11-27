/*
 * We will say that a number is "teen" if it is in the range 13-19(inclusive)
Write a method hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return true if one of parameters is 
in range 13(inclusive) - 19(inclusive). Otherwise return false.

Sample Output:
hasTeen(9,99,19); = > true
hasTeen(23,15,42); = > true
hasTeen(22,23,34); = > false
 */

public class Assignment7 {

	public static void main(String[] args) {

		System.out.println(hasTeen(9, 99, 19)); // true
		System.out.println(hasTeen(23, 15, 42)); // true
		System.out.println(hasTeen(22, 23, 34)); // false

	}

	public static boolean hasTeen(int num1, int num2, int num3) {

		if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
			return true;
		} else
			return false;
	}

}
