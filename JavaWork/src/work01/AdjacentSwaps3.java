package work01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 問題
 * https://atcoder.jp/contests/abc250/tasks/abc250_c
 * 
 * 値の配列に対して、xを探してIndexを取得、Indexを元に隣と入れ替え処理を行う
 */

public class AdjacentSwaps3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int Q = scan.nextInt();
			
			// xの配列を作成
			int[] val = new int[N + 1];
			Arrays.setAll(val, i -> i);
			
			for (int i = 1; i <= Q; i++) {
				int x = scan.nextInt();
				// xがどこにあるか探す
				for (int j = 1; j <= N; j++) {
					if (val[j] == x) {
						if (j == N) {
						// 右端
							swap(val, j, j - 1);	// 左隣と交換
						} else {
						// 右端ではない
							swap(val, j, j + 1);	// 右隣と交換
						}
						break;
					}
				}
			}
			
			// 出力
			for (int i = 1; i <= N; i++) {
				System.out.print(val[i] + " ");
			}
		}

	}
	
	/**
	 * 配列に対してxとyの値を入れ替える
	 * @param val
	 * @param x
	 * @param y
	 */
	public static void swap(int[] val, int x, int y) {
		int temp = val[x];
		val[x] = val[y];
		val[y] = temp;
	}

}
