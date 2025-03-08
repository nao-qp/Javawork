package work01;

import java.util.Scanner;

public class Bib2 {
	// 二重ループのためO[N^2]
	
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			
			// 見つめられる人P
			int[] P = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				P[i] = scan.nextInt();
			}
			
			// ゼッケン
			int[] Q = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				Q[i] = scan.nextInt();
			}
			
			for (int i = 1; i <= N; i++) {
				// ゼッケンiの人を探す
				for (int n = 1; n <= N; n++) {
					// i
					if (Q[n] == i) {
						// 人nが見つめている人P[n] 
						// P[n]がつけいているゼッケンを出力
						System.out.print(Q[P[n]] + " ");	
					}
				}
			}
		}
	}
}
