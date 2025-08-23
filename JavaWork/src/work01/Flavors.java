package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 問題
 * https://atcoder.jp/contests/abc315/tasks/abc315_c
 * 一番おいしい組み合わせは一番おいしいアイスと二番目においしいアイスの組み合わせ
 * 二番目においしいアイスとは、違う種類のアイスと、同じ種類のアイス(おいしさ1/2)のリスト(一番おいしいアイスは除く)の中で一番おいしいアイス
 * おいしさ順のアイスリストを作成する
 * 一番おいしいアイスを除いたリストを作成する
 * そのアイスリストに対して一番おいしいアイスと同じ種類のアイスのおいしさを1/2にする
 * そのリストを再度おいしさ順に並べ替えをする
 * その中で一番おいしいアイスが二番目においしいアイスとなる
 */
public class Flavors {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			record Ice(Integer f, Integer s) {}
			List<Ice> iceList = new ArrayList<>();
			
			for (int i = 0; i < N; i++) {
				Ice ice = new Ice(scan.nextInt(), scan.nextInt());
				iceList.add(ice);
			}
			
			// 降順(おいしい順)に並べ替え
			iceList.sort((e1, e2) -> e2.s.compareTo(e1.s));
			Integer maxF = iceList.get(0).f();	// 一番おいしいアイスの種類
			Integer maxS = iceList.get(0).s();	// 一番おいしいアイスのおいしさ
			// 一番おいしいアイスをリストから削除する
			iceList.remove(0);
			
			// 一番おいしいアイスの種類と同じものは、おいしさを1/2にしておいしい順に並べ替える
			List<Ice> sortedIceList = iceList.stream()
					.map(ice -> {
						if (ice.f.equals(maxF)) {
							return new Ice(ice.f(), ice.s() / 2);
						} else {
							return ice;
						}
					})
					.sorted((e1, e2) -> e2.s().compareTo(e1.s()))
					.toList();
			
			// 並べ替えたリストの先頭が二番目においしいアイスとなる
			// 一番おいしいアイスとの合計を出力
			System.out.print(maxS + sortedIceList.get(0).s());
		}
	}
}
