package work01;

import java.util.Scanner;

/**
 * 問題
 * https://atcoder.jp/contests/abc272/tasks/abc272_c
 * 
 * 組み合わせの全パターンを試して一番大きいものを出力する（非効率なパターン）
 * 
 */

public class MaxEven2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int[] AList = new int[N];
			for (int i = 0; i < N; i++) {
				AList[i] = scan.nextInt();
			}
			int max = -1;
			for (int i = 0; i < N - 1; i++) {
				for (int j = 1; j < N; j++) {
					int sum = AList[i] + AList[j];
					// 合計が偶数かつ最大値よりも大きい場合maxに入れる
					if (sum % 2 == 0 && sum > max) {
						max = sum;
					}
				}
 			}
			
			System.out.println(max);
		}
	}
}
