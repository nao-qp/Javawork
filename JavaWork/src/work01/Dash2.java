package work01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dash2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();		// 移動回数
			int M = scan.nextInt();		// アイテム個数
			int H = scan.nextInt();		// 高橋くん体力
			int K = scan.nextInt();		// アイテム回復後体力
			scan.nextLine();	// 空行読み飛ばし
			String S = scan.nextLine();		// 移動方法
			
			// 回復アイテム座標オブジェクト
			record Coord(int x, int y) {}
			// アイテムのSetを作成する
			Set<Coord> items = new HashSet<>();
 			for (int i = 0; i < M; i++) {
 				Coord item = new Coord(scan.nextInt(), scan.nextInt());
 				items.add(item);
 			}
			
 			// 高橋くん座標
			int x = 0;
			int y = 0;
			// 結果
			boolean result = true;
			// 移動
			for (int i = 0; i < N; i++) {
				switch (S.charAt(i)) {
					case 'R' -> x++;
					case 'L' -> x--;
					case 'U' -> y++;
					default -> y--;
				}
				
				// 1体力を消耗して負数かチェック
				if (--H < 0) {
					result = false;
					break;
				}
				// 移動後の座標にアイテムがあり、H<Kであればアイテムを使用し回復
				// items.remove(new Coord(x, y))は削除できればture、同じものがなければスルーでfalseを返す
				if  (H < K && items.remove(new Coord(x, y))) {
					H = K;
				}
			}
			// 出力
			System.out.println(result ? "Yes" : "No");
		}
	}
}
