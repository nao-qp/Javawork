package work01;

import java.util.Scanner;

public class MoveIt2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int[] A = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				A[i] = scan.nextInt();
			}
			int[] W = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				W[i] = scan.nextInt();
			}
			
			int wSum = 0;	// 移動する重さ合計
			int boxA[] = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				// すでに箱に入っている荷物が軽かったら、それをwSumに加算していく
				if (boxA[A[i]] == 0) {
					// 箱が空なら箱に入れる。
					boxA[A[i]] = W[i];
				} else {
					// すでに箱に入っている場合、入っている荷物と入れようとしている荷物を比較
					if (boxA[A[i]] <= W[i]) {
						// もともと入っている荷物が軽いのでwSumに加算
						wSum += boxA[A[i]];
						// 代わりに重い方を新しく入れる
						boxA[A[i]] = W[i];
					} else {
						// 入れようとしている荷物がすでに入っている荷物よりも軽いのでwSumに加算する
						wSum += W[i];
					}
				}
			}
			System.out.println(wSum);
		}
	}
}
