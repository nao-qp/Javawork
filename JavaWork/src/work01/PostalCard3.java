package work01;

import java.util.Scanner;

public class PostalCard3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = scan.nextInt();
		}
		
		boolean[] exists = new boolean[1000];
		
		for(int i = 0; i < m; i++) {
			exists[scan.nextInt()] = true;
		}
		
		scan.close();
		
		int count = 0;
		for (int src: s) {
			if (exists[src % 1000]) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
