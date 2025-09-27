package work01;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 問題
 * https://atcoder.jp/contests/abc208/tasks/abc208_c
 * 国民の並び順と国民番号のPairを作成する(record)
 * Pairのリストpairsを作成する(pairsの並び順は国民の並び順)
 * pairsを国民番号昇順に並べ替える
 * 出力用の配列answerに公平に配られるお菓子の数をセット
 * answerについて、pairsリストの0〜余りのお菓子-1のindexの値の該当箇所にお菓子の余り+1をする。
 * answerは国民の並び順なのでそのまま出力
 */
public class FairCandyDistribution2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			long K = scan.nextLong();
			
			// 並び順indexと国民番号numberのペアのリストを作成
			record Pair(int index, int number) {}
			Pair[] pairs = new Pair[N];
			for (int i = 0; i < N; i++) {
				pairs[i] = new Pair(i, scan.nextInt());
			}
			
			// index順に出力するお菓子の数の配列
			long[] answer = new long[N];
			
			// 全員に同じ数のお菓子を配る
			Arrays.fill(answer, K / N);
			
			// pairsを国民番号順に並べ替える
			Arrays.sort(pairs, (a, b) -> a.number - b.number);
			
			// 余りを配る
			for (int i = 0; i < K % N; i++) {
				// 国民番号順に並んでいるpairsからindexを取得して該当のanswerのお菓子の数に+1する
				answer[pairs[i].index]++;
			}
			
			for (int i = 0; i < N; i++) {
				System.out.println(answer[i]);
			}
		}
	}
}
