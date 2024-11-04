package work01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TrickOrTreat3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int K = scan.nextInt();
			
			Set<Integer> received = new HashSet<>();
			
			//お菓子の種類だけループ
			for (int i = 0; i < K; i++) {
				int d = scan.nextInt();
				for (int j = 0; j < d; j++) {
					//お菓子をもらった人をSetデータに入れていく（重複無視）
					received.add(scan.nextInt());
				}
			}
			
			//全体からお菓子をもらった人リスト（重複なし）のサイズを引く
			System.out.println(N - received.size());
		}

	}

}
