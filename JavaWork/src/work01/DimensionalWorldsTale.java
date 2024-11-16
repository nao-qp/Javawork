package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DimensionalWorldsTale {

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
			
			//Xnの最大値を取得
			int xnMax = xnLis.stream()
							.max(Integer::compareTo)
							.get();
							
			
			//Ymの最小値を取得
			int ymMin = ymList.stream()
					.min(Integer::compareTo)
					.get();
			
			
			//xnListの最大値がymListの最小値よりも小さければNoWar
			if (xnMax < ymMin) {
				System.out.println("No War");
			} else {
				System.out.println("War");
			}
			
		}
	}

}
