package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//問題
//https://atcoder.jp/contests/abc303/tasks/abc303_c

public class Dash {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();		// 移動回数
			int M = scan.nextInt();		// アイテム個数
			int H = scan.nextInt();		// 高橋くん体力
			int K = scan.nextInt();		// アイテム回復後体力
			scan.nextLine();	// 空行読み飛ばし
			String S = scan.nextLine();		// 移動方法
			
			// 回復薬の座標リスト
			List<Point> mPoints = new ArrayList<>();
			for (int i = 0; i < M; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				mPoints.add(new Point(x, y));
			}
			// 高橋くん座標
			Point tPoint = new Point(0, 0);
			// 移動
			for (int i = 0; i < N; i++) {
				// 高橋くんの座標を更新
				tPoint.tMove(S.charAt(i));
				// 体力減少
				H--;
				// 負数になったら終了
				if (H < 0) {
					System.out.print("No");
					return;
				}
				// アイテムの座標リストと比較
				for(int j = 0; j < mPoints.size(); j++) {
					// アイテムがある場合
					if (tPoint.getX() == mPoints.get(j).getX() && tPoint.getY() == mPoints.get(j).getY()) {
						// 高橋くん体力とアイテムの回復後体力を比較
						if (H < K) {
							H = K;
							// 使用したアイテムを削除
							mPoints.remove(j);
						}
					}
				}
			}
			// 負数にならずに最後まで移動
			System.out.print("Yes");
		}
	}
}

// 座標クラス
class Point {
	private int x = 0;
	private int y = 0;
	
	public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	/**
	 * 高橋くん座標更新
	 * @param S 移動文字(RLUD)
	 */
	public void tMove(char S) {
		switch (S) {
		case 'R':
			this.setXMove(1);
			break;
		case 'L':
			this.setXMove(-1);
			break;
		case 'U':
			this.setYMove(1);
			break;
		case 'D':
			this.setYMove(-1);
			break;
		}
	}
	
	/**
	 * x軸移動
	 * @param move 移動する値(1 or -1)
	 */
	public void setXMove(int move) {
		this.x += move;
	}
	
	/**
	 * y軸移動
	 * @param move 移動する値(1 or -1)
	 */
	public void setYMove(int move) {
		this.y += move;
	}
	
}
