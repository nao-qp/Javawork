package work01;

import java.util.Scanner;

public class Pentagon {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1行ずつ読み取り
		String S = scan.nextLine();
		String T = scan.nextLine();
		
		//1文字ずつ文字コードにして格納
		int S1 = (int)S.charAt(0);
		int S2 = (int)S.charAt(1);
		
		int T1 = (int)T.charAt(0);
		int T2 = (int)T.charAt(1);
		
		//長さを設定
		int sLength = Math.abs(S1 - S2);
		int tLength = Math.abs(T1 - T2);
		
		scan.close();
		
		//比較用に長さの値をそろえる
		if (sLength == 3) {
			sLength = 2;
		}
		
		if (tLength == 3) {
			tLength = 2;
		}
		
		if (sLength == 4) {
			sLength = 1;
		}
		
		if (tLength == 4) {
			tLength = 1;
		}
		
		//比較
		if (sLength == tLength) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
