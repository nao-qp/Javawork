package work01;

import java.util.Scanner;

/**
 * 問題
 * https://atcoder.jp/contests/abc272/tasks/abc272_c
 * 
 * 偶数と奇数それぞれ2要素あった場合に、それぞれの上位2要素の合計を比較し大きいものを出力する
 */

public class MaxEven {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			
			// 偶数
			int evenMax = -1;		// 最大値
			int evenMaxSec = -1;	// 2番目に大きい数値
			int evenTotal = -1;		// 2要素ある場合のevenMax + evenMaxSec
			// 奇数
			int oddMax = -1;
			int oddMaxSec = -1;
			int oddTotal = -1;
			
			for (int i = 0; i < N; i++) {
				int A = scan.nextInt();
				switch (A % 2) {
					case 0 -> {
					// 読み込んだ数値が偶数の場合
						if (A > evenMax) {
							evenMaxSec = evenMax;
							evenMax = A;
						} else if (A > evenMaxSec) {
							evenMaxSec = A;
						}
					}
					case 1 -> {
					// 奇数の場合
						if (A > oddMax) {
							oddMaxSec = oddMax;
							oddMax = A;
						} else if (A > oddMaxSec) {
							oddMaxSec = A;
						}
					}
				}
				
				// 2要素あった場合に合計値を出す
				if (evenMax > -1 && evenMaxSec > -1) {
					evenTotal = evenMax + evenMaxSec;
				}
				if (oddMax > -1 && oddMaxSec > -1) {
					oddTotal = oddMax + oddMaxSec;
				}
			}
			
			// 偶数、奇数それぞれの合計で最大の方を出力
			System.out.println(Math.max(evenTotal, oddTotal));
		}
	}
}
