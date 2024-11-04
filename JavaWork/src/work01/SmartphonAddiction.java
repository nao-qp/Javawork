package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartphonAddiction {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//バッテリー残量
		int N = scan.nextInt();
		int maxN = N;
		
		//カフェに行く回数
		int M = scan.nextInt();
		
		//帰宅時間
		int T = scan.nextInt();
		
		scan.nextLine();
		
		//カフェ滞在時間
		record CafeTime(int A, int B) {}
		List<CafeTime> cafeTimes = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			cafeTimes.add(new CafeTime(scan.nextInt(), scan.nextInt()));
			scan.nextLine();
		}
		scan.close();
		
		int time = 0;
		for(int i = 0; i < M; i++) {
			//バッテリー消費
			N -= (cafeTimes.get(i).A - time);
			//バッテリー0チェック
			if (isBatteryZero(N)) {
				System.out.println("No");
				return;
			}
			
			//バッテリー充電
			N += (cafeTimes.get(i).B - cafeTimes.get(i).A);
			//バッテリー容量以上になった場合は、バッテリ－残量をバッテリー容量とする。
			if (N > maxN) {
				N = maxN;
			}
			
			//時間を更新
			time = cafeTimes.get(i).B;
			
			//帰宅時間までの消費
			if (i == M - 1) {
				N -= (T - cafeTimes.get(i).B);
				//バッテリー0チェック
				if (isBatteryZero(N)) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
	
	public static boolean isBatteryZero(int n) {
		if (n <= 0) {
			return true;
		} else {
			return false;
		}
		
	}

}
