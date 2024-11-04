package work01;

import java.util.Scanner;

public class Piano2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		
		//鍵盤のパターン
		String T = "wbwbwwbwbwbw";
		
		//検証する文字列のスタート位置12パターンをループ
		for (int i = 0; i < T.length(); i++) {
			int nw = 0;	//白鍵の数
			int nb = 0; //黒鍵の数
			//比較する文字数分に含まれる白鍵、黒鍵の数をカウント
			for (int j = 0; j < (w + b); j++) {
				if (T.charAt((i + j) % T.length()) == 'w') {
							//インデックス11（最後）の文字と比較した後、最初に戻る
					nw++;
				} else {
					nb++;
				}
			}
			if (nw == w && nb ==b) {
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
	}
}
