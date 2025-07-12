package work01;

import java.util.Scanner;

// 問題
// https://atcoder.jp/contests/abc286/tasks/abc286_c
/**
間違った答えになるパターンがある
6 1 100
abcdec

7 1 10000
rrraaaa
 */

public class RotateAndPalindrome {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			long A = scan.nextInt();	// 移動処理(左端の文字を右端に持ってくる処理)の料金
			long B = scan.nextInt();	// 変更処理(1文字変更する処理)の料金
			scan.nextLine();
			String S =  scan.next();
			
			// 合計金額
			long cost = 0;
			
			// 処理前の文字列を両端からチェックする
			// 同じなら0円で終了
			if (getMatchCharCount(N, S) >= N/2) {
				// 費用を出力して終了
				System.out.println(cost);
				return;
			}
			
			// どちらの処理の方が安いかチェックし処理を分岐
			// Aの方が安ければ、Aの処理をできる限り行う。
			// Bの方が安ければ、単純に文字を一致するように変更してしまえば良いのでAの処理をする必要はない。
			if (A < B) {
			// Aの処理の方が安い
				// 移動処理をして両端が一致するようになるかチェック
				int matchCharCount = 0;
				int backmatchCharCount = 0;
				for (int i = 0; i < N/2; i++) {
					// 左端の文字を右端に移動してみる
					// 2文字目以降 + 先頭の1文字
					String testS = S.substring(1) + S.substring(0, 1); 
					
					// 両端からチェックし、回文になっているところまでの文字数を取得(1文字目まで一致、2文字目まで一致...)
					backmatchCharCount = matchCharCount;
					matchCharCount = getMatchCharCount(N, testS);
					
					// 移動処理をしたことで回文になっている文字数が増加しているかチェック
					if (backmatchCharCount < matchCharCount) {
					// 一致文字数が増加している場合
						// 移動処理を反映する
						S = testS;
						// 費用をプラス
						cost += A;
					} else {
					// 一致文字数が減少している場合
						// 移動処理を反映せずに移動処理は終了
						break;
					}
				}
				
				// 左からチェクして回文になっている文字数が文字列Sの文字数の半分まできていたら終了
				int checedMatchCharCount = Math.max(backmatchCharCount, matchCharCount);
				if (checedMatchCharCount >= N/2) {
					// 費用を出力して終了
					System.out.println(cost);
					return;
				}
				
				// Bの処理を行う(左端から一致することが確認できている文字数が2文字なら、Index3から調べる)
				for (int i = checedMatchCharCount; i < N/2; i++) {
					// 文字を左端から比較して違う場合は入れ替えたとして費用をプラス
					if (S.charAt(i) != S.charAt(N - 1 -i)) {
						// 費用をプラス
						cost += B;
					}
				}
				// 費用を出力して終了
				System.out.println(cost);
				
			} else {
			// Bの処理の方が安い
				// Bの処理を行う
				for (int i = 0; i < N/2; i++) {
					// 文字を左端から比較して違う場合は入れ替えたとして費用をプラス
					if (S.charAt(i) != S.charAt(N - 1 -i)) {
						// 費用をプラス
						cost += B;
					}
				}
				// 費用を出力して終了
				System.out.println(cost);
			}
		}
	}
	
	/**
	 * 左端から右端まで比較してどこまで同じかチェックする
	 * @param N 文字列Sの長さ
	 * @param S チェックする文字列
	 * @return 左端からチェックして連続して同じ文字の数を返す
	 */
	private static int getMatchCharCount (int N, String S) {
		int matchCharCount = 0;
		for (int i = 0; i < N/2; i++) {
			if (S.charAt(i) == S.charAt(N - 1 - i)) {
				matchCharCount++;
			} else {
				return matchCharCount;
			}
		}
		return matchCharCount;
	}
	
}
