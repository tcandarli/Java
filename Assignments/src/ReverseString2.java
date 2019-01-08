
public class ReverseString2 {

	public static void main(String[] args) {
		
		String str = "This is amazing";
		StringBuilder sb = new StringBuilder();
		for(int i = str.length() - 1; i >=0; i--) {	
			sb.append(str.charAt(i));
		}
		System.out.println("Reversed string is: " + sb.toString());
	}
}
