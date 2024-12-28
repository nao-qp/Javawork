package work01;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChooseIntegers {
	public static void main(String[] args) throws IOException {
		try (Scanner scan = new Scanner(System.in)){
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			
			// パターンを調べる
//			Set<Integer> uniqueNumbers = new HashSet<>();
//			for (int i = 1; i < 1000; i++) {
//				int calcC = A * i % B;
//				uniqueNumbers.add(calcC);
//				
//				if (calcC == C) {
//					System.out.println(i + " " + A * i + " " + calcC + "*");
//				} else {
//					System.out.println(i + " " + A * i + " " + calcC);
//				}
//			}
//			System.out.println("uniqueNumbers.size" + uniqueNumbers.size());
//			
			
			Set<Integer> numSet = new HashSet<>();
			// あまりは最大B種類ある
			for (int i = 1; i <= B; i++) {
				int calc = A * i % B;
				numSet.add(calc);
			}
			
			boolean existC = numSet.stream()
					.anyMatch(num -> num == C);

//			if (existC) {
//				System.out.println("Yes");
//			} else {
//				System.out.println("No");
//			}
			System.out.println(existC ? "YES" : "NO");
			
			
		}
	}
}
