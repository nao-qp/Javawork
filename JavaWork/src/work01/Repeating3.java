package work01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Repeating3 {
	// 連想配列を使用し、keyがA、valueがA出力最終位置をセットしておく方法
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < N; i++) {
				int A = scan.nextInt();
				// すでにキーにAが存在しているか
				if (map.containsKey(A)) {
					System.out.print(map.get(A));
				} else {
					System.out.print(-1);	// まだAは出現していなかったので-1出力
				}
				System.out.print(" ");
				// Aの最終出力位置を更新
				map.put(A, i + 1);			// Aは1番目
			}
		}
	}
}
