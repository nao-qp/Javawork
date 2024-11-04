package work01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TripleMetre {

	public static void main(String[] args) throws IOException {
		//入力値Sを設定
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		/*
		//Tを作成
		StringBuilder t = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			t.append("oxx");
		}
		String tStr = t.toString();
		
		//SがTに含まれるか判定
		if (tStr.contains(s)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		*/
		
		//別の方法
		String ttArray[] = {"oxx", "xox", "xxo"};
		boolean isOK = true;
		//tの始まり方3パターンを比較
		for (String tt: ttArray) {
			
			
			System.out.println(s);
			for(int i = 0; i < s.length(); i++) {
				//System.out.println(s.length());
				
				
				if(s.substring(i, 1).toString() != tt.substring(i % 3, 1).toString()) {
					isOK = false;
					System.out.println(tt);
					System.out.println("Sの" + i + "番目の文字 " + s.substring(i, 1));
					System.out.println(tt + "の" + i + "番目の文字"  + tt.substring(i % 3, 1));
					break;
				}
				
			}
			if (isOK) {
				System.out.println("Yes");
				break;
			}
		}
		
		if (!isOK) {
			System.out.println("No");
		}

	}
}
