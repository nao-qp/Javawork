package work01;

import java.util.Scanner;

public class AHealthyBreakfast4 {

	/**
	 * 問題
	 * https://atcoder.jp/contests/abc360/tasks/abc360_a
	 */
	// 文字列の中の文字のインデックスを取得するメソッドを自作するパターン
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String sLine = scan.nextLine();
			// ライスと味噌汁のインデックスを取得
			int indexR = indexOf(sLine, 'R');
			int indexM = indexOf(sLine, 'M');
			// インデックスを比較する。Rが小さければライスが左
			System.out.println(indexR < indexM ? "Yes" : "No");
		}
	}
	
	/**
	 * 文字列の中から指定した文字のインデックスを返す
	 * @param str
	 * @param target
	 * @return　文字のインデックス
	 */
	public static int indexOf(String str, char target) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) return i;
		}
		return -1;
	}

}
