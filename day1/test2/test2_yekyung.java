import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		int n = 5;
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		int[] arr = new int[n];

		// sol1
//			for (int i = 0; i < n; i++) {
//				arr[i] = Character.getNumericValue(line.charAt(i));
//			}

		// sol2
		for (int i = 0; i < n; i++) {
			arr[i] = line.charAt(i) - '0';
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(arr[i]).append(' ');
		}
		System.out.println(sb);
	}
}
