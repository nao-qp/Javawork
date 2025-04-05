package work01;

import java.util.Scanner;

public class MoveIt4 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int[] A = new int[N ];
			for (int i = 0; i < N; i++) {
				A[i] = scan.nextInt();
			}
			int[] W = new int[N];
			for (int i = 0; i < N; i++) {
				W[i] = scan.nextInt();
			}
			
			// 全ての重量の合計を求める。
			int sum = 0;
			// 各箱の重量最大値のリストを作成する。
			int[] maxList = new int[N];
			for (int i = 0; i < N; i++) {
				if (W[i] > maxList[A[i] - 1]) {
					maxList[A[i] - 1] = W[i];
				}
				sum += W[i];
			}
			
			// 重量最大値リストの合計を全ての重量の合計から引く。
			for (int i = 0; i < N; i++) {
				sum -= maxList[i];
			}
			// コスト
			System.out.println(sum);
		}
	}
}
