package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 問題
// https://atcoder.jp/contests/abc403/tasks/abc403_c
	
public class Reversible {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			scan.nextLine();	// 空行読み飛ばし
			List<String> S = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				// 文字列を読み込み
				
				String inputS = scan.nextLine();
				// 最初の1件を追加
				if (i == 0) {
					S.add(inputS);
				} else {
				// 2件目以降
					// すでにSに追加済みの文字列の配列をループする
					// ループカウントを設定
					int sCount = S.size();
					for (int j = 0; j < sCount; j++) {
						// すでに同じ文字列があるかチェック
						if (S.get(j).equals(inputS)) {
							// 同じ物があれば棒の本数をマイナス
							N --;
							// S配列には追加しない
						} else {
							// 同じ文字列がS配列になければSに追加
							S.add(inputS);
						}
					}
				}
			}
			
			// 反転して調べていく
			// 比較対象は調査対象の後ろの文字(最後の文字列は比較対象がないので-1)
			for (int i = 0; i < S.size() - 1; i++) {
				// 反転する
				String SString = S.get(i);
				String SStringReversible = "";
				StringBuilder sb = new StringBuilder();
				for (int j = SString.length() - 1; j == 0; j--) {
					sb.append(SString.charAt(j));
				}
				SStringReversible = sb.toString();
				// 比較していく
				for (int k = i; k < S.size() - i; k++) {
					if (SStringReversible.equals(S.get(k))){
						// 同じ物があれば棒の本数をマイナス
						N --;
					}
				}
			}
			// 出力
			System.out.print(N);
			
		}
	}
}
