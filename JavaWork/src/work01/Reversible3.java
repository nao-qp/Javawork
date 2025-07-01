package work01;

import java.util.HashSet;
import java.util.Scanner;

public class Reversible3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			scan.nextLine();	// 空行読み飛ばし
			
			// HashSetだと辞書順にソートされているので、内部的に重複チェックと二分木検索をしてくれるので速い
			HashSet<String> sSet = new HashSet<>();
			int count = 0;
			for (int i = 0; i < N; i++) {
				String s = scan.nextLine();
				if (!(sSet.contains(s) || sSet.contains(new StringBuilder(s).reverse().toString()))) {
					// sSetに読み込んだ文字列またはそれを反転した文字列が含まれていなければsSetに追加しcountを増やす
					sSet.add(s);
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
