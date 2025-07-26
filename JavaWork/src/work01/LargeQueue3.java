package work01;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class LargeQueue3 {
/*
 * 問題
 * https://atcoder.jp/contests/abc413/tasks/abc413_c
 * 
 */
	
	private static Queue<Pair> queue = new ArrayDeque<>();
	
	// クエリー1
	public static void query1(long c, long x) {
		Pair pair = new Pair(c, x);
		queue.offer(pair);
	}
	
	// クエリー2
	public static void query2(long k) {
		
		long c = queue.peek().getC();
		long x =  queue.peek().getX();
		long sum = 0;
		
//		long c = queue.peek().getC();
//		long x =  queue.peek().getX();
//		long sum = 0;
//		
//		for (long i = k; i > 0; i--) {
//				sum += x;
//				c --;
//				queue.peek().reduceC(c);
//				if (c == 0) {
//					queue.poll();
//					c = queue.peek().getC();
//					x =  queue.peek().getX();
//				}
//		}
		
		// ループを少なくしたパターン
		if (k >= c) {
			for (long i = k; i > 0; i--) {
				sum += x;
				c --;
				queue.peek().reduceC(1);
				if (c == 0) {
					queue.poll();
					c = queue.peek().getC();
					x =  queue.peek().getX();
				}
			}
			
		} else {
		// ｋがcより小さい場合は、ループせずに合計を出して出力
			sum += x * k;
			queue.peek().reduceC(k);
		}
		
		
		// 合計出力
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int Q = scan.nextInt();
			
			for (int i = 0; i < Q; i++) {
				int type = scan.nextInt();
				switch(type) {
				case 1 -> query1(scan.nextInt(), scan.nextInt());
				case 2 -> query2(scan.nextInt());
				}
			}
		}
	}
}


	class Pair {
		private long c;
		private final long x;
		
		Pair(long c, long x) {
			this.c = c;
			this.x = x;
		}
		
		public long getC() {
			return this.c;
		}
	
		public void reduceC(long k) {
			this.c -= k;
		}
		
		public long getX() {
			return this.x;
		}
	
}