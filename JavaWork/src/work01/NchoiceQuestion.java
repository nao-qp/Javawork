package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NchoiceQuestion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//空行読み飛ばし
		scan.nextLine();
		
		//回答リスト読込
		List<Integer> answerList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			answerList.add(scan.nextInt());
		}
		
		scan.close();
		
		//足し算の答え
		int answer = a + b;
		
		System.out.println(answerList.indexOf(answer) + 1);
		
	}

}
