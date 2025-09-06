package work01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * 問題
 * https://atcoder.jp/contests/abc229/tasks/abc229_c
 */
public class Cheese2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int W = scan.nextInt();
			
			// チーズオブジェクト作成(A:おいしさ B:最大重量)
			record cheeseRecord(long A, long B) {}
			List<cheeseRecord> cheeses = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				cheeseRecord cheese = new cheeseRecord(scan.nextInt(), scan.nextInt());
				cheeses.add(cheese);
			}
			
			// おいしさで降順に並べ替え
			cheeses.sort(Comparator.comparing(cheeseRecord::A, Comparator.reverseOrder()));
			
			long aTotal = 0;		// おいしさ合計 最大: 3 * 10^17 = A(10^9) * W(3 * 10^8)
			// 降順にならんだチーズリストをループ
			for (cheeseRecord cheese : cheeses) {
				if (W - cheese.B >= 0) {
					W -= cheese.B;
					aTotal += cheese.A * cheese.B;	// int * int でまずint型に入るので、A,Bもlongにする必要がある
				} else {
					aTotal += cheese.A * W;
					break;
				}
			}
			// おいしさ合計を出力
			System.out.println(aTotal);
		}
	}

}
