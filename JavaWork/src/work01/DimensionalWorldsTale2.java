package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DimensionalWorldsTale2 {

	public static void main(String[] args) {
try(Scanner scan = new Scanner(System.in)) {
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			int X = scan.nextInt();
			int Y = scan.nextInt();

			List<Integer> xnLis = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				xnLis.add(scan.nextInt());
			}
			//Xも配列に含める
			xnLis.add(X);
			
			List<Integer> ymList = new ArrayList<>();
			for (int i = 0; i < M; i++) {
				ymList.add(scan.nextInt());
			}
			//Yも配列に含める
			ymList.add(Y);
			
			
			boolean isWar = true;
			//zの値を-100から100まで調べていく
			for (int z = -100; z <= 100; z++) {
				boolean isExists = true;
				//xが条件を満たすかみていく
				for (int i = 0; i < N + 1; i++) {
					if (xnLis.get(i) >= z) {
						//条件を満たさないxが存在する
						isExists = false;
						break;
					}
				}
				
				//xがすべて条件を満たしている場合、yが条件を満たすかみていく
				if (isExists) {
					for (int i = 0; i < M +1; i++) {
						if (ymList.get(i) < z) {
							//条件を満たさないyが存在する
							isExists = false;
							break;
						}
					}
				}
				
				//x,yともに条件を満たすzが見つかったら終了
				if (isExists) {
					isWar = false;
					break;
				}
			}
			
			if (isWar) {
				System.out.println("War");
			} else {
				System.out.println("No War");
			}
			
		}


	}

}
