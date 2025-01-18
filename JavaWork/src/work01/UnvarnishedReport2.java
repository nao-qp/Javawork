package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class UnvarnishedReport2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String S = scan.nextLine();
			String T = scan.nextLine();
			
			Integer maxLength = S.length() > T.length() ? S.length() : T.length();
			S = fillString(S, maxLength);
			T = fillString(T, maxLength);
			
			// SとTの文字を1つずつ格納したrecordオブジェクトのリストを作成
			record STChar(char sChar, char tChar) {};
			List<STChar> STCharList = new ArrayList<>();
			for (int i = 0; i < maxLength; i++){
				STCharList.add(new STChar(S.charAt(i), T.charAt(i)));
			}
			
			// recordオブジェクトのリストのsとtの文字を比較し、最初の違う文字のインデックスを返す。
			Integer minDiffIndex = IntStream.range(0, STCharList.size())
					.filter(i -> STCharList.get(i).sChar() != STCharList.get(i).tChar())
					.findFirst()
					.orElse(-1);
			
			// -1の場合はSとTは同じ文字列
			if (minDiffIndex == -1) {
				System.out.println(0);
			} else {
				System.out.println(minDiffIndex + 1);
			}
		}
	}
	
	/**
	 * strの長さがmaxLengthになるように"1"を後ろに埋める
	 * @param str
	 * @param maxLength
	 * @return maxLengthまで"1"を埋めたstr文字列
	 */
	public static String fillString(String str, Integer maxLength) {
		String filledString = "";
		StringBuilder sb = new StringBuilder(str);
		Integer strLingth = 0;
		while(strLingth < maxLength) {
			sb.append("1");
			strLingth++;
		}
		filledString = String.valueOf(sb);
		
		return filledString;
	}

}
