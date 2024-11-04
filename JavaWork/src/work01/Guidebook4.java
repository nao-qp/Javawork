package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guidebook4 {

	//②Streamでsortedメソッドとconpareメソッド（ラムダ式）を使うやり方
	
	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			int count = scan.nextInt();
			
			record Restaurant(int num, String name, int score) {}
			List<Restaurant> guidebook = new ArrayList<>();
			
			for (int i = 0; i < count; i++) {
				guidebook.add(new Restaurant(i + 1, scan.next(), scan.nextInt()));
			}
			
			List<Restaurant> guidebookSorted = guidebook.stream()
					.sorted((r1, r2) -> {
						if (r1.name.equals(r2.name)) {
							return r2.score - r1.score;
						} else {
							return r1.name.compareTo(r2.name);
						}
					}).toList();
			
			guidebookSorted.forEach(Restaurant -> System.out.println(Restaurant.num));
			
		}
		
		
	}

}
