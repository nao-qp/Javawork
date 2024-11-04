package work01;

import java.util.Arrays;
import java.util.Scanner;

public class AchieveTheGoal {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {

			int N = scan.nextInt();		//科目数
			int K = scan.nextInt();		//各テスト満点
			int M = scan.nextInt();		//目標平均点

//			
//			int[] A = new int[N];
//			
//			for (int i = 0; i < N - 1; i++) {
//				A[i] = scan.nextInt();
//			}
//			
//			//平均点N科目の合計から完了しているテストの合計値を引いて
//			//あと何点必要か算出する
//			int valueToGoal = M * N - Arrays.stream(A).sum();
			
////////各テストの点を1行で読み込んで、合計値を出して計算する方法↓
			
			//1行読み込んで空白で区切って、stream型のstreamにする。
			//stream型のstream各要素をIntegerクラスのparseIntでInteger型に変換
			//合計する。
			scan.nextLine();
			int total = Arrays.stream(scan.nextLine().split(" "))
					.mapToInt(Integer::parseInt)
					.sum();
			
			//必要な点数が0点以下なら0点を設定
			int valueToGoal = Math.max(M * N -total, 0);
			
			//必要な点数がK点満点以下なら必要な点数を出力
			if (valueToGoal <= K) {
				System.out.println(valueToGoal);
			} else {
				System.out.println(-1);
			}
		}
	}

}
