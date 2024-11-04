package work01;

import java.util.Scanner;

public class SecondHighestMountain3 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			
			record Mountain(String name, int high) {}
			Mountain highest = new Mountain("", 0);
			Mountain second = new Mountain("", 0);
			
			for (int i = 0; i < N; i++) {
				String name = scan.next();
				int high = scan.nextInt();
				
				if (highest.high < high) {
					second = highest;
					highest = new Mountain(name, high);
				} else if (second.high < high) {		//2番目と比較
					second = new Mountain(name, high);
				}
			}
			
			System.out.println(second.name);
		}
		
		
		

	}

}
