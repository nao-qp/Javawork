package work01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 問題
 * https://atcoder.jp/contests/abc250/tasks/abc250_c
 * 
 * xの値の配列val[]と、xがある位置を管理する配列pos[]を用意
 * それぞれで隣との交換処理を行う
 * 読み込むxの位置はpos[x]で取得可能
 * その値はval[pos[x]]で取得可能
 * (xを配列の中から探すためのfor文が不要)
 */

public class AdjacentSwaps2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int Q = scan.nextInt();
			
			// xの値の配列(配列のindexがxの値がある位置)
			int[] val = new int[N + 1];
			// Arrays.setAllで渡した配列に対してすべての要素に第二引数で渡した値をセット
			// ラムダ式 インデックスiを全ての要素にセット
			Arrays.setAll(val, i -> i);	// 初期化 (最初は1,2,3,4...)
			
			// xの値がある位置の配列(配列のindexがxの値)
			int[] pos = new int[N + 1];
			Arrays.setAll(pos, i -> i);	// 初期化 (位置も最初は1,2,3,4...)
			
			for (int i = 0; i < Q; i++) {
				int x = scan.nextInt();
				int p0 = pos[x];	// xの位置
				int p1 = p0;		// 交換対象の位置(初期化 xの位置を設定)
				if (p0 == N) {
				// xが右端だったら
					p1 = p0 - 1;
				} else {
				// xが右端ではない
					p1 = p0 + 1;
				}
				// 値の位置の配列に対して入れ替えを行う
				swap(pos, p0, p1);
				// 値の配列に対して入れ替えを行う
				swap(val, val[p0], val[p1]);
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
