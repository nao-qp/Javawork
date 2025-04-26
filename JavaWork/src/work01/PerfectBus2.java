package work01;

import java.util.Scanner;

public class PerfectBus2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			// 乗客
			long passenger = 0;
			// 乗客の差し引きを足していく
			for (int i = 0; i < N; i++) {
				passenger += scan.nextInt();
				if (passenger < 0) {
				// 乗客が負の整数になる場合は、事前に負の整数分の人数は居たことになる
				// →その時点で0人になる。(事前に乗っていた人数は関係ない。)
					passenger = 0;		// 乗客数を0人に戻す。
				}
			}
			System.out.println(passenger);
		}
	}
}
