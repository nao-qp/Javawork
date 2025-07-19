package work01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 問題
 * https://atcoder.jp/contests/abc272/tasks/abc272_c
 * 
 * 2つの値を足した時に偶数になるのは、偶数が2つ、奇数が2つの組み合わせのみ
 * 偶数、奇数の降順のリストを作成し、それぞれのリストの上位2つの値を足して、
 * 大きい方を出力する
 * 
 */

public class MaxEven3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			List<Integer> evenList = new ArrayList<>();
			List<Integer> oddList = new ArrayList<>();
			
			// 偶数、奇数リスト作成
			for (int i = 0; i < N; i++) {
				int A = scan.nextInt();
				if (A % 2 == 0) {
					evenList.add(A);
				} else {
					oddList.add(A);
				}
			}
			// 並べ替え
			evenList.sort(Comparator.reverseOrder());
			oddList.sort(Comparator.reverseOrder());
			
			int max = -1;
			// 偶数2つの最大の合計
			if (evenList.size() > 1) {
				max = evenList.get(0) + evenList.get(1);
			}
			// 奇数2つの最大の合計
			if (oddList.size() > 1) {
				// maxと比較して大きければ設定
				max = Math.max(max, oddList.get(0) + oddList.get(1));
			}
			System.out.println(max);
		}
	}
}
