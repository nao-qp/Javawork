package work01;

import java.util.Scanner;

public class JobAssignment3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			scan.nextLine();
		}
		
		scan.close();
		
		int min = 200000;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int time = i == j ? a[i] + b[j] : Math.max(a[i], b[j]);
				if (time < min) {
					min = time;
				}
			}
		}
		
		System.out.println(min);

	}

}
