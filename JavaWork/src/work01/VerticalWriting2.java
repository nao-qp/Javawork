package work01;

import java.util.Scanner;

public class VerticalWriting2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			int N = scan.nextInt();
			scan.nextLine();
			
			String[] sList = new String[N];
			int M = 0;		//S文字数長さ最大値
			for (int i = 0; i < N; i++) {
				sList[i] = scan.nextLine();
				if (sList[i].length() > M) {
					M = sList[i].length();
				}
			}

			String[][] S = new String[N][M];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < sList[i].length(); j++) {
					S[i][j] = String.valueOf(sList[i].charAt(j));
				}
			}
			
			// *でマスを作る
			String[][] T = new String[M][N];
			for (int j = 0; j < M; j++) {
				for (int i = 0; i < N; i++) {
					T[j][i] = "*";
				}
			}

			// *を文字で埋めていく
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (S[i][j] != null) {
						T[j][N - i - 1] = S[i][j];
//						System.out.println(i + " " + j + " " + S[i][j]);
					}
				}
			}

			// Tの末尾の*を削除する
			for (int j = 0; j < M; j++) {
				for (int i = 1; i < N; i++) {
					if (T[j][N - i] != "*" ) {
						break;
					} else {
						T[j][N - i] = " ";
					}
				}
			}
			
			// Tを出力
			for (int j = 0; j < M; j++) {
				for (int i = 0; i < N; i++) {
					System.out.print(T[j][i]);
				}
				System.out.println();
			}
			
		}

	}

}
