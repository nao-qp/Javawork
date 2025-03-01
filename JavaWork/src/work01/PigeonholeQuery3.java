package work01;

import java.util.Scanner;

public class PigeonholeQuery3 {

	public class PigeonholeQueryMethod {
		
		// 巣を移動
		public int query1(int P, int H, int[] pos, int[] count, int ans) {
			// 鳩が複数いる巣の数の変動は、鳩の移動で
			// 1羽から2羽に変わった場合、2羽から1羽に変わった場合のみ
			
			// 鳩Pのいる巣の鳩の数が2羽
			if (count[pos[P]]-- == 2) {		// 後置デクリメント:値を比較してから、--される
				// 鳩が複数いる巣の数を1減らす
				ans--;
			}
			// 移動先の巣の鳩の数が1羽から2羽になる
			if (count[H]++ == 1) {
				// 鳩が複数いる巣の数を1増やす
				ans++;
			}
			
//			// 後置デクリメントを使用しない場合
//			if (count[pos[P]] == 2) {
//				ans--;
//				count[pos[P]]--;
//			} else {
//				count[pos[P]]--;
//			}
//			
//			if (count[H] == 1) {
//				ans++;
//				count[H]++;
//			} else {
//				count[H]++;
//			}

			// 鳩Pの巣がHになる
			pos[P] = H;
			
			return ans;
		}
		
		// 鳩が複数いる巣の数を出力
		public void query2(int ans) {
			System.out.println(ans);
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
			// 鳩が複数いる巣の数
			int ans = 0;
			
			// メソッドクラスのインスタンス化
			PigeonholeQuery3 pigeonholeQuery3 = new PigeonholeQuery3();
			PigeonholeQueryMethod pigeonholeQueryMethod = pigeonholeQuery3.new PigeonholeQueryMethod();
			
			for (int i = 0; i < Q; i++) {
				// クエリの種類ごとに処理を実行
				int type = scan.nextInt();
				switch (type) {
					case 1 -> {
						// 巣を移動
						int P = scan.nextInt();		// 鳩P
						int H = scan.nextInt();		// 巣H
						ans = pigeonholeQueryMethod.query1(P, H, pos, count, ans);
					}
					case 2 -> {
						// 鳩が複数いる巣の数を数えて出力
						pigeonholeQueryMethod.query2(ans);
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
		// 処理時間: 2626 ミリ秒
		
		// 処理後のメモリ使用量を記録
        long afterUsedMemory = runtime.totalMemory() - runtime.freeMemory();
        // 使用メモリ量の差分を計算して表示
        long usedMemory = afterUsedMemory - beforeUsedMemory;
        System.out.println("使用メモリ: " + usedMemory / 1024 / 1024 + " MB");
        // 使用メモリ: 2 MB
        
	}

}
