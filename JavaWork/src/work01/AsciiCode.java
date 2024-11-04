package work01;

import java.util.Scanner;

public class AsciiCode {

	public static void main(String[] args) {
		/*
		Map<Integer, String> map = new HashMap<>();
		
		//キー初期値設定
		int i = 97;
		//アルファベットを設定
		for (char c = 'a'; c <= 'z'; c++) {
			map.put(i, String.valueOf(c));
			i++;
		}
		
		//入力値を取得
		Scanner scn = new Scanner(System.in);
		int inputNum = Integer.parseInt(scn.nextLine());
		scn.close();
		//入力された数値をキーにMap配列からアルファベットを出力
		System.out.println(map.get(inputNum));
		*/
		
		//入力値を取得
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.close();
		
		//解1
		String str = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(str.charAt(N - 97));
		
		//解2
		System.out.println(Character.toChars(N));
		//キャストするだけでも出力できる
		System.out.println((char)N);
		
		//解3
		System.out.printf("%c\n", N);
	}

}
