package work01;

import java.util.Scanner;

public class Tag {

// 移動後、同じ座標にいるかどうかで判定した場合
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			// 鬼
			int A = scan.nextInt();		//座標
			int V = scan.nextInt();		// 移動距離
			// 子供
			int B = scan.nextInt();
			int W = scan.nextInt();
			// 時間
			int T = scan.nextInt();		// 時間
			
			for (int i = 0; i < T; i++) {
				// どちらに進むか判定し、移動する。
				if (B - A > 0) {
					A += V;
					B += W;
				} else {
					A -= V;
					B -= W;
				}
				// 同じ座標になったか判定
				if (A == B) {
					System.out.println("YES");
					return;
				} 
			}
			
			System.out.println("NO");
		}
	}
}
