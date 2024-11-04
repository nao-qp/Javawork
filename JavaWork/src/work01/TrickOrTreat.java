package work01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrickOrTreat {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {

			int N = scan.nextInt();		//人数
			int K = scan.nextInt();		//お菓子の種類
			scan.nextLine();
			
			//すぬけ君Mapオブジェクトを作成する
			Map<Integer, Boolean> sunukeMap = new HashMap<>();
			for (int i = 0; i < N; i++) {
				sunukeMap.put(i, false);		//初期値：お菓子を持っていない（false）
			}
			
//			System.out.println("N=" + N + ", K=" + K);
			
			
			//お菓子の種類ループ
			for (int i = 0; i < K; i++) {
				//そのお菓子を持っている人数
				int d = scan.nextInt();
				scan.nextLine();
				
//				System.out.println(d + "人");
				
				//そのお菓子を持っている人のループ
				for (int j = 0; j < d; j++) {
					int A = scan.nextInt();
					sunukeMap.put(A - 1, true);
					
//					System.out.println(A);
				}
				scan.nextLine();
			}
			
			//お菓子を持っていない人数をカウント
			System.out.println(sunukeMap.values().stream().filter(value -> !value).count());
			
//			for (boolean isHave: sunukeMap.values()) {
//				System.out.println(isHave);
//			}
		}
	}
}
