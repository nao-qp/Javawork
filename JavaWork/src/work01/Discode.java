package work01;

import java.util.Scanner;

public class Discode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		scan.nextLine();	//空行読み飛ばし
		
		//M回ごとの並び順リスト読込
		int[][] miList = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				miList[i][j] = scan.nextInt();
			}
			scan.nextLine();	//空行読み飛ばし
		}
		scan.close();
		
		
		//N人の配列の組み合わせリスト
		//List<List<Integer>> nCombiList = new ArrayList<>();
		
		int[][] nCombiList = new int[6][2];
		int nIndex = 0;
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n - i; j++) {
				nCombiList[nIndex][0] = i;
				nCombiList[nIndex][1] = i + j;
				nIndex++;
			}
		}
		
		//M回ごとの並び順の組み合わせリスト
		int[][] mCombiList = new int[12][2];
		int mIndex = 0;
		
		try {
			for (int k = 0; k < m; k++) {
				for (int i = 0; i < 6 ; i++) {
					for (int j = 1; j <= n - i; j++) {
						mCombiList[mIndex][0] = miList[i][i];
						mCombiList[mIndex][1] = miList[i][i + j];
						mIndex++;
						
						System.out.println("i=" + i + ", i+j=" + (i + j));
						System.out.println("miList[i][i]=" + miList[i][i]);
						System.out.println("miList[i][i + j]" + miList[i][i + j]);
					}
				}
			}
		} catch (Exception e) {
			
		}
		
		
		
		/*
		for (int i = 0; i < 6; i ++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(nCombiList[i][j]);
			}
			
		}
		*/
		
		/*
		System.out.println(n);
		System.out.println(m);
		for (int i = 0; i < m; i ++) {
			for (int j = 0; j < n; j++) {
				System.out.println(miList[i][j]);
			}
			
		}
		*/
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(mCombiList[i][j]);
			}
			
		}
		
		
			
		
		

	}

}
