package work01;

import java.util.Scanner;

public class Typo2 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			String S = scan.nextLine();
			String T = scan.nextLine();
		
		if (S.equals(T)) {
			System.out.println("Yes");
			return;
		}

		//文字列を文字の配列にする
		char[] arrayed = S.toCharArray();
		String answer = "No";
		for (int i = 0; i < S.length() - 1; i++) {
			//文字が違う箇所があった場合、入れ替えて文字列が一致するか
			if (S.charAt(i) != T.charAt(i)) {
				
				char c = arrayed[i];
				arrayed[i] = arrayed[i + 1];
				arrayed[i + 1] = c;
				
				if (T.equals(new String(arrayed))) {
					answer = "Yes";
				}
				break;	//入れ替えは一回までなので、一箇所違って入れ替えを行ったら終わり。
			}
		}
		
		System.out.println(answer);
		}

	}

}
