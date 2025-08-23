package work01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 問題
 * https://atcoder.jp/contests/abc315/tasks/abc315_c
 * 種類ごとのmapを作成して、
 * 種類ごとに同じ味同士の組み合わせでの最大値と、
 * 違う味同士の組み合わせでの最大値を比較して、大きい方が最大満足度となる
 * 違う味同士の組み合わせは、種類ごとの最大値を組み合わせる
 */
public class Flavors2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			// 種類ごとのMap
			Map<Integer, List<Integer>> flavorMap = new HashMap<>();
			for (int i = 0; i < N; i++) {
				int f = scan.nextInt();		// 味
				int s = scan.nextInt();		// 美味しさ
				// キー(f)を渡してキーがflavorMapになければ、リストオブジェクトを作成して値を(s)を追加する
				flavorMap.computeIfAbsent(f, k -> new ArrayList<>()).add(s);
			}
			
			int maxS = 0;	// 組み合わせたおいしさの最大値
			List<Integer> maxList = new ArrayList<>();		// それぞれの味の最大値のリスト
			for (List<Integer> list : flavorMap.values()) {
				// 味のマップごとにおいしい順に並べ替える
				Collections.sort(list, Collections.reverseOrder());
				
				// 同じ味同士の組み合わせの最大値を求める
				if (list.size() > 1 && list.get(0) + list.get(1) / 2 > maxS) {
					maxS = list.get(0) + list.get(1) / 2;	// 同じ味なので2つ目は1/2
				}
				
				// それぞれの味の最大値のリストを作成する
				maxList.add(list.get(0));
			}

			// 違う味の組み合わせの最大値を求める
			// おいしい順に並べ替える
			Collections.sort(maxList, Collections.reverseOrder());
			System.out.println(Math.max(maxS, maxList.get(0) + maxList.get(1)));
		}
	}
}
