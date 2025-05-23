package work01;

import java.util.Scanner;

public class Minesweeper {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			int H = scan.nextInt();
			int W = scan.nextInt();
			
			//マスにセット.と#をセットする
			
			//各マスを順番に四方の爆弾の数を数えて出力する
			
							
		
			
			
		}
				
	}
 			
	

	

}

class Field {
	private final int row;
	private final int column;
	private final char[][] S;
	
	//コンストラクタ
	Field (int row, int column) {
		this.row = row;
		this.column = column;
		char S[][] = new char[row][];
	}
	
	//マスにセット.と#をセットするメソッド
	void setRow(int h, String line) {
		if (line.length() != column) {
			throw new IllegalArgumentException("入力の長さは%dの文字列にしてください".formatted(column));
		}
		S[h] = line.toCharArray();
	}

	//マスが#かどうかbooleanで返すメソッド
	boolean existsBombs (int h, int w) {
		if (h <= 0 || row <= h || w <= 0 || column <= w) {
			return false;
		}
	
	//マスに爆弾の数を設定する
	int countNeighberingBombs
	
		return true;
	}
	
	
 }
