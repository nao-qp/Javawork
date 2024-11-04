package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Typo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String S = scan.nextLine();
		String T = scan.nextLine();
		
		scan.close();
		
		////文字列をそのまま比較////
		if (S.equals(T)) {
			System.out.println("Yes");
			return;
		}
		
		////文字列が一致しない場合////
		List<Integer> differentList = new ArrayList<>();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != T.charAt(i)) {
				differentList.add(i);
			}
		}
		
		//違う文字が2つある
		if (differentList.size() == 2) {
			//インデックスが隣同士か
			if (differentList.get(1) - differentList.get(0) != 1) {
				System.out.println("No");
			} else {
				
				//インデックスが隣同士なら文字を入れ替えて同じになるか比較する
				if (S.charAt(differentList.get(0)) == T.charAt(differentList.get(1))
						&& S.charAt(differentList.get(1)) == T.charAt(differentList.get(0))) {
					System.out.println("Yes");
				}
			}
		} else {
			//違う文字が1文字、または3つ以上ある
			System.out.println("No");
		}
	}

}
