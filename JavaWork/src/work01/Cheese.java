package work01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * 問題
 * https://atcoder.jp/contests/abc229/tasks/abc229_c
 */
public class Cheese {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int W = scan.nextInt();
			
			// チーズオブジェクト作成(A:おいしさ B:最大重量)
			record cheeseRecord(int A, int B) {}
			List<cheeseRecord> cheeses = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				cheeseRecord cheese = new cheeseRecord(scan.nextInt(), scan.nextInt());
				cheeses.add(cheese);
			}
			
			// おいしさで降順に並べ替え
			cheeses.sort(Comparator.comparing(cheeseRecord::A, Comparator.reverseOrder()));
			
			long aTotal = 0;		// おいしさ合計 最大: 3 * 10^17 = A(10^9) * W(3 * 10^8)
			int bTotal = 0; 		// 重量合計
			// 降順にならんだチーズリストをループ
			for (cheeseRecord cheese : cheeses) {
				// 各チーズの最大重量をループ
				for (int i = 0; i < cheese.B; i++) {
					// 重量最大合計値を超えていなければ、合計にプラスする
					if (bTotal + 1 <= W) {
						aTotal += cheese.A;
						bTotal++;
					} else {
						// 重量最大合計値を超えたので次のチーズの種類をプラスするためループを抜ける
						break;
					}
				}
			}
			// おいしさ合計を出力
			System.out.println(aTotal);
		}
	}
}
