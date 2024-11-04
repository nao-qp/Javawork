package work01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PostalCard {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		//改行を読み飛ばす
		scan.nextLine();
		
		var sList = new ArrayList<String>();	//varで省略して書ける
		for (int i = 0; i < n; i++) {
			sList.add(scan.nextLine());
		}
		
		List<String> tList = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			tList.add(scan.nextLine());
		}
		
		scan.close();
		
		int machCount = 0;
		
		//SとTを一つずつ比較
		
		for (String s: sList) {
			for (String t : tList) {
				if (s.endsWith(t)) {
					machCount += 1;
					break;
				}
			}
		}
		
		
		//Sの接尾辞がTのリストに含まれるか
		/*
		for (String s : sList) {
			if (tSetList.contains(s.substring(s.length() - 3))) {
				machCount += 1;
			}
		}
		*/
		
		System.out.println(machCount);
	}
		

}
