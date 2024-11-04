package work01;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SecondHighestMountain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		scan.nextLine();
		
		Map<Integer, String> mountainMap = new TreeMap<>(Comparator.reverseOrder());
		for (int i = 0; i < N; i++) {
			String[] sScan = scan.nextLine().split("\\s+");
			mountainMap.put(Integer.parseInt(sScan[1]), sScan[0]);
		}
		scan.close();
		
		
//		final int[] count = {0};		//ラムダ式内でカウントを変更するため、finalで配列として定義。
//		mountainMap.forEach((key, value) -> {
//			if (count[0] == 1) {		//二番目
//				System.out.println(value);
//			}
//			count[0] += 1;
//		});
		
		//ループ処理を途中で抜けるようにするには。。。
//		int count = 0;
//		for (Map.Entry<Integer, String> entry : mountainMap.entrySet()) {
//			if (count == 1) {
//				System.out.println(entry.getValue());
//			}
//			count += 1;
//		}
		
		//Streamを使う
		mountainMap.entrySet().stream()
        .skip(1) // 一番目の要素をスキップ
        .findFirst() // 二番目の要素を取得
        .ifPresent(entry -> System.out.println(entry.getValue()));
		
	}

}
