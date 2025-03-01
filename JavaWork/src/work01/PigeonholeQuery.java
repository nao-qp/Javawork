package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PigeonholeQuery {

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
			
			// 各巣の鳩リスト初期値を作成
			// 鳩リストが入る巣のリストを作成
			List<List<Integer>> holes = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				List<Integer> pigeons = new ArrayList<>();
				pigeons.add(i);
				holes.add(pigeons);
			}
//			System.out.println(holes);
			
			for (int i = 0; i < Q; i++) {
				if (scan.nextInt() == 1) {
					int P = scan.nextInt();		// 鳩P
					int H = scan.nextInt();		// 巣H
					// 巣を移動
					pigeonMove(P, H, holes);
//					System.out.println("移動後リスト:" + holes);
				} else {
					// 各巣の鳩の数をカウントして鳩が複数いる巣の数を出力
					int multipleHoleCount = 0;
					for (List<Integer> psions: holes) {
//						System.out.println("鳩リストサイズ:" + psions.size());
						if (psions.size() > 1) {
							multipleHoleCount ++;
						}
					}
					System.out.println(multipleHoleCount);
				}
			}
		}
		// エンド
		long endTime = System.currentTimeMillis();
		System.out.println("処理時間: " + (endTime - startTime) + " ミリ秒");
		// 処理時間: 3186 ミリ秒
		
		// 処理後のメモリ使用量を記録
        long afterUsedMemory = runtime.totalMemory() - runtime.freeMemory();
        // 使用メモリ量の差分を計算して表示
        long usedMemory = afterUsedMemory - beforeUsedMemory;
        System.out.println("使用メモリ: " + usedMemory / 1024 / 1024 + " MB");
        // 使用メモリ: 1 MB
        
//        処理時間: 1027 ミリ秒
//        使用メモリ: 1 MB
	}
	

	/**
	 * 鳩Pが巣Hに移動し、移動処理後の巣リストを返す
	 * @param P 移動する鳩
	 * @param H 移動先の巣
	 * @param holes 鳩リストが入った巣のリスト
	 * @return 巣リスト
	 */
	private static List<List<Integer>> pigeonMove(int P, int H, List<List<Integer>> holes) {
		// 鳩Pがどの巣リストにいるか検索
		int existPhole = 0;
		// 巣のリストをループ
		for (int i = 0; i < holes.size(); i++) {
			// i番目の巣の鳩リスト
			List<Integer> pigeons = holes.get(i);
			// 鳩Pが該当の鳩リストにいるかチェック
			if (pigeons.contains(P - 1)) {
				existPhole = i;	// i番目の巣に鳩Pがいる。
				break;
			}
		}
		// 移動処理
//		System.out.println(existPhole);
		holes.get(existPhole).remove(Integer.valueOf(P - 1));
		holes.get(H - 1).add(P - 1);
		return holes;
	}
	
	
}
