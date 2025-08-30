package work01;

import java.util.Scanner;

/**
 * 問題
 * https://atcoder.jp/contests/abc236/tasks/abc236_c
 * SとTの駅の順番は同じため、Sの駅がTに含まれるか検索するときに、
 * 常にTの検索対象の先頭と比較すれば良い。（全件検索しなくて良い。）
 * 一致すれば、Tの検索対象の先頭を次の要素にする。
 */
public class RouteMap2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			// 駅の配列
			String[] S = new String[N];
			String[] T = new String[M];	// 急行停止駅
			
			for (int i = 0; i < N; i++) {
				S[i] = scan.next();
			}
			for (int i = 0; i < M; i++) {
				T[i] = scan.next();
			}
			
			int j = 0;	// TのIndex
			for (int i = 0; i < N; i++) {
				// Sの駅をTの先頭と比較していく(SとTの駅の並び順は同じ)
				if (S[i].equals(T[j])) {
					System.out.println("Yes");
					j++;	// Tの先頭と一致したら、比較対象の先頭を次の要素にする
				} else {
					System.out.println("No");
				}
			}
		}
 	}

}
