package work01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AAlloy {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputGrams = br.readLine().split(" ");
		
		int a = Integer.parseInt(inputGrams[0]);
		int b = Integer.parseInt(inputGrams[1]);

		
		/*
		if (a > 0 && b == 0) {
			System.out.println("Gold");
		} else if (a == 0 && b > 0) {
			System.out.println("Silver");
		} else if (a > 0 && b > 0) {
			System.out.println("Alloy");
		}
		*/
		
		//もっと条件を簡潔に書ける（問題文に制約があるため）
		if (b == 0) {						//b==0の場合は必ずa>0となる
			System.out.println("Gold");
		} else if (a == 0) {
			System.out.println("Silver");
		} else {
			System.out.println("Alloy");	//b==0でなく、a==0でもない場合は、必ずa>0 && b>0
		}
		
	}

}
