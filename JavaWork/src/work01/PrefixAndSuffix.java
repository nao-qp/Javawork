package work01;

import java.util.Scanner;

public class PrefixAndSuffix {

	public static void main(String[] args) {
		//入力値を取得
		Scanner scn = new Scanner(System.in);
		
		int s = scn.nextInt();
		int t = scn.nextInt();
		
		//改行を読み飛ばす
		scn.nextLine();
		
		//Sの文字列を取得
		String sStr = scn.nextLine();
		
		//Tの文字列を取得
		String tStr = scn.nextLine();
		
		scn.close();
		
		//判定用フラグ
		boolean isPrefix = false;
		boolean isSuffix = false;
		
		
		//SがTの接頭辞か比較
		if (sStr.equals(tStr.substring(0, s))) {
			isPrefix = true;
		}
		//SがTの接尾辞か比較
		if (sStr.equals(tStr.substring(t - s))) {
			isSuffix = true;
		}
		
		//テスト
		/*
		System.out.println(s);
		System.out.println(t);
		System.out.println(sStr);
		System.out.println(tStr);
		System.out.println(tStr.substring(0, s));
		System.out.println(tStr.substring(t - s));
		System.out.println(isPrefix);
		System.out.println(isSuffix);
		*/
		
		//判定、出力
		/*
		if (isPrefix && isSuffix) {
			//S が T の接頭辞であり、かつ接尾辞でもある場合
			System.out.println(0);
			return;
		}
		
		if (isPrefix && !(isSuffix)) {
			//S が T の接頭辞であるが、接尾辞でない場合
			System.out.println(1);
			return;
		}
		
		if (!(isPrefix) && isSuffix) {
			//S が T の接尾辞であるが、接頭辞でない場合
			System.out.println(2);
			return;
		}
		
		if (!(isPrefix) && !(isSuffix)) {
			//S が T の接頭辞でも接尾辞でもない場合
			System.out.println(3);
			return;
		}
		*/
		
		/*
		if (isPrefix && isSuffix) {
			//S が T の接頭辞であり、かつ接尾辞でもある場合
			System.out.println(0);
		} else if (isPrefix) {
			//S が T の接頭辞であるが、接尾辞でない場合
			System.out.println(1);
		} else if (isSuffix) {
			//S が T の接尾辞であるが、接頭辞でない場合
			System.out.println(2);
		} else {
			//S が T の接頭辞でも接尾辞でもない場合
			System.out.println(3);
		}
		*/
		
		//もっと簡単に書くと...("でない時"に注目)
		int answer = 0;
		if (!tStr.endsWith(sStr)) answer += 1;		//接尾辞でない時プラス1
		if (!tStr.startsWith(sStr)) answer += 2;	//接頭辞出ないときプラス2
		System.out.println(answer);
		
	}


}
