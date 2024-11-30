package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Swap0or1 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			
			int N = scan.nextInt();
			
			List<Integer> pList = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				pList.add(scan.nextInt());
			}
			
			//差分の数
			int differencecount = 0;
			for (int i = 0; i < N; i++) {
				if (i + 1 - pList.get(i) != 0) {
					differencecount ++;
				}
			}
			
			if (differencecount > 2) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
			
		}

	}

}
