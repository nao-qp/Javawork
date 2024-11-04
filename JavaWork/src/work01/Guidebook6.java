package work01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Guidebook6 {

	//Listを使わずに配列を使用し、並べ替えて出力する方法
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int count = scan.nextInt();
			
			record Restaurant(int num, String name, int score) {}
			Restaurant[] restaurants = new Restaurant[count];
			
			for (int i = 0; i < count; i++) {
				restaurants[i] = new Restaurant(i + 1, scan.next(), scan.nextInt());
			}
			
			Arrays.sort(restaurants,
				Comparator
					.comparing(Restaurant::name)
					.thenComparing(Restaurant::score, Comparator.reverseOrder())
					);
			
			for (int i = 0; i < count; i++) {
				System.out.println(restaurants[i].num);
			}
			
		}
		

	}

}
