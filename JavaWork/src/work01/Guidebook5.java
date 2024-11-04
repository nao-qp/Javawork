package work01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Guidebook5 {

	//③StreamのsortedでComparator.comparingを使用して、thenComparingで二段階で並べ替えするやり方
	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			int count = scan.nextInt();
			
			record Restaurant(int num, String name, int score) {}
			List<Restaurant> guidebook = new ArrayList<>();
			
			for (int i = 0; i < count; i++) {
				guidebook.add(new Restaurant(i + 1, scan.next(), scan.nextInt()));
			}
			
			List<Restaurant> guidebookSorted = guidebook.stream()
					.sorted(Comparator.comparing(Restaurant::name)
										.thenComparing(Restaurant::score, Comparator.reverseOrder())
							).toList();
			
			guidebookSorted.forEach(Restaurant -> System.out.println(Restaurant.num));
			
		}

	}

}
