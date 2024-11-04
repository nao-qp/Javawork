package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartPhoneAddiction3 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			//バッテリー容量
			int N = scan.nextInt();
			
			//カフェに行く回数
			int M = scan.nextInt();
			
			//帰宅時間
			int T = scan.nextInt();
			
			scan.nextLine();
			
			List<Integer> at = new ArrayList<>();
			at.add(0);
			
			for (int i = 0; i < M; i ++) {
				at.add(scan.nextInt());
				at.add(scan.nextInt());
				scan.nextLine();
			}
			
			//帰宅時間を追加
			at.add(T);
			
//			for (int a : at) {
//				System.out.println(a);
//			}
			
			
			boolean charging = false;
			int battery = N;
			for (int i = 1; i < at.size(); i++) {
				if (charging) {
					battery += at.get(i) - at.get(i-1);
				} else
					battery -= at.get(i) - at.get(i-1);
				
				//バッテリーチェック
				if (battery > N) {
					battery = N;
				} else if (battery <= 0) {
					break;
				}
				
				//チャージフラグ反転
				charging = !charging;
			}
			
			if (battery > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		}

	}

}
