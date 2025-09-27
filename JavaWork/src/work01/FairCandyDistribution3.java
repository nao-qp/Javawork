package work01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 問題
 * https://atcoder.jp/contests/abc208/tasks/abc208_c
 * 国民の並び順Indexのリストを作成する
 * 国民番号のリストを作成する
 * 国民の並び順のリストを、国民番号のリストを使って国民番号昇順に並べ替える
 * 出力用のanswer(国民の並び順)に公平に配るお菓子をセット
 * answerについて、国民の並び順のリストうち0〜余りのお菓子-1のindexの値の該当箇所に余りのお菓子+1をする
 */
public class FairCandyDistribution3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			long K = scan.nextLong();
			
			// 国民番号の配列
			int[] a = new int[N];
			for (int i = 0; i < N; i++) {
				a[i] = scan.nextInt();
			}
			
			// 国民の並び順の配列　(0〜N-1の配列を作成。index=セットした値)
			List<Integer> order = Stream.iterate(0, x -> x + 1).limit(N)
					.collect(Collectors.toList());
			// orderを国民番号昇順に合わせて並べ替える。
			// aの配列を並べ替えの時の比較に使う。
			Collections.sort(order, (x, y) -> a[x] - a[y]);
			
			// 出力用配列
			long[] answer = new long[N];
			// 公平にお菓子を配る
			Arrays.fill(answer, K / N);
			// 余りを該当の箇所に配る
			for (int i = 0; i < K % N; i++) {
				// 国民番号を昇順で並べた時の、その国民番号のもともとの並び順indexに該当するanswerの値に+1
				answer[order.get(i)]++;
			}
			
			for (int i = 0; i < N; i++) {
				System.out.println(answer[i]);
			}
			
		}
	}
}
