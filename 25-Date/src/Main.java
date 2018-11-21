import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws ParseException {

		// SimpleDate format is a concrete class for formatting and parsing date which
		// inherits java.text.Dateformat class
		// Formatting : Converting date to string
		// Parsing : Converting string to date

		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); // M-month, m-minute
		String strDate = formatter.format(date);
		System.out.println(strDate);

		formatter = new SimpleDateFormat("MM/dd/yyyy");
		strDate = formatter.format(date);
		System.out.println(strDate);

		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate = formatter.format(date);
		System.out.println(strDate);

		formatter = new SimpleDateFormat("dd MMMM yyyy");
		strDate = formatter.format(date);
		System.out.println(strDate);

		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate = formatter.format(date);
		System.out.println(strDate);

		formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		// Convert String into Date
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		date = formatter.parse("31/03/2015");
		
		System.out.println(date);
		
	}

}
