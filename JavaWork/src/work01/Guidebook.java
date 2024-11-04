package work01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Guidebook {

	record Restaurant(int num, String name, int score) {}
	
	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			int count = scan.nextInt();
			
			
			List<Restaurant> guidebook = new ArrayList<>();
			
			for (int i = 0; i < count; i++) {
//				String name = scan.next();
//				Integer score = scan.nextInt();
				guidebook.add(new Restaurant(i + 1, scan.next(), scan.nextInt()));
			}
			
			guidebook.forEach(Restaurant -> System.out.println(Restaurant.name));
			System.out.println();
			
			//名前で並べ替え
			List <Restaurant> guidebookNameSorted = guidebook.stream() 
					.sorted(Comparator.comparing(Restaurant::name))
					.collect(Collectors.toList());
			
//			
//			guidebookNameSorted.forEach(Restaurant -> System.out.println(Restaurant));
//			System.out.println();
			
			
			
			
			//出力用（名前の中で点数で並べ替え）
			List <Restaurant> guidebookscoreSorted = new ArrayList<>();
			//名前ごとの並べ替え用
			List <Restaurant> scoreSortTemp = new ArrayList<>();
			String prevName = "";
			
			List <Restaurant> scoreSorted = new ArrayList<>();
			
			
			
			//名前で並べ替えたリストをループ
			for (Restaurant restaurant: guidebookNameSorted) {
				
				//前回と同じ名前なら、並べ替え用リストに追加
				if (prevName.length() == 0 || prevName.equals(restaurant.name)) {
//					System.out.println(prevName.length());
//					System.out.println(prevName + " " + restaurant.name);
					
					
					scoreSortTemp.add(restaurant);
					
				} else {
					
					
					
					//名前ごとの並べ替え用リストを点数で並べ替えしてリストに入れる
//					scoreSorted = scoreSortTemp.stream()
//						.sorted(Comparator.comparing(Restaurant::score).reversed())
//						.collect(Collectors.toList());
//					
//					//並べ替えたリストを出力用のリストに追加
//					for(int i = 0; i < scoreSorted.size(); i++) {
//						guidebookscoreSorted.add(scoreSorted.get(i));
//					}
					
					guidebookscoreSorted = sortScore(scoreSorted, scoreSortTemp, guidebookscoreSorted);
					
					//並べ替え用のリストを空にする
					scoreSortTemp.clear();
					scoreSorted.clear();
					
					
					
					//今回の分を追加
					scoreSortTemp.add(restaurant);
					
				}
				//今回のRestaurantの名前を退避
				prevName = restaurant.name;
			}

			
			//名前ごとの並べ替え用リストを点数で並べ替えしてリストに入れる
//			scoreSorted = scoreSortTemp.stream()
//				.sorted(Comparator.comparing(Restaurant::score).reversed())
//				.collect(Collectors.toList());
//			
//			//並べ替えたリストを出力用のリストに追加
//			for(int i = 0; i < scoreSorted.size(); i++) {
//				guidebookscoreSorted.add(scoreSorted.get(i));
//			}
			
			guidebookscoreSorted = sortScore(scoreSorted, scoreSortTemp, guidebookscoreSorted);
			
			//出力
			guidebookscoreSorted.forEach(Restaurant -> System.out.println(Restaurant.num));
			
		}

	}
	

	public static List<Restaurant> sortScore (List<Restaurant> scoreSorted, List<Restaurant> scoreSortTemp, List<Restaurant> guidebookscoreSorted) {
		
		scoreSorted = scoreSortTemp.stream()
				.sorted(Comparator.comparing(Restaurant::score).reversed())
				.collect(Collectors.toList());
			
			//並べ替えたリストを出力用のリストに追加
			for(int i = 0; i < scoreSorted.size(); i++) {
				guidebookscoreSorted.add(scoreSorted.get(i));
			}
		return guidebookscoreSorted;
	}

}