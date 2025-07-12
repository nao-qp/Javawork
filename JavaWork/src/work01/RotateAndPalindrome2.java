package work01;

import java.util.Scanner;

//問題
//https://atcoder.jp/contests/abc286/tasks/abc286_c
/**
この2つの操作は、組み合わせが同じであれば順序を入れ替えても出来上がる文字列は同じになる。（移動させてから変更しても、変更してから移動させても結果は同じ）
つまり、Aの操作を行ってからBの操作を行って回文を作るという処理を全パターン行い、その中から最小のコストを求めることができる。
Aの操作は0～N-1回行うことができる（N回で元の文字列に戻るため）ので、全部でN個のパターンが存在する。
この各パターンでBの操作によって回文を作成する。具体的には、文字列の左からi番目と右からi番目の文字を比較していき、異なっていたときにBの操作を行う。
これによって回文ができるまでのコストを求め、その最小値を求めればよい。
 */

public class RotateAndPalindrome2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
            int N = scan.nextInt();
            long A = scan.nextInt();
            long B = scan.nextInt();
            String S = scan.next();

            long min = Long.MAX_VALUE; // コストの最小値

            // A の操作の繰り返し
            for (int i = 0; i < N; i++) {
                long cost = A * i;  // A の操作コスト

                // B の操作の繰り返し
                for (int j = 0; j < N / 2; j++) {
                    if (S.charAt(j) != S.charAt(N - 1 - j)) {
                        cost += B;  // B の操作コストを追加
                    }
                }

                // コストの最小値を更新
                min = Math.min(min, cost);

                // 先頭文字を末尾へ移動
                S = S.substring(1) + S.substring(0, 1);
            }

            System.out.println(min);
        }
	}
}
