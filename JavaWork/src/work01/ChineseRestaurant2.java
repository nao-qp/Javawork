package work01;

import java.util.Scanner;

/**
 * 問題
 * https://atcoder.jp/contests/abc268/tasks/abc268_c
 */
public class ChineseRestaurant2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			// 料理のリストを作成
			int p[] = new int[N];
			for (int i = 0; i < N; i++) {
				p[i] = scan.nextInt();
			}
			// 操作回数について、その回数で何人の人が喜ぶかを配列で表す。
			// それぞれの人の前にある料理について、何回操作したらその料理で人が喜ぶ位置にくるか調べる
			// その回数の配列要素に+1する
			int[] count = new int[N];
			for (int i = 0; i < N; i++) {
				// i番目の人の前にある料理p[i]と料理p[i]を置きたい人(=p[i])との差分が移動回数
				// 移動回数はマイナスを考慮して+N、Nで割った余りとする
				// 両側も喜ぶので-1,+1回数にも1人追加
				count[(p[i] - i  + N - 1) % N] += 1;
				count[(p[i] - i  + N    ) % N] += 1;
				count[(p[i] - i  + N + 1) % N] += 1;
				/**
				 * 4
				 * 1 2 0 3
				 * i=0のとき
				 * 人0の前には料理1
				 * 料理1は人1のところに置きたい
				 * 1-0　　1回移動
				 * 両隣
				 * 1-0-1  0回移動
				 * 1-0+1  2回移動
				 * count[0][1][2]に喜ぶ人をプラス
				 */
			}
			
			// 操作回数の中で最大値を求める
			int max = 0;
			for (int c : count) {
				if (c > max) {
					max = c;
				}
			}
			// 出力
			System.out.println(max);
		}
	}
}
