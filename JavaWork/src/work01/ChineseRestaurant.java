package work01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 問題
 * https://atcoder.jp/contests/abc268/tasks/abc268_c
 */
public class ChineseRestaurant {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			
			// ３人だった場合は必ず3人喜ぶ
			if (N == 3) {
				System.out.println(3);
				return;
			}
			
			// 料理ごとに何回移動したら人i(=p)が喜ぶか二次元配列に格納する(happyMoveCount[p][移動回数])
			int[][] happyMoveCounts = new int[N][3];	// 喜ぶ移動回数のindexは最大2
			for (int i = 0; i < N; i++) {
				int p = scan.nextInt();
				happyMoveCounts[i][0] = (p - i + N - 1) % N;	// 左隣に置いてもOK
				happyMoveCounts[i][1] = (p - i + N    ) % N;
				happyMoveCounts[i][2] = (p - i + N + 1) % N;	// 右隣
			}
			
			// デバッグ確認用
//			for (int i = 0; i < happyMoveCounts.length; i++) {
//				System.out.print(i + ":");
//				for (int j = 0; j < happyMoveCounts[i].length; j++) {
//					System.out.print(happyMoveCounts[i][j] + " ");
//				}
//				System.out.println();
//			}
			
			// 各移動回数について登場回数をカウント。最大のカウントが喜ぶ人の最大値
			// 例: moveIncludeCount(key: 0回移動  value: 3人の人が喜ぶ)
			Map<Integer, Integer> moveIncludeCount = new HashMap<>();
			for (int[] row : happyMoveCounts) {
				for (int num : row) {
					moveIncludeCount.put(num, moveIncludeCount.getOrDefault(num, 0) + 1);
				}
			}
			
			// 各移動回数に設定した喜ぶ人の人数の最大値を求める
			int happyMax = 0;
			for (Map.Entry<Integer, Integer> entry : moveIncludeCount.entrySet()) {
				if (entry.getValue() > happyMax) {
					happyMax = entry.getValue();
				}
			}
			// 出力
			System.out.println(happyMax);
		}
	}

}
