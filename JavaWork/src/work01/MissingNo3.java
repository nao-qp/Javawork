package work01;

import java.util.Scanner;

public class MissingNo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		//最小値、最大値、合計を求める
		int min = 0;
		int max = 0;
		int sum = 0;
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			//最小値
			if (i == 0 || a[i] < min) {
				min = a[i];
			}
			//最大値
			if (i == 0 || a[i] > max) {
				max = a[i];
			}
			//合計
			sum += a[i];
		}
		
		scan.close();
		
		
		
		
		
		
		//連続する数値の合計の求め方
		
		/*
		//解1
		//minからmaxまで順番に足していく
		 
		//n+1個の数値の合計を求める（期待される合計値）
		int sumExpect = 0;
		for (int i = min; i <= max; i++) {
			sumExpect += i;
		}
		*/
		
		
		//解2
		//IntStreamを使う
		//int sumExpect = IntStream.rangeClosed(min, max).sum();
		
		//解3
		//合計の仕方を工夫する(1から100の合計を簡単に計算するガウスの方法)
		int sumExpect = (min + max) * (n + 1) / 2;
		
		

		//期待される合計値とaの配列の数値の合計の差分が抜けた数字
		System.out.println(sumExpect - sum);
	}

}
