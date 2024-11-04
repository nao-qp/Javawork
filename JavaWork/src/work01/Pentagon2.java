package work01;

import java.util.Scanner;

public class Pentagon2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		String T = scan.next();
		
		scan.close();
		
		if (isNear(S.charAt(0), S.charAt(1)) == isNear(T.charAt(0), T.charAt(1))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static boolean isNear(char p1, char p2) {
		
		final String point = "ABCDE";
		
		int dist = Math.abs(point.indexOf(p1) - point.indexOf(p2));
		
		if (dist == 1 || dist == 4) {
			return true;
		} else {
			return false;
		}
	}

}
