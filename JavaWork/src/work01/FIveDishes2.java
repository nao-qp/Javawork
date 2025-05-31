package work01;

import java.util.Arrays;
import java.util.Scanner;

public class FIveDishes2 {
/**
 * 問題
 * https://atcoder.jp/contests/abc123/tasks/abc123_b
 */
	
	/**
	 * 10未満の端数が一番小さい料理を最後に頼むと注文時間を一番短縮できる
	 * 10未満の端数を昇順で並べ替えて先頭の料理が最後に頼む料理(端数なしは10として並べる)
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			// 調理時間の配列
			Integer[] dishTimes = new Integer[5];
			// 待ち時間込みの調理時間合計
			int totalTime = 0;
			// 10未満の端数並べ替え用配列(端数なしは10とする)
			int[] sortMods = new int[5];
			for (int i = 0; i < 5; i++) {
				Integer dishTime = scan.nextInt();
				dishTimes[i] = dishTime;
				totalTime += (int)Math.ceil((double)dishTime / 10) * 10;	// 1の位を切り上げて合計に足す
				if (dishTime % 10 == 0) {
					sortMods[i] = 10;
				} else {
					sortMods[i] = dishTime % 10;
				}
			}
			
			// ソートする
			Arrays.sort(sortMods);
			// 待ち時間込みの調理時間合計から最小端数の調理時間の短縮時間を引く
			System.out.println(totalTime - (10 - sortMods[0]));
		}
	}
}
