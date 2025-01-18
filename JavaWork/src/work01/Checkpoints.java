package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Checkpoints {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			
			record Point(int x, int y) {}
			List<Point> nPointList = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				Point nPoint = new Point(x, y);
				nPointList.add(nPoint);
			}
			List<Point> mPointList = new ArrayList<>();
			for (int j = 0; j < M; j++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				Point mPoint = new Point(x, y);
				mPointList.add(mPoint);
			}
			
			// 学生NiのそれぞれのMポイントまでの距離を求める
			for (Point nPoint: nPointList) {
				int minDistance = 100000000 * 2; // マンハッタン距離の最大値
				int minMIndex = 0;
				for (Point yPoint: mPointList) {
					int distance = Math.abs(nPoint.x - yPoint.x) + Math.abs(nPoint.y - yPoint.y);
					if (distance < minDistance) {
						minDistance = distance;
						minMIndex = mPointList.indexOf(yPoint);
					}
				}
				// マンハッタン距離最小値のチェックポイントMのインデックス+1出力
				System.out.println(minMIndex + 1);
			}
		}
	}
}
