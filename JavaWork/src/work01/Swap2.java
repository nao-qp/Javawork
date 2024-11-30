package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
		
		int N = scan.nextInt();
		
		List<Integer> pList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			pList.add(scan.nextInt());
		}
		
		List<Integer> pListCopy = pList;
		List<Integer> pListOrdered = pListCopy.stream()
				.sorted()
				.toList();
		
		//差分の数
		int differencecount = 0;
		int i = 0;
		for (Integer p: pList) {
			if (pListOrdered.get(i) - p != 0) {
				differencecount ++; 
			}
			i ++;
		}

		if (differencecount > 2) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
	}

	}

}
