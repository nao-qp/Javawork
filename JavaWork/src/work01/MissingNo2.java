package work01;

import java.util.Scanner;

public class MissingNo2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int min = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			if (i == 0 || a[i] < min) {
				//最小値更新
				min = a[i];
			}
		}
		
		scan.close();
		//boolean型の配列をn+1個用意し、読み込んだ数字の配列-minの数値をインデックスにして、trueを設定していく。
		boolean[] exists = new boolean[n + 1];
		for (int i = 0; i < n; i++) {
			exists[a[i] - min] = true;
		}
		
		//n+1回ループし、
		for (int i = 0; i < n + 1; i++) {
			//tureが埋まらなかったインデックス+minの数値が抜けている数字
			if (!exists[i]) {
				System.out.println(i + min);
			}
		}

	}

}
