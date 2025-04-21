package work01;

import java.util.Scanner;

public class AirportCode3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String S = scan.nextLine();
			String T = scan.nextLine().toLowerCase();	// 小文字にする
			
			if (isAirportCode(S, T.endsWith("x") ? T.substring(0, 2) : T)) {
				System.out.print("Yes");
			} else {
				System.out.print("No");
			}
		}
	}

	public static boolean isAirportCode(String S, String T) {
		int iT = 0;	//Tのindex
		for (int iS = 0; iS < S.length(); iS++) {
			if (iT >= T.length()) {
				return true;
			}
			if (T.charAt(iT) == S.charAt(iS)) {
				iT++;
			}
		}
		return false;
	}
}
