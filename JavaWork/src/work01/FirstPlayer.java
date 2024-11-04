package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstPlayer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//人数読込
		int num = scan.nextInt();
		
		List<String> nameList = new ArrayList<>();
		List<Integer> ageList = new ArrayList<>();
		
		//最小年齢変数
		int firstAge = 1000000000;
		int firstAgeIndex = 0;
		
		for (int i = 0; i < num; i++) {
			//名前と年齢を読込
			nameList.add(scan.next());
			ageList.add(scan.nextInt());
			
			//最小年齢を設定
			if (ageList.get(i) < firstAge) {
				firstAge = ageList.get(i);
				firstAgeIndex = i;
			}
		}
		
		scan.close();
		
		for (int i = 0; i < num; i++) {
			System.out.println(nameList.get((i + firstAgeIndex) % num));
		}
		
	}
	
	

}