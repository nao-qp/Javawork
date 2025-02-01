package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DailyCookie_2 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int D = scan.nextInt();
			scan.nextLine();
			String S = scan.nextLine();
			
			// S文字列の各文字のインデックスと文字
			record SRecord(int i, String sChar) {};
			List<SRecord>  SLilst = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				SLilst.add(new SRecord(i, String.valueOf(S.charAt(i))));
			}
			
			// クッキーのリスト
			List<SRecord> SCookies = new ArrayList<>();
			SCookies = SLilst.stream()
					.filter(s -> s.sChar.equals("@"))
					.collect(Collectors.toList());

			// 出力する文字列
			String newS = "";
			
			// クッキーリストのサイズと食べるクッキーの数が同じであれば、全て「.」を出力
			if (SCookies.size() - D == 0) {
				newS = ".".repeat(N);
			} else {
				// 残っているクッキーの一番最後のクッキーの文字インデックス
				int remainingCookieLastIndex = SCookies.get(SCookies.size() - D - 1).i;
				// 残っている最後のクッキーまでは元の文字列をそのまま出力
				newS = S.substring(0, remainingCookieLastIndex + 1);
				// 残りの文字列を「.」で埋める
				newS = newS + ".".repeat(SLilst.size() - newS.length());
			}
			System.out.println(newS);
			
		}
	}
}
