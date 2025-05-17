package work01;

import java.util.Scanner;

public class AHealthyBreakfast {

	/**
	 * 問題
	 * https://atcoder.jp/contests/abc360/tasks/abc360_a
	 */
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String sLine = scan.nextLine();
			// 文字列からSを除外
			String removedSLine = sLine.replace("S", "");
			// Sを除外した文字列が”RM”であれば、ライスが味噌汁よりも左にある
			System.out.println(removedSLine.equals("RM") ? "Yes" : "No");
		}
	}
}
