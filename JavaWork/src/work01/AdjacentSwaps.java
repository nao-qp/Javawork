package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 問題
 * https://atcoder.jp/contests/abc250/tasks/abc250_c
 */

public class AdjacentSwaps {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int Q = scan.nextInt();
			List<Integer> xList = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				xList.add(i + 1);
			}
			for (int i = 0; i < Q; i++) {
				int x = scan.nextInt();
				int xIndex = xList.indexOf(x);
				if (xIndex != N - 1) {
				// 右端ではない場合
					// 右隣の整数
					int swapNum = xList.get(xIndex + 1);
					// 該当の整数があった場所に、右隣の整数を入れる
					xList.set(xIndex, swapNum);
					// 該当の整数を右隣に入れる
					xList.set(xIndex + 1, x);
				} else {
				// 右端の場合
					// 左隣の整数
					int swapNum = xList.get(xIndex - 1);
					// 右端に、左隣の整数を入れる
					xList.set(xIndex, swapNum);
					// 該当の整数を右隣に入れる
					xList.set(xIndex - 1, x);
				}
			}
			// 出力
			String xListStr = xList.stream()
					.map(String::valueOf)
					.collect(Collectors.joining(" "));
			System.out.println(xListStr);
		}
	}
}
