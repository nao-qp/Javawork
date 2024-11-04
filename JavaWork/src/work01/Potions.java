package work01;

import java.util.Scanner;

public class Potions {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();		//傷薬
		int h = scan.nextInt();		//体力
		int x = scan.nextInt();		//目標体力
		scan.nextLine();
		
		System.out.println(n + " " +  h + " " + x);
		
		//目標体力までに必要な体力
		int needHNum = x - h;
		
		for (int i = 0; i < n; i++) {
			int p = scan.nextInt();
			System.out.println(p);
			if (p >= needHNum) {
				System.out.println(i + 1);
				break;
			}
		}
		
		scan.close();

	}

}
