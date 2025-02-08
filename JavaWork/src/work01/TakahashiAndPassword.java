package work01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TakahashiAndPassword {

	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in)) {
			String s = scn.nextLine();
			int k = scn.nextInt();
			
			if (k > s.length()) {
				// s文字列の長さがパスワードの文字の長さよりも大きかったら0
				System.out.println(0);
				return;
			} else {
				Set<String> passList = new HashSet<>();
				// 先頭から順番にk文字切り取ってSetリストに入れていく
				for (int i = 0; i <= s.length() - k; i++) {
					String subS = s.substring(i, i + k - 1);
					passList.add(subS);
				}
				// パスワードリストの要素数を出力
				System.out.println(passList.size());
			}
		}
	}
}
