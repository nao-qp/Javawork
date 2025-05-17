package work01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AHealthyBreakfast2 {

/**
 * 問題
 * https://atcoder.jp/contests/abc360/tasks/abc360_a
 */
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Map<Character, Integer> S = new HashMap<>();
			String sLine = scan.nextLine();
			for (int i = 0; i < 3; i++) {
				char s = sLine.charAt(i);
				// R,M,Sそれぞれと入力順番のインデックスを設定
				S.put(s, i);
			}
			// RとMのインデックスを比較し、Rが小さければライスが左側にある
			System.out.println(S.get('R') < S.get('M') ? "Yes" : "No");
		}
	}
}
