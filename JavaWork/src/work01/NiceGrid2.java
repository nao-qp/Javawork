package work01;

import java.util.Scanner;

public class NiceGrid2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		scan.close();

		//行列の大きさ
		int grid = 15;
		//グリッド行の配列
		String[] lines = new String[grid];
		//黒白黒白...基本形ではない箇所スタートインデックス
		int start = 0;
		
		//配列を半分つくる
		for (int row = 0; row <= grid / 2; row++) {
			//グリッドを行ごとに配列にする（1:black 0:white）
			StringBuilder line = new StringBuilder();
				//インデックス偶数行
				if (row % 2 == 0) {
					for (int col = 0; col < grid; col++) {
						//中央が黒
						if (col >= start && col <= grid - start - 1) {
							line.append("1");
						} else {
							//インデックス偶数black 奇数white
							baseGrid(col, line);
							
						}
					}
				} else {
				//インデックス奇数行
					for (int col = 0; col < grid; col++) {
						//中央が白
						if (col >= start && col <= grid - start - 1) {
							line.append("0");
						} else {
							//インデックス偶数black 奇数white
							baseGrid(col, line);
							
						}
					}
				}
				
			
			start++;
			lines[row] = line.toString();
		}
			
		//残り半分の配列
		for (int row = grid / 2 + 1; row < grid; row++) {
			lines[row] = lines[grid - row -1];
		}

		//指定した行列の文字列を抜き出して判定
		if (lines[r -1].substring(c -1, c).equals("1")) {
			System.out.println("black");
		} else {
			System.out.println("white");
		}
		
	}

	
	//インデックス偶数black 奇数whiteを作成
	//黒白黒白...基本形を作成
	private static StringBuilder baseGrid(int col, StringBuilder line) {
		if (col % 2 == 0) {
			//黒
			line.append("1");
		} else {
			//白
			line.append("0");
		}
		return line;
	}
	
}
