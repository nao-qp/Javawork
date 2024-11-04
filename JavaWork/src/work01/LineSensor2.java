package work01;

import java.util.Scanner;

public class LineSensor2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		scan.nextLine();

		String C[] = new String[H];
		for (int i = 0; i < H; i++) {
			C[i] = scan.nextLine();
		}
		scan.close();
		
		//列のループ
		for (int j = 0; j < W; j++) {
			//各列の箱の数
			int X = 0;
			//行のループ
			for (int i = 0; i < H; i++) {
				if (C[i].charAt(j) == '#') {
					X ++;
				}
			}
			
			if (j == 0) {
				System.out.print(X);
			} else {
				System.out.print(" " + X);
			}
		}
		
	}

}
