package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiningUp2 {

	/**
	 * 問題
	 * https://atcoder.jp/contests/abc337/tasks/abc337_c
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			
			// 並び順情報のリストを作成する
			List<Integer> linings = new ArrayList<>();
			int lining = 0;
			linings.add(lining);	// Indexを1オリジンにするために調整
			for (int i = 0; i < N; i++) {
				lining = scan.nextInt();
				linings.add(lining);
			}
			
			// 出力用のリストを作成する
			List<Integer> liningUpList = new ArrayList<>();
			int firstPerson = linings.indexOf(-1);	// 先頭の人
			liningUpList.add(firstPerson);			// 先頭の人が列に並ぶ
			int liningUpPerson = firstPerson;		// 先頭の人はすでに並んだ人
			for (int i = 0; i < N - 1; i++) {
				liningUpPerson = linings.indexOf(liningUpPerson);	// すでに並んだ人のIndexが次に並ぶ人
				liningUpList.add(liningUpPerson);	// 列に並ぶ
			}
			
			// 出力
			liningUpList.forEach(value -> {
				System.out.print(liningUpList.indexOf(value) == N - 1 ? value : value + " ");
			});
		}
	}
}
