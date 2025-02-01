package work01;

import java.util.Scanner;

public class Tag2 {

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
			
			// 鬼の速度の方が遅い場合、追いつくことはないのでNO
			if (V <= W) {
				System.out.println("NO");
				return;
			}
			// 最初の距離の差（子 - 鬼）
			long distance = Math.abs(B - A);
			// 移動スピードの差（鬼 - 子）
			long speedDif = V - W;
			// T秒後の詰められた距離
			
			// もともとの距離を移動速度*T秒した距離が超えれば追いつく
			if (distance <= speedDif * T) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
