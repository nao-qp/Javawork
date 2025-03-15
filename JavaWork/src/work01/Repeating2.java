package work01;

import java.util.Arrays;
import java.util.Scanner;

public class Repeating2 {
	// Aをインデックスとした配列を最初にあらかじめ全て用意し、そこに最終出現位置を格納していく
	// 対象のAについて、出力するBの値を入れておく配列Bを最後に出力する。
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			
			int[] last = new int[1000000001];		// 本来はAの範囲が1以上Nの9乗のためメモリオーバー
			Arrays.fill(last, -1);	// 配列を-1で初期化
			int[] B = new int[N];
			
			for (int i = 0; i < N; i++) {
				int A = scan.nextInt();
				B[i] = last[A];
				last[A] = i + 1;
			}
			
			for (int i = 0; i < N; i++) {
				if (i != 0) {
					System.out.print(" ");	// 数字出力後の空白を出力
				}
				System.out.print(B[i]);
			}
		}
	}
}
