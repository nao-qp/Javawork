package work01;

import java.util.Scanner;

public class NiceGrid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		
		
		//グリッドを行ごとに配列にする（1:black 0:white）
		String[] lines = new String[15];
		
		//グリッドの中央の行まで設定
		lines[0] = "111111111111111";
		lines[1] = "100000000000001";
		lines[2] = "101111111111101";
		lines[3] = "101000000000101";
		lines[4] = "101011111110101";
		lines[5] = "101010000010101";
		lines[6] = "101010111010101";
		lines[7] = "101010101010101";
		
		//残り半分を上で設定した配列を元に設定
		for (int i = 8; i < 15; i++) {
			lines[i] = lines[14 - i];
		}

		//指定した行列の文字列を抜き出して判定
		System.out.println(lines[r -1].substring(c -1, c));
		if (lines[r -1].substring(c -1, c).equals("1")) {
			System.out.println("black");
		} else {
			System.out.println("white");
		}
		
	}

}
