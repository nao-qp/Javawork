package work01;

import java.util.Scanner;

public class BumbleBee3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			// 訪れた花の数
			int N = scan.nextInt();
			// 花の種類ごとの数を格納する配列
			// 花の種類Aは1オリジン。種類1の数はインデックス1の配列に格納するため要素数N + 1の配列を用意する。
			int aKindsKist[] = new int[N + 1];
			// 受粉回数
			int matchCount = 0;
			for (int i = 0; i < N; i++) {
				int A = scan.nextInt();
				// 花の種類を配列のindexに使用する
				aKindsKist[A]++;
				// 要素数が1よりも大きい場合、同じ種類の花に再び訪れたことになる
				if (aKindsKist[A] > 1) {
					matchCount++;
				}
			}
			System.out.println(matchCount);
		}
	}
}
