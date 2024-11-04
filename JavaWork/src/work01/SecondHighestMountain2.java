package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondHighestMountain2 {

	public static void main(String[] args) {
		
		record Mountain(String name, int high) {}
		List<Mountain> mountains = new ArrayList<>();
		
		try(Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			for (int i = 0; i < N; i++) {
				Mountain mountain = new Mountain(scan.next(), scan.nextInt());
				mountains.add(mountain);
			}
		}
		//tryで囲んでScanerのcloseを省略
		
		mountains.sort((x, y) -> y.high() - x.high());
		
		System.out.println(mountains.get(1).name());
		
	}

}
