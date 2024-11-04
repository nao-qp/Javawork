package work01;

import java.util.Scanner;

public class JobAssignment2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			scan.nextLine();
		}
		
		scan.close();
		
		int minA1, minA2, minB1, minB2;
		minA1 = minA2 = minB1 = minB2 = 100000;
		int aMinIndex = 0;	//Aの仕事が一番早い人のインデックス
		int bMinIndex = 0;	//Bの仕事が一番早い人のインデックス
		for (int k = 0; k < n; k++) {
			//Aの仕事の最小値、二番目の最小値、最小値のインデックス設定
			if (a[k] <= minA1) {
				minA2 = minA1;
				minA1 = a[k];
				aMinIndex = k;
			} else if (a[k] <= minA2) {
				minA2 = a[k];
			}
			//B
			if (b[k] <= minB1) {
				minB2 = minB1;
				minB1 = b[k];
				bMinIndex = k;
			} else if (b[k] <= minB2) {
				minB2 = b[k];
			}
		}
		//最小値が同じ人だった場合、minA1とminB2、minA2とminB1の組み合わせの時間と比較
		//別の人だった場合、A,Bの仕事の時間が長い方を設定
		int time = 0;
		if (aMinIndex == bMinIndex) {
			int abTime = Math.min(Math.max(minA1, minB2), Math.max(minA2, minB1));
			time = Math.min((minA1 + minB1), abTime);
		} else {
			time = Math.max(minA1, minB1);
		}
		
		System.out.println(time);
	}

}
