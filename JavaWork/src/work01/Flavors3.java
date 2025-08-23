package work01;

import java.util.Scanner;

/**
 * 問題
 * https://atcoder.jp/contests/abc315/tasks/abc315_c
 * 一番おいしいアイスを取得して
 * 一番おいしいアイスとそれ以外を組み合わせて最大値になる組み合わせを探す
 */
public class Flavors3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int[] f = new int[N];
			int[] s = new int[N];
			
			int maxS = 0;
			int maxSIndex = 0;
			for (int i = 0; i < N; i++) {
				f[i] = scan.nextInt();
				s[i] = scan.nextInt();
				if (s[i] > maxS) {
					maxS = s[i];
					maxSIndex = i;
				}
			}
			
			int secondMaxS = 0;
			for (int i = 0; i < N; i++) {
				// 一番おいしいアイスはスキップ
				if (i == maxSIndex) {
					continue;
				}
				
				// 比較対象のおいしさを設定
				int compareS = 0;
				// 同じ味の場合
				if (f[i] == f[maxSIndex]) {
					compareS = s[i] / 2;
				} else {
				// 違う味の場合
					compareS = s[i];
				}
				
				// 最大値と比較
				if (compareS > secondMaxS) {
					// 最大値を更新
					secondMaxS = compareS;
				}
			}
			
			// 出力
			System.out.println(maxS + secondMaxS);
		}
	}
}
