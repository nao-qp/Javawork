package work01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 問題
 * https://atcoder.jp/contests/abc236/tasks/abc236_c
 * SとTの駅のSet(HashSet)を作成。
 * SがTに含まれるか判定してYes or Noを出力する。
 */
public class RouteMap3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			// S駅の配列
			String[] S = new String[N];
			// T駅のSet(Sが含まれるか検索対象)
			Set<String> T = new HashSet<>();
			
			for (int i = 0; i < N; i++) {
				S[i] = scan.next();
			}
			for (int i = 0; i < M; i++) {
				T.add(scan.next());
			}
			
			for (String station: S) {
				// Hashで一致するか検索する方が文字列比較よりも速い
				if (T.contains(station)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
 	}
}
