package work01;

import java.util.Scanner;

public class PerfectBus3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			// 乗客
			long count = 0;
			// 乗客の最小値
			long min = 0;
			// 増減する乗客数と最小値を記録していく
			for (int i = 0; i < N; i++) {
				count += scan.nextInt();		// 乗客数を足していく
				if (count < min) {				// その時点までの最小値と比較し、乗客数が小さかったら、最小値を更新
					min = count;				// minは初期値0以上になることはない。
				}
			}
			
			System.out.println(count - min);	// 合計値から最小値を引くと現在の乗客の数（最小限） 
												// minが-5の場合、乗客数が0人よりも少なくならないように最初に5人いたことになるので
												// 最後にcount - (-5) 5人足しとく
		}

	}

}
