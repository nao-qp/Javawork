package work01;

import java.util.Scanner;

public class Bombs2 {
//爆弾を見つけたら、端から影響があるかどうかみていく方法。
//マスは1行単位で読み込み。
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int R = scan.nextInt();		//縦
		int C = scan.nextInt();		//横
		scan.nextLine();
		
		String[] B = new String[R];
		
		//1行ずつ配列に入れる
		for (int i = 0; i < R; i++) {
				B[i] = scan.nextLine();
		}
		
		scan.close();
		
		//爆弾影響有無の２次元配列
		boolean[][] bombed = new boolean[R][C];
		
		//爆弾を探す
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				//爆弾判定
				if (Character.isDigit(B[i].charAt(j))) {
					//数値なら爆弾
					int p = B[i].charAt(j) - '0';
					//先頭から見ていって影響範囲を更新
					for (int i2 = 0; i2 < R; i2++) {
						for (int j2 = 0; j2 < C; j2++) {
							if (Math.abs(i2 - i) + Math.abs(j2 -j) <= p) {
								bombed[i2][j2] = true;
							}
						}
					}
					
				}
			}
		}
		
		//結果出力
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (bombed[i][j]) {
					System.out.print(".");
				} else {
					System.out.print(B[i].charAt(j));
				}
			}
			//改行
			System.out.println();
		}
		
	}

}
