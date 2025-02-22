package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BumbleBee2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			List<Integer> aList = new ArrayList<>();
			int N = scan.nextInt();
			for (int i = 0; i < N; i++) {
				aList.add(scan.nextInt());
			}
			
			int aListSize = aList.size();
			int matchCount = 0;
			for (int i = 0; i < aListSize - 1; i++) {	// 配列の後ろから2番目要素と最後の要素の比較で終了するので、index<aListSize - 1
				for (int j = i + 1; j < aListSize; j++) {
					if (aList.get(j).equals(aList.get(i))) {
						matchCount++;
						// 同じ数字を発見したらループを抜ける。（同じ数字が3つ以上含まれる場合に重複してカウントしないようにするため）
						break;			
					}
				}
			}
			System.out.println(matchCount);
		}

	}

}
