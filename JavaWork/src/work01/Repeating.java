package work01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Repeating {
	// 連想配列
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			// keyに読み込んだ数字、valueにインデックス(1オリジン)のMap
			// valueはその数字の最大インデックス
			Map<Integer, Integer> Amap = new HashMap<>();
			
			// 数字を読み込んでMapに格納し、keyがなければ-1を出力、keyがあった場合はインデックスを出力
			for (int i = 1; i <= N; i++) {
				Integer A = scan.nextInt();
				int outPut = Amap.getOrDefault(A, -1);	// キーAが見つからなかったらデフォルトで-1を取得
				System.out.print(outPut + " ");
				// その数字の最大インデックスを更新。
				Amap.put(A, i);
			}
		}
	}
}
