package work01;

import java.util.Scanner;

public class Bib4 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int[] P = new int[N + 1];		// 見つめられる人
			int[] Q = new int[N + 1];		// ゼッケン
			// ゼッケンQ[i]人がP[i]の人を見つめている
			// P[i]の人のゼッケンはQ[P[i]]
			
			for (int i = 1; i <= N; i++) {
				P[i] = scan.nextInt();
			}
			for (int i = 1; i <= N; i++) {
				Q[i] = scan.nextInt();
			}
			
			// 見つめられる人のゼッケンの配列
			int[] bib = new int[N + 1];
			// ゼッケン番号順に配列を作成
			for (int i = 1; i <= N; i++) {
				bib[Q[i]] = Q[P[i]];
			}
			System.out.print(bib[1]);
			for (int i = 2; i <= N; i++) {
				System.out.print(" " + bib[i]);
			}
			
		}
	}

}
