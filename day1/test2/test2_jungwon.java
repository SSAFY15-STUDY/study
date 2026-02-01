import java.util.*;

public class test2_jungwon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String s = sc.next();
		String [] p = s.split("");
		
		
		int [] arr = new int[p.length]; 		
		
		for (int i = 0; i<p.length; i++) {
			arr[i] = Integer.parseInt(p[i]);
		}
		
		for (int i = 0; i<p.length; i++) {
			System.out.print(arr[i]+" ");
		}
	
	}

}
