package work01;

import java.util.Scanner;

public class RuinedSquare2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			
			//(Xn+2, Yn+2) = ((Xn+1 - (Yn+1 -Yn), (Yn+1 + (Xn+1 - Xn))
			
			for (int i = 0; i < 2; i++) {
				int x3 = x2 - (y2 - y1);
				int y3 = y2 + (x2 - x1);
				System.out.print(x3 + " " + y3 + " ");
				x1 = x2;
				y1 = y2;
				x2 = x3;
				y2 = y3;
			}
			
		}

	}

}
