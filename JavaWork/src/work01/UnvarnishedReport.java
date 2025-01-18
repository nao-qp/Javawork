package work01;

import java.util.Scanner;

public class UnvarnishedReport {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String S = scan.nextLine();
			String T = scan.nextLine();
			
			// 文字列を比較
			int minLength = (S.length() >= T.length()) ? T.length() : S.length();
			Integer isDifference = 0;		// 0: 同じ
			for (int i = 0; i < minLength; i++) {
				if (S.charAt(i) != T.charAt(i)) {
					isDifference = 1;
					System.out.println(i + 1);
					break;
				}
			}
			
			// 比較した文字列が同じ場合
			if (isDifference == 0) {
				// SとTの長さが同じ場合
				if (S.length() == T.length()) {
					// 文字列は同じ
					System.out.println(0);
				} else {
					// SとTの長さが違う場合は短い方の文字列+1を出力
					System.out.println(minLength + 1);
				}
			}
		}

	}

}
