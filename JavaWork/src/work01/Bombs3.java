package work01;

import java.util.Scanner;

public class Bombs3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int R = scan.nextInt();		//縦
		int C = scan.nextInt();		//横
		scan.nextLine();
		
		String[] B = new String[R];
		for (int i = 0; i < R; i++) {
			B[i] = scan.nextLine();
		}
		
		scan.close();
		
		//先頭から爆弾の影響有無を見ていく
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				//爆弾影響フラグ
				boolean bombed = false;
				//影響がある爆弾があるか見ていく
				for (int i2 = 0; i2 < R; i2++) {
					for (int j2 = 0; j2 < C; j2++) {
						//爆弾判定
						if (Character.isDigit(B[i2].charAt(j2))) {
							//爆弾
							int p = B[i2].charAt(j2) - '0';
							if (Math.abs(i2- i) + Math.abs(j2 -j) <= p) {
//								System.out.print("(" + i2 + "," + j2 + ")");
								//爆弾の影響があったので、.を出力
								System.out.print(".");
								bombed = true;
								break;
							}
						}
					}
					if (bombed) {
						break;
					}
				}
				
				//爆弾の影響がなかった場合は、元の値を出力
				if (!bombed) {
					System.out.print(B[i].charAt(j));
				}
			}
			//改行
			System.out.println();
		}
	}
}
