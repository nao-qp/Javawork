package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxMEX {

//問題
// https://atcoder.jp/contests/abc290/tasks/abc290_c

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int K = scan.nextInt();
			
			List<Integer> A = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				A.add(scan.nextInt());
			}
			
			// Kが3なので3回選べる
			for (int i = 0; i <= K; i++) {
				if (!A.contains(i)) {
					System.out.println(i);
					return;
				}
			}
			System.out.println(K);
		}
	}
}
