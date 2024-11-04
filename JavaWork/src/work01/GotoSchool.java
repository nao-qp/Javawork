package work01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GotoSchool {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			int N = scan.nextInt();
			
			//出席番号と登校した時の人数を格納
			record A(int num, int count) {}
			List<A>  Alist = new ArrayList<>();
			
			for (int i = 0; i < N; i++) {
				//出席番号は1からスタート
				Alist.add(new A(i + 1, scan.nextInt()));
			}
			
			//登校した時の人数で並べ替え
//			List<A> sortedAlist = Alist.stream()
//										.sorted(Comparator.comparingInt(A::count))
//										.toList();

			//並べ替えた生徒の出席番号を出力
//			for (A sortedA: sortedAlist) {
//				System.out.print(sortedA.num);
//				System.out.print(" ");
//			}
			
			Alist.stream()
//				.sorted((a, b) -> a.count - b.count)
			//または
				.sorted(Comparator.comparingInt(A::count))
				.forEach(entry -> System.out.print(entry.num + " "));
			
		}

	}

}
