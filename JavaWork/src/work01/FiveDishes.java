package work01;

import java.util.Scanner;

public class FiveDishes {

/**
 * 問題
 * https://atcoder.jp/contests/abc123/tasks/abc123_b
 */
	
	/**
	 * 待ち時間が一番短い料理を最後に注文する
	 * 全ての調理時間(待ち時間込み)の合計を出す
	 * 待ち時間が一番長い料理を最後に注文するので、合計から一番長い待ち時間を引く
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			// 調理時間合計(待ち時間込み)
			int totalTime = 0;
			// 最大待ち時間
			int maxWaitTime = 0;
			for (int i = 0; i < 5; i++) {
				// 調理時間
				int dishTime = scan.nextInt();
				// 料理が運ばれてきて次の注文時間までの待ち時間
				int waitTime = getWaitTime(dishTime);
				// 最大待ち時間を更新
				if (waitTime > maxWaitTime) {
					maxWaitTime = waitTime;
				}
				// 待ち時間込みの調理時間を合計にプラスする
				totalTime += dishTime + waitTime;
			}
			// 最大待ち時間を引いて出力
			System.out.println(totalTime - maxWaitTime);
		}
	}
	
	/**
	 * 次の注文までの待ち時間を取得
	 * @param dishTime
	 * @return
	 */
	private static int getWaitTime(int dishTime) {
		int waitTime = 0;
		// 端数がある場合、待ち時間あり
		if (dishTime % 10 > 0) {
			waitTime = 10 - dishTime % 10;
		}
		return waitTime;
	}
}
