package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargeQueue {
/*
 * 問題
 * https://atcoder.jp/contests/abc413/tasks/abc413_c
 * 
 * →大きな値に対応できない
 */

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int Q = scan.nextInt();
			List<Integer> A = new ArrayList<>();
			
			for (int i = 0; i < Q; i++) {
				int query = scan.nextInt();
				if (query == 1) {
					int c = scan.nextInt();
					int x = scan.nextInt();
					for (int j = 0; j < c; j++) {
						
//						System.out.println("x: " + x);
						
						A.add(x);
//						System.out.println("Aの中身: " + A);
					}
				} else {
					int k = scan.nextInt();
//					System.out.println("k: " + k);
					
					int sum = 0;
					for (int t = 0; t < k; t++) {
						int remk = A.get(0);
						
//						System.out.println("remk: " + remk);
						sum += remk;
						A.remove(0);
					}
					// 合計を出力
					System.out.println(sum);
				}
//				  System.out.println("Aの中身: " + A);
			}
			
		}
	}
}
