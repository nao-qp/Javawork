package work01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChooseIntegers2 {
	public static void main(String[] args) throws IOException {
		try (Scanner scan = new Scanner(System.in)){
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
		
			// 1〜Bまでの配列を用意
			List<Integer> nList = new ArrayList<>();
			for (int i = 0; i <= B; i++) {
				nList.add(i);
			}
			
			long count = nList.stream()
					.map(i -> A * i % B)	// nListの中身をAの倍数をBで割った余りに変換
					.filter(i -> i == C)	// Cと同じものをフィルタリング
					.count();				//数える
					
			System.out.println(count > 0 ? "YES" : "NO");
		}
			
	}

}
