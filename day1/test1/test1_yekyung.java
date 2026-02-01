import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[][] arr = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.println(sb);
		}
	}
}
