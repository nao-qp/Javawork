package work01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class PerfectString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str =  br.readLine();
		
		//char型のリストにchar型にして変換
		//char[] charArray = str.toCharArray();
		
		//大文字小文字判定変数
		//boolean isUpperStr = false;
		//boolean isLowerStr = false;
		boolean existsBig = false;
		boolean existsSmall = false;
		
		/*
		//大文字検索
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(charArray[i])) {
				existsBig = true;
				break;
			}
		}
		
		//小文字検索
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(charArray[i])) {
				existsSmall = true;
				break;
			}
		}
		*/
		
		for (int i = 0; i < str.length(); i++) {
			//大文字検索
			if (Character.isUpperCase(str.charAt(i))) {
				existsBig = true;
			}
			//小文字検索
			if (Character.isUpperCase(str.charAt(i))) {
				existsSmall = true;
			}
		}
		
		
	
		/*
		//同じ文字検索用配列
		String[] strArray = str.split("");
		//同じ文字が含まれるか判定用
		boolean isContains = false;
		
		//同じ文字が含まれるか検索
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(strArray[i], i + 1) > 0) {
				isContains = true;
				break;
			}
		}
		
		//大文字が含まれるtrue、小文字が含まれるtrue、同じ文字が含まれるfalseの時にYes
		if (isUpperStr && isLowerStr && !isContains) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		*/
		
		boolean isDifferent = false;
		
		//重複要素がない配列を用意
		Set<Character> charSet = new HashSet<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			//1文字ずつ追加する
			charSet.add(str.charAt(i));
		}
		
		//要素数が変わらなければ全ての文字が違う
		if (charSet.size() == str.length()) {
			isDifferent = true;
		}
		
		if (existsBig && existsSmall && isDifferent) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
