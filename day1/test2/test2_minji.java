import java.util.Arrays;
import java.util.Scanner;

public class test2_minji {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		String[] strarr = N.split("");
		
		int[] arr = new int[strarr.length];
		
		for (int i = 0; i < N.length(); i++) {
			arr[i] = Integer.parseInt(strarr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
	}	
}
