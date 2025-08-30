package work01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 問題
 * https://atcoder.jp/contests/abc236/tasks/abc236_c
 * 全ての駅Sを駅名と停止判定の組み合わせでMapを作成(LinkedHashMapで順序を保持)
 * 急行が止まる駅について駅名でマッチさせて、停止判定をYesに上書きする。
 * 順番に出力する
 */
public class RouteMap {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			// 全ての駅SのMapを作成(key:駅名 value:停止判定)
			Map<String, String> sMap = new LinkedHashMap<>();
			
			// S駅読み込み
			for (int i = 0; i < N; i++) {
				// 初期値は”No”を設定
				sMap.put(scan.next(), "No");
			}
			
			// T駅読み込み
			for (int i = 0; i < M; i++) {
				// 急行が停止するので"Yes"で上書き
				sMap.put(scan.next(), "Yes");
			}
			
			// 順番に出力
			sMap.values().forEach(System.out::println);
		}
 	}

}
