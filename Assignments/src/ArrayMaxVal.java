import java.util.Arrays;

public class ArrayMaxVal {

	public static void main(String[] args) {
		
		int[] arr = {2, 3, 4};
		
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		
		System.out.println("Max is : " + max);
		System.out.println("Min is : " + min);
	}

}
