package work01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberPlace {
	// 行、列、3x3マスそれぞれについて、1~9の数字の登場回数を見ていき、
	// 同じ数字が2回目に登場した時点で、1~9が揃っていないことを判定する。(Noを出力)
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int[][] A = new int[10][10];
			
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					A[i][j] = scan.nextInt();
				}
			}
			
			// 行
			for (int i = 1; i <= 9; i++) {
				Map<Integer, Integer> AMap = new HashMap<>();
				for (int j = 1; j <= 9; j++) {
					// チェック対象の数字
					Integer number = A[i][j];
					// A配列の数字に対して、登場回数を設定していく。(スタートは0)
					AMap.put(number, AMap.getOrDefault(number, 0) + 1);	// AMapからnumberで値(登場回数)を取得し、+1する。
					// 同じ数字が2回登場
					if (AMap.get(number) > 1) {
						System.out.println("No");
						return;
					}
				}
			}
			
			// 列
			for (int j = 1; j <= 9; j++) {
				Map<Integer, Integer> AMap = new HashMap<>();
				for (int i = 1; i <= 9; i++) {
					Integer number = A[i][j];
					AMap.put(number, AMap.getOrDefault(number, 0) + 1);
					// 同じ数字が2回登場
					if (AMap.get(number) > 1) {
						System.out.println("No");
						return;
					}
				}
			}
			
			// 3x3マス
			int start = 0;	// チェックしてくマスのスタート地点Index
			for (int s = 0; s < 3; s++) {
				Map<Integer, Integer> AMap = new HashMap<>();
				for (int i = start + 1; i <= start + 3; i++) {
					for (int j = start + 1; j <= start + 3; j++) {
						Integer number = A[i][j];
						AMap.put(number, AMap.getOrDefault(number, 0) + 1);
						// 同じ数字が2回登場
						if (AMap.get(number) > 1) {
							System.out.println("No");
							return;
						}
					}
				}
				start += 3;
			}
			System.out.println("Yes");
		}
	}
}
