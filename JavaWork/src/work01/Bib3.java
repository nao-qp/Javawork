package work01;

import java.util.Scanner;

public class Bib3 {
	// 出力用配列Sを作成するループ、Sを出力するループでO[2N]
	
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			
			// 見つめられる人Pの配列読み込み
			int[] P = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				P[i] = scan.nextInt();
			}
			
			// ゼッケンの配列読み込み
			int[] Q = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				Q[i] = scan.nextInt();
			}
			
			// 出力用リストS（Sの配列は出力順(ゼッケン順)）
			int[] S = new int[N + 1];
			// S[Q[n]] に Q[P[n]] をセットしていく。（人nが見ている人P[n]のゼッケンQ[P[n]]
			for (int n = 1; n <= N; n++) {
				S[Q[n]] = Q[P[n]];
			}
			
			for (int i = 1; i <= N; i++) {
				System.out.print(S[i] + " ");
			}
		}
	}
}
