package work01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Bombs {
//爆弾を見つけたら、端から影響があるかどうかみていく方法。
//座標をrecord型オブジェクトBoardに設定し、BoardをキーとしたMapを作成
//結果用のMapをコピーし、爆弾の影響を更新。
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int R = scan.nextInt();		//縦
		int C = scan.nextInt();		//横
		scan.nextLine();
		
		record Board(int r, int c) {}
		//座標と状態Map
		Map<Board, String> boardMap = new LinkedHashMap<>();
		//結果
		Map<Board, String> boardResultMap = new LinkedHashMap<>();
		
		//縦ループ
		for (int i = 0; i < R; i++) {
			String line = scan.nextLine();
			//横ループ
			for (int j = 0; j < C; j++) {
				//座標
				Board board = new Board(i + 1, j + 1);
				boardMap.put(board, String.valueOf(line.charAt(j)));
			}
		}
		
		scan.close();
		
		//結果用Mapにコピー
		boardResultMap.putAll(boardMap);
		
		
		for (Board board: boardMap.keySet()) {
			//爆弾の場合
			if (!(boardMap.get(board).equals(".") || boardMap.get(board).equals("#"))) {
				int bomb = Integer.parseInt(boardMap.get(board));
				//影響があるか端から見ていく
				for (Board boardCheck: boardMap.keySet()) {
					//影響判定
					if (Math.abs(board.r - boardCheck.r) + Math.abs(board.c - boardCheck.c) <= bomb) {
						//影響がある
						boardResultMap.put(boardCheck, ".");
					} 
				}
			}
		}
		
		//結果出力
		for (Board board: boardResultMap.keySet()) {
			
			System.out.print(boardResultMap.get(board));

			if (board.c == C) {
				System.out.println();
			}
		}
	}

}
