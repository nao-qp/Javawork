package work01;

import java.util.Scanner;

public class AHealthyBreakfast3 {

	/**
	 * 問題
	 * https://atcoder.jp/contests/abc360/tasks/abc360_a
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String sLine = scan.nextLine();
			// ライスと味噌汁のインデックスを取得
			int indexR = sLine.indexOf('R');
			int indexM = sLine.indexOf('M');
			// インデックスを比較する。Rが小さければライスが左
			System.out.println(indexR < indexM ? "Yes" : "No");
		}
	}
}
