package work01;

import java.util.Scanner;

public class DailyCookie_22 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int D = scan.nextInt();
			scan.nextLine();
			char[] S = scan.next().toCharArray();
			
			for (int i = 0; i < D; i++) {
				for (int j = N - 1; j >= 0; j--) {
					if (S[j] == '@') {
						S[j] = '.';
						break;
					}
				}
			}
			System.out.println(S);
			
		}


	}

}
