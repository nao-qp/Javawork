package work01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TakahashisFailure2 {

	public static void main(String[] args) {
	//入力値を取得
		Scanner scan = new Scanner(System.in);

		//可変長配列を使用するので取得不要
		//int n = scan.nextInt();
		//int k = scan.nextInt();
		
		//nextInt()は改行を読み込まないので、残った改行を読み飛ばす
		scan.nextLine();
		//おいしさリスト
		List<Integer> a = Arrays.asList(scan.nextLine().split(" ")).stream()
				.map(s -> Integer.valueOf(s))
				.toList();
		//きらいな食品のIndexリスト
		List<Integer> b = Arrays.asList(scan.nextLine().split(" ")).stream()
				.map(s -> Integer.valueOf(s))
				.toList();
		scan.close();
		
		
		int max = a.stream().max((x, y) -> x - y).get().intValue();
		//または
		int maxtest = a.stream().max(Comparator.naturalOrder()).get().intValue();
		System.out.println(maxtest);
		
		for (int bi: b) {
			if(a.get(bi -1) == max) {
				System.out.println("Yes");
				return;
			}
		}
		
		
	}

}
