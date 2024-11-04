package work01;

import java.util.Scanner;

public class TrickOrTreat2 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int K = scan.nextInt();
			
			boolean[] sunuke = new boolean[N];
			
			for (int i = 0; i < K; i++) {
				int d = scan.nextInt();
				for (int j = 0; j < d; j++) {
					int A = scan.nextInt();
					sunuke[A -1] = true;
				}
			}
			
			System.out.println(countFalse(sunuke));
		}

	}
	
	public static int countFalse(boolean[] booleanlist) {
		int count = 0;
		for (boolean value: booleanlist) {
			if (!value) {
				count++;
			}
		}
		return count;
	}
	

}
