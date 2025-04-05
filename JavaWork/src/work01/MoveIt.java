package work01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MoveIt {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int[] A = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				A[i] = scan.nextInt();
			}
			int[] W = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				W[i] = scan.nextInt();
			}
			
			//　荷物が入っている箱、重さのオブジェクトのリストを作成
			record BoxWeight (Integer a, Integer w) {}
			List<BoxWeight> BoxWeightList = new ArrayList<>();
			for (int i = 1; i <= N; i++) {
				BoxWeightList.add(new BoxWeight(A[i], W[i]));
			}
			
			int wSum = 0;	// 移動重量合計
			// それぞれの箱でフィルターし、入っている荷物を重さの昇順に並べる
			for (int i = 1; i <= N; i++) {		// 箱ループ
				int loopIndex = i;
				List<BoxWeight> BoxWeightListFilterOrder = BoxWeightList.stream()
						.filter(obj -> obj.a() == loopIndex)
						.sorted(Comparator.comparing(BoxWeight::w))
						.toList();
				// iの箱に荷物が入っていなければBoxWeightListFilterOrderのリストは空
				// 荷物が複数入っていればサイズが1よりも大きくなる。
				if (BoxWeightListFilterOrder.size() > 1) {
					// サイズ-1の数だけ軽さ上位の荷物をwSumに加算する。
					for (int j = 0; j < BoxWeightListFilterOrder.size() - 1; j++) {
						wSum += BoxWeightListFilterOrder.get(j).w();
					}
				}
			}
			System.out.println(wSum);
		}
	}
}
