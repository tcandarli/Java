/**************************************
 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type
 * int with the name kiloBytes The method should not return anything(void) and
 * it needs to calculate the megabytes and remaining kilobytes from the
 * kilobytes parameter.
 * 
 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB". XX
 * represents the original value kiloBytes. YY represents the calculated
 * megabytes. ZZ represents the calculated remaining kilobytes.
 * 
 * If the parameter kiloBytes is < 0 then print "Invalid Value"
 * 
 * Sample Output:
 * 
 * printMegaBytesAndKiloBytes(2050) = > "2050 KB = 2 MB and 2KB"
 * 
 * Tip: 1 MB = 1024 KB
 * 
 */

public class Converter {

	public static void main(String[] args) {
		
		printMegaBytesAndKiloytes(2050);
		
	}
	
	public static void printMegaBytesAndKiloytes(int kilobyte) {
		
		int megabyte = kilobyte/1024;
		int remainingkilobyte = kilobyte%1024;
		
		System.out.println(kilobyte + " KB = " + megabyte + " MB and " + remainingkilobyte);
	}

}
