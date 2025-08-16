package work01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 問題
 * https://atcoder.jp/contests/abc243/tasks/abc243_c
 * 
 * y座標ごとにx座標を比較
 * 左向きの人で一番右にいる人(yLeftMax)、右向きの人で一番左にいる人(hRightMin)をMapで管理
 * 人iが左向きの場合、hRightMinよりも右にいる場合に衝突
 * 人iが右向きの場合、yLeftMaxよりも左にいる場合に衝突
 */

public class Collision2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int[] xList = new int[N];	// 人のx座標のリスト
			int[] yList = new int[N];	// 人のy座標のリスト
			
			for (int i = 0; i < N; i++) {
				xList[i] = scan.nextInt();	// x座標
				yList[i] = scan.nextInt();	// y座標
			}
			scan.nextLine();	// 空行読み飛ばし
			String S = scan.nextLine();		// 文字列S
			
			// y座標ごとの左向きで一番右にいる人のx座標、右向きで一番左にいる人ｘ座標のMapを作成
			// key: y座標  value: x座標
			Map<Integer, Integer> yLeftMax = new HashMap<>();
			Map<Integer, Integer> yRightMin = new HashMap<>();
			// 文字列Sを1文字ずつループする
			for (int i = 0; i < N; i++) {
				if (S.charAt(i) == 'L') {
				// 人iが左向き
					// keyがすでにある、かつ右向きで一番左にいる人よりも右にいると衝突
					if (yRightMin.containsKey(yList[i]) && yRightMin.get(yList[i]) < xList[i]) {
						System.out.println("Yes");
						return;
					}
				} else {
				// 人iが右向き
					// keyがすでにある、かつ左向きで一番右にいる人よりも左にいると衝突
					if (yLeftMax.containsKey(yList[i]) && yLeftMax.get(yList[i]) > xList[i]) {
						System.out.println("Yes");
						return;
					}
				}
				
				// 衝突しなかったので、Mapを更新
				if (S.charAt(i) == 'L') {
				// 人iが左向き
					// すでにkeyがあり一番右にいる人よりも右にいる場合　または、keyがない場合、Map更新
					if ((yLeftMax.containsKey(yList[i]) && yLeftMax.get(yList[i]) < xList[i])
						|| !(yLeftMax.containsKey(yList[i]))) {
							yLeftMax.put(yList[i], xList[i]);
					}
				} else {
				// 人iが右向き
					// すでにkeyがあり一番左にいる人よりも左にいる場合　または、keyがない場合、Map更新
					if ((yRightMin.containsKey(yList[i]) && yRightMin.get(yList[i]) > xList[i])
						|| !(yRightMin.containsKey(yList[i]))) {
							yRightMin.put(yList[i], xList[i]);
					}
				}
			}
			
			// 最後まで衝突せずに完了
			System.out.println("No");
		}
	}
}
