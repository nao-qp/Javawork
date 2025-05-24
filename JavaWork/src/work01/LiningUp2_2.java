package work01;

import java.util.Scanner;

public class LiningUp2_2 {
	/**
	 * 問題
	 * https://atcoder.jp/contests/abc337/tasks/abc337_c
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			
			/*
			 * 入力値
			 * 6
			 * 4 1 -1 5 3 2
			 * A配列
			 * A[1] = 4		人1が人4の後ろにいる
			 * A[2] = 1
			 * A[3] = 0	先頭(-1を0にして設定する)
			 * A[4] = 5
			 * A[5] = 3
			 * A[6] = 2
			 */
			int[] A = new int[N + 1];
			int num = 0;
			for (int i = 1; i <= N; i++) {
				A[i] = scan.nextInt();
				if (A[i] == -1) {
					A[i] = 0;		// 先頭
				}
			}
			
			/*
			 * Bの配列は、
			 * 人i(index)の後ろに並ぶ人は誰か
			 * B[A[1]] = 1	A[1] = 4
			 * B[A[2]] = 2	A[2] = 1
			 * B[A[3]] = 3	A[3] = 0
			 * .....
			 */
			int[] B = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				B[A[i]] = i;
			}
			
			/*
			 * 出力
			 * 並んだ人(出力)が次に出力する配列のindex
			 */
			for (int i = 0; i < N; i++) {
				if (i == 0) {
					System.out.print(B[i] + " ");
					num = B[i];		// 先頭の人
				} else {
					System.out.print(i == N - 1 ? B[num] : B[num] + " ");
					num = B[num];
				}
			}
		}
	}
}
