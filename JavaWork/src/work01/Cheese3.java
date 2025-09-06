package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 問題
 * https://atcoder.jp/contests/abc229/tasks/abc229_c
 */
public class Cheese3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int W = scan.nextInt();
			
			// チーズオブジェクト作成(taset:おいしさ weight:最大重量)
			record CheeseTaste(long taset, long weight) {}
			List<CheeseTaste> cheeses = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				CheeseTaste cheese = new CheeseTaste(scan.nextInt(), scan.nextInt());
				cheeses.add(cheese);
			}
			
			// おいしさで降順に並べ替え
			cheeses.sort((a, b) -> (int)(b.taset - a.taset));
			
			long totalTaste = 0;
			int remain = W;		// 載せられるチーズの残量
			for (CheeseTaste cheese : cheeses) {
				// 載せられるチーズがなくなったら終了
				if (remain <= 0) {
					break;
				}
				
				// 載せられるチーズ残量とチーズの最大量を比較して、小さい方を載せる量とする
				long add = Math.min(cheese.weight, remain);
				totalTaste += cheese.taset * add;
				remain -= add;	// 載せられるチーズ残量から載せたチーズ重量を引く
			}
			System.out.println(totalTaste);
		}
	}
}
