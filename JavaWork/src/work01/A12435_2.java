package work01;

import java.util.Arrays;
import java.util.Scanner;

public class A12435_2 {

// 汎用的なパターンの処理
	public static void main(String[] args) {
		try(var scan = new Scanner(System.in)) {
			int[] suspected = new int[5];
			for (int i = 0; i < 5; i++) {
				suspected[i] = scan.nextInt();
			}
			
			for (int i = 0; i < suspected.length - 1; i++) {
				// 並べ替える配列用に配列をコピー
				int[] sorted = Arrays.copyOf(suspected, suspected.length);
				sorted[i] = suspected[i + 1];
				sorted[i + 1] = suspected[i];
				
				if (isAscending(sorted)) {
					System.out.println("Yes");
					return;
				}
			}
			System.out.println("No");
		}
	}
	
	/**
	 * 受け取った配列が昇順かどうか調べる
	 * @param suspected
	 * @return boolean
	 */
	public static boolean isAscending(int[] suspected) {
		for (int i = 0; i < suspected.length - 1; i++) {
			if (suspected[i] >= suspected[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
