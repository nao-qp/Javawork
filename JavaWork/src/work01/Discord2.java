package work01;

import java.util.Scanner;

public class Discord2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		scan.nextLine();	//空行読み飛ばし
		
		//M回ごとの並び順リスト読込
		int[][] mList = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mList[i][j] = scan.nextInt();
			}
			scan.nextLine();	//空行読み飛ばし
		}
		scan.close();

		
		/*
		4人
		1 2 3 4
		12,13,14
		23,24
		34
		
		2回撮影
		mList[0] = {1,2,3,4}
		mList[1] = {3,4,1,2}
		*/
		//n人の組み合わせをループして、mList[m][n]に入っている数値と比較
		int count = 0;	//組み合わせが見つからなかった数
		for (int i = 1; i < n; i++) {		//1～3
			for (int j = i + 1; j < n + 1; j++) {		//2～4
				
				//比較
				boolean found = false;
				for (int k = 0; k < m; k++) {	//m行
					for (int l = 0; l < n - 1; l++) {	//n列
						//mList[0]={1,2,3,4}	1回目撮影
						//12,23,34と比較
						if ((mList[k][l] == i && mList[k][l + 1] == j)
								|| (mList[k][l] == j && mList[k][l + 1] == i)) {
							found = true;
						}
					}
				}
				if (!found) {
					count++;
				}
				
			}
		}
		
		System.out.println(count);
		
	}

}
