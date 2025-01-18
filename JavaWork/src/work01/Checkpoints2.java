package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// クラスを使用した方法
// クラスに距離を求めるメソッドを含める
public class Checkpoints2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			
			List<Coord> students= new ArrayList<>();
			for (int i = 0; i < N; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				students.add(new Coord(x, y));
			}
			List<Coord> points= new ArrayList<>();
			for (int i = 0; i < M; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				points.add(new Coord(x, y));
			}
			
			for (int i = 0; i < N; i++) {
				// 1つ目のポイントまでの距離とインデックスを設定
				// 初期値
				int minDistance = students.get(i).getDistance(points.get(0));
				int minMIndex = 0;
				for (int j = 1; j < M; j++) {
						// 配列1つ目は初期値なのでインデックス1から調べる
					if (students.get(i).getDistance(points.get(j)) < minDistance) {
						minDistance = students.get(i).getDistance(points.get(j));
						minMIndex = j;
					}
				}
				System.out.println(minMIndex + 1);
			}
			
		}
	}
}

class Coord {
	private final int x;
	private final int y;
	
	public Coord(int x, int y) {
		this.x = x;
		this .y = y;
	}
	
	/**
	 * 距離取得メソッド
	 * @param target
	 * @return　インスタンスに対して、targetとのマンハッタン距離
	 */
	public int getDistance(Coord target) {
		int distance = Math.abs(x - target.x) + Math.abs(y - target.y);
		return distance;
	}
}