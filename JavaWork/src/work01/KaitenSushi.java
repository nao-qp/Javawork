package work01;

import java.util.Scanner;

public class KaitenSushi {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();		// 人の数
			int M = scan.nextInt();		// 寿司の数
			
			int[] A = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				A[i] = scan.nextInt();
			}
			
			boolean printOut = false;
			for (int j = 1; j <= M; j++) {
				int B = scan.nextInt();
				// 人の美食度配列を寿司のおいしさで検索していく
				for (int i = 1; i <= N; i++) {
					// 寿司のおいしさが人の美食度以上であれば食べる
					if (A[i] <= B) {
						System.out.println(i);
						printOut = true;
						break;
					}
				}
				if (!printOut) {
					System.out.println(-1);
				}
				printOut = false;
			}
		}
	}
}
