package macfirst;

import java.util.Scanner;


public class test02_서현식 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split("");
		
		int[] intArr = new int[strArr.length];
		for(int i =0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
			
		}
		for (int num : intArr) {
			System.out.print(num + " ");
		}
	}

}
