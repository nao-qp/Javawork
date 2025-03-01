package work01;

import java.util.Scanner;

public class PigeonholeQuery2 {

	private static class PigeonholeQueryMethod {
		
		// 巣を移動
		public static void query1(int P, int H, int[] pos, int[] count) {
			// 鳩Pがいた巣の数を1引く
			count[pos[P]]--;
			// 鳩Pのいる巣をHに変更
			pos[P] = H;
			// 巣Hの鳩を1増やす
			count[H]++;
		}
		
		// 鳩が複数いる巣を数えて出力
		public static void query2(int[] count) {
			int multipleCount = 0;
			for (int i = 1; i < count.length; i++) {
				if (count[i] > 1) {
					multipleCount++;
				}
			}
			System.out.println(multipleCount);
		}
	}

	public static void main(String[] args) {
		// スタート
		long startTime = System.currentTimeMillis();
		// JVM のランタイムインスタンスを取得
        Runtime runtime = Runtime.getRuntime();
        // ガベージコレクションを実行して未使用メモリを整理
        runtime.gc();
        // 処理前のメモリ使用量を記録
        long beforeUsedMemory = runtime.totalMemory() - runtime.freeMemory();
        

		try(Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();		// 鳩、巣の数
			int Q = scan.nextInt();		// クエリの数
			
			int[] pos = new int[N + 1];		// 鳩iがいる巣（1オリジン）
			int[] count = new  int[N + 1];	// 巣iにいる鳩の数（1オリジン）
			
			// 初期化
			for (int i = 1; i <= N; i++) {
				pos[i] = i;		// i番目の鳩は巣iにいる
				count[i] = 1;	// i番目の巣には鳩が1羽いる
			}
			
			for (int i = 0; i < Q; i++) {
				// クエリの種類ごとに処理を実行
				int type = scan.nextInt();
				switch (type) {
					case 1 -> {
						// 巣を移動
						int P = scan.nextInt();		// 鳩P
						int H = scan.nextInt();		// 巣H
						PigeonholeQueryMethod.query1(P, H, pos, count);
					}
					case 2 -> {
						// 鳩が複数いる巣の数を数えて出力
						PigeonholeQueryMethod.query2(count);
					}
					default -> {
						throw new IllegalArgumentException();
					}
				}
			}
		}
		// エンド
		long endTime = System.currentTimeMillis();
		System.out.println("処理時間: " + (endTime - startTime) + " ミリ秒");
		// 処理時間: 3261 ミリ秒
		
		// 処理後のメモリ使用量を記録
        long afterUsedMemory = runtime.totalMemory() - runtime.freeMemory();
        // 使用メモリ量の差分を計算して表示
        long usedMemory = afterUsedMemory - beforeUsedMemory;
        System.out.println("使用メモリ: " + usedMemory / 1024 / 1024 + " MB");
        // 使用メモリ: 1 MB
	}
}
