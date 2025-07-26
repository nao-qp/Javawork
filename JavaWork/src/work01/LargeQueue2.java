package work01;

import java.util.Scanner;

public class LargeQueue2 {

/*
 * 問題
 * https://atcoder.jp/contests/abc413/tasks/abc413_c
 * 
 * →大きな値に対応できない
 */
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int Q = scan.nextInt();
			int[] A = new int[999999999];
			int index = 0;
			int rmIndex = 0;
			for (int i = 0; i < Q; i++) {
				int query = scan.nextInt();
				if (query == 1) {
					int c = scan.nextInt();
					int x = scan.nextInt();
					for (int j = 0; j < c; j++) {
						A[index] = x;
						index ++;
					}
				} else {
					int k = scan.nextInt();
					int sum = 0;
					for (int j = 0; j < k; j++) {
						sum += A[rmIndex];
						rmIndex ++;
					}
					System.out.println(sum);
				}
			}
		}
	}
}
