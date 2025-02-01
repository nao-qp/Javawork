package work01;

import java.util.Scanner;

public class DailyCookie_23 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int D = scan.nextInt();
			scan.nextLine();
			char[] S = scan.next().toCharArray();
			
			int days = D;
			int changeIndexNext = N - 1;
			// @に変換したインデックスの1つ前のインデックスから見る
			for (int i = changeIndexNext; i >= 0; i--) {
				if (S[i] == '@') {
					S[i] = '.';
					changeIndexNext = i - 1;
					if (--days <= 0) {
						break;
					}
				}
			}
			System.out.println(S);
		}

	}

}
