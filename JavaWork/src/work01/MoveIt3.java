package work01;

import java.util.Scanner;

public class MoveIt3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = scan.nextInt();
			}
			int[] W = new int[N];
			for (int i = 0; i < N; i++) {
				W[i] = scan.nextInt();
			}
			// 箱ごとの重さのリストを作成
			int[][] listOfWeight = new int[N][N];
			for (int i = 0; i < N; i++) {
				listOfWeight[A[i] - 1][i] = W[i]; 
			}
			
			int cost = 0;
			// 箱ごとの合計と箱の中の最大の重さを求める
			for (int i = 0; i < N; i++) {
				int max = 0;
				int boxSum = 0;
				int[] weights = listOfWeight[i];
				for (int j = 0; j < N; j++) {
					if (weights[j] > max) {
						max = weights[j];
					}
					boxSum += weights[j];
				}
				// 箱の合計 - 最大重量を全体のコストに足す。
				cost += boxSum - max;
			}
			System.out.println(cost);
		}
	}
}
