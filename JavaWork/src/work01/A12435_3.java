package work01;

import java.util.Arrays;
import java.util.Scanner;

public class A12435_3 {

	public static void main(String[] args) {
		try(var scan = new Scanner(System.in)) {
			int[] suspected = new int[5];
			for (int i = 0; i < 5; i++) {
				suspected[i] = scan.nextInt();
			}
			
			if (canBe12345(suspected))  {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
	
	/**
	 * 入力値の配列が並べ替えたパターンに一致するか調べる
	 * @param suspected
	 * @return
	 */
	public static boolean canBe12345(int[] suspected) {
		// 並べ替えのパターン配列
		final int[][] arrays = {
			{2, 1, 3, 4, 5},
			{1, 3, 2, 4, 5},
			{1, 2, 4, 3, 5},
			{1, 2, 3, 5, 4}};
		
		for (int[] array: arrays) {
			if (Arrays.equals(suspected, array)) {
				return true;
			} 
		}
		return false;
	}
}
