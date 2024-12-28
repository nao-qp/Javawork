package work01;

import java.util.Scanner;

public class VerticalWriting {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			scan.nextLine();
			
			String[] S = new String[3];
			int M = 0;			//S[i]の最大値
			for (int i = 0; i < N; i++) {
				S[i] = scan.nextLine();
				
				//
				System.out.println("S[" + i + "]=" + S[i]);
				
				if (M < S[i].length()) {
					M = S[i].length(); //最大値更新
				}
			}
			
			//
			System.out.println("N=" + N);
			System.out.println("M=" + M);
			
			
			String[] T = new String[M];
			for (int i = 0; i < N; i++) {
				//jをS[i]の文字列の最大値分ループ
				for (int j = 0; j < M; j++) {
					//jがS[i]の文字列の長さより少なかったら、T[j]に文字を追加
					if (j < S[i].length()) {
						//1つ前のT[j]のi番目が空欄だったら、1つ前のT[j]に*を入れてから連結
						if (j != 0 && T[j - 2] == "") {
							T[j - 1] = "*";
						}
						char SChar = S[N - i].charAt(j - 1);
						T[j] = T[j] + SChar;	//文字を連結
					} else {
					//jがS[i]の文字列以上であれば空欄
					T[j] = T[j]  + "";
					}
					
					//
					System.out.println("T[" + j + "]=" + T[j]);
				}
			}
			
			//出力
			for (int j = 0; j < M; j++) {
				System.out.println(T[j]);
			}
		}
	}
}
