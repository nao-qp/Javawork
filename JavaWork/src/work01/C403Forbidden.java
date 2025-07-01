package work01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 問題
// https://atcoder.jp/contests/abc403/tasks/abc403_c

public class C403Forbidden {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			scan.nextInt();		// 人数を読み飛ばす
			int M = scan.nextInt();		// コンテストページ
			int Q = scan.nextInt();		// クエリの数
			
			// 人とページの権限のオブジェクト
			record Authority(int n, int m) {}
			Set<Authority> Authorities = new HashSet<>();
			// クエリ実行
			for (int i = 0; i < Q; i++) {

				
				// クエリタイプ
				int qType = scan.nextInt();
				switch (qType) {
				case 1:
					// ユーザーxにyページの権限付与
					Authorities.add(new Authority(scan.nextInt(), scan.nextInt()));
					break;
				case 2:
					// ユーザーxに全てのページの権限を付与
					int x = scan.nextInt();
					for (int j = 1; j <= M; j++) {
						Authorities.add(new Authority(x, j));
					}
					break;
				default:
					// qType == 3
					// ユーザーxに権限があるか答える
					System.out.println(
							Authorities.contains(new Authority(scan.nextInt(), scan.nextInt())) ?
							"Yes" : "No");
					break;
				}
			}
		}
	}
}
