package work01;

import java.util.Scanner;

/*
 * 問題
 * https://atcoder.jp/contests/abc217/tasks/abc217_c
 * P[i]のIndexがQの値になるので,Qはi[P]になる。
 * 配列を読み込む時にIndexをQの値に設定し、Pの値をindex(i)に設定して配列を作る。
 */
public class InverseOfPermutation {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int[] Q = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				Q[scan.nextInt()] = i;
			}
			
			for (int i = 1; i <= N; i++) {
				System.out.print(Q[i]);
				if (i != N) {
					System.out.print(" ");
				}
			}
		}
	}
}
