package work01;

import java.util.Scanner;

public class Square121 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			Integer ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
			
			double squareRoot = Math.sqrt(ab);
			
			if (squareRoot % 1 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		}

	}

}
