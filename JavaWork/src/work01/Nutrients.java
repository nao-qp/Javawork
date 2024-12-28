package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nutrients {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			
			List<Integer> mList = new ArrayList<>();
			List<List<Integer>> nList = new ArrayList<>();
			
			//A
			
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					int m = scan.nextInt();
					mList.add(m);
				}
				nList.add(mList);
			}

			
		}
	}

}
