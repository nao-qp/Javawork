package work01;

import java.util.Arrays;
import java.util.Scanner;

public class KaitenSushi3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();		// 人の数
			int M = scan.nextInt();		// 寿司の数
		
			int min = 200000;			// おいしさ最小値
			int[] C = new int[200001];	// おいしさ最大値までのおいしさ配列
			Arrays.fill(C, -1);			// 初期値-1で埋める
			for (int i = 1; i <= N; i++) {
				int A = scan.nextInt();
				// 何番目の人が食べるかiを入れていく
				while (A <= min) {	// A <= 食べる <= 200000
					// i番目の人がAi以上のおいしさの寿司を食べていく。
					// 何番目の人が食べるかCにセットしていく。
					C[min--] = i;	// Indexがminの要素にi番目を入れたら、minを1減らす。
				}
			}
			
			// 寿司のおいしさでC配列に問い合わせる。
			for (int j = 0; j < M; j++) {
				int B = scan.nextInt();
				System.out.println(C[B]);	// 何番目の人が食べたか、食べる人がいなかったのか(-1)が出力される
			}
		}

	}

}
