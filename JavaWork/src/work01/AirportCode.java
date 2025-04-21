package work01;

import java.util.Scanner;

public class AirportCode {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String S = scan.nextLine();
			String T = scan.nextLine().toLowerCase();	// 小文字にする

			boolean match = false;
			int startIndex = 0;
			if (T.charAt(2) == 'x') {
				// 最初の2文字だけ含まれているかチェック
				for (int j = 0; j < 2; j++) {
					for (int i = startIndex; i < S.length(); i++) {
						if (T.charAt(j) == S.charAt(i)) {
							startIndex = i + 1;
							match = true;
							break;
						}
					}
					if (!match) {
						System.out.println("No");
						return;
					}
				}
			} else {
				// 3文字を比較する
				for (int j = 0; j < 2; j++) {
					for (int i = startIndex; i < S.length(); i++) {
						if (T.charAt(j) == S.charAt(i)) {
							startIndex = i + 1;
							match = true;
							break;
						}
					}
					if (!match) {
						System.out.println("No");
						return;
					}
				}
			}
			if (match) {
				System.out.println("Yes");
			}
		}
	}
}
