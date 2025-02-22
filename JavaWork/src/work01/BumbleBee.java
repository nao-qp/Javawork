package work01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BumbleBee {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Set<Integer> aSet = new HashSet<>();
			int N = scan.nextInt();
			int count = 0;// Aの入力数
			// 重複なしのAのリストを作成
			for (int i = 0; i < N; i++) {
				aSet.add(scan.nextInt());
				count++;
			}
			
			// Aの入力数とAの重複無しの数の差分が受粉した花の数
			System.out.println(count - aSet.size());
			
		}
	}
}
