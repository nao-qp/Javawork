package work01;

import java.util.Scanner;

public class SmartPhoneAddiction2 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			//バッテリー容量
			int N = scan.nextInt();
			
			//カフェに行く回数
			int M = scan.nextInt();
			
			//帰宅時間
			int T = scan.nextInt();
			
			scan.nextLine();
			
			//バッテリー残量
			int current = N;
			int lasttime = 0;
			for(int i = 0; i < M; i++) {
				int A = scan.nextInt();
				int B = scan.nextInt();
				
				//バッテリー消費
				current -= A -lasttime;
				//バッテリー0チェック
				if (current <= 0) break;
				
				//バッテリー充電
				//最大バッテリー容量か、カフェ滞在時間分足したバッテリー残量の小さい方を設定
				current = Math.min(N, current + B - A);
				
				lasttime = B;
			}
			
			//帰宅時間まで（バッテリー消費）
			current -= T - lasttime;
			
			if (current > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
