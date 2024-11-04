package work01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Guidebook3 {

	//①Collections.sorを使うやり方
	
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			
			int count = scan.nextInt();
			
			record Restaurant(int num, String name, int score) {}
			List<Restaurant> guidebook = new ArrayList<>();
			
			for (int i = 0; i < count; i++) {
				guidebook.add(new Restaurant(i + 1, scan.next(), scan.nextInt()));
			}
			
			Collections.sort(guidebook, (r1, r2) -> {
				if (r1.name.equals(r2.name)) {
					return r2.score - r1.score;		//名前が同じなら、点数を比較。
					//入れ替えたい時にプラスを返すようにする。
				} else {
					return r1.name.compareTo(r2.name);
				}
			});
			
			for (Restaurant resutaurant: guidebook) {
				System.out.println(resutaurant.num);
			}
			
		}

	}

}
 