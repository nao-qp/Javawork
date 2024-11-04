package work01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MissingNo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		List<Integer> aList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			aList.add(scan.nextInt());
		}
		
		scan.close();
		
		//昇順に並べ替え
		Collections.sort(aList);
		
		//最小値から順番に1足した数値と比較し、値が違った場合抜けた数字を出力
		/*
		int minNum = aList.get(0);
		int orderNum = minNum;
		for (int i = 0; i < n; i++) {
			if (aList.get(i) != orderNum) {
				System.out.println(orderNum);
				return;
			}
			orderNum += 1;
		}
		*/
		
		//1つ先の配列の数値との差分が2になる箇所が抜けた数字になる
		for (int i = 0; i < n; i++) {
			if (aList.get(i + 1) - aList.get(i) == 2) {
				System.out.println(aList.get(i) + 1);
				return;
			}
		}
	}
}
