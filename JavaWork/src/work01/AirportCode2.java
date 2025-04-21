package work01;

import java.util.Scanner;

public class AirportCode2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String S = scan.nextLine();
			String T = scan.nextLine().toLowerCase();	// 小文字にする

			boolean TisSAirportCode = false;
			if (T.charAt(2) == 'x') {
				// 最初の2文字だけ含まれているかチェック
				TisSAirportCode = checkSChar(S, T, 2);
			} else {
				// 3文字を比較する
				TisSAirportCode = checkSChar(S, T, 3);
			}
			// 出力
			System.out.println(TisSAirportCode ? "Yes" : "No");
		}
	}
	
	public static boolean checkSChar(String S, String T, int checkNum) {
		boolean match = false;
		int startIndex = 0;
		for (int j = 0; j < checkNum; j++) {
			for (int i = startIndex; i < S.length(); i++) {
				if (T.charAt(j) == S.charAt(i)) {
					startIndex = i + 1;
					match = true;
					break;
				}
			}
			if (!match) {
				return false;
			}
		}
		return match;
	}
	
}
