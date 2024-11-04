package work01;

import java.util.Scanner;

public class Piano {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		
		StringBuilder sb = new StringBuilder();
		//192鍵作成
		for (int i = 0; i < 16; i++) {
			sb.append("wbwbwwbwbwbw");
		}
		sb.append("wbwbwwbw");		//残り8鍵追加
		
		String s = sb.toString();
		
		
		for (int j = 0; j < 12; j++) {
			//比較用の鍵盤を切り出す
			if (j + w + b > 200) {
				break;
			}
			String subS = s.substring(j, j + w + b);
			
			//System.out.println(subS);
			
			//鍵盤に含まれるwの個数
			int wCount = 0;
			//鍵盤に含まれるbの個数
			int bCount = 0;
			for (int i = 0; i < subS.length(); i++) {
				if (subS.charAt(i) == 'w') {
					wCount++;
				} else {
					bCount++;
				}
			}
			
			if (w == wCount && b == bCount) {
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");

	}

}
