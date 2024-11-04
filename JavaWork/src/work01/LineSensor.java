package work01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LineSensor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			int H = scan.nextInt();
			int W = scan.nextInt();
			scan.nextLine();
			
			//各列ごとの箱の数を格納する配列
			int JList[] = new int[W];
			
			//行をループ
			for (int i = 0; i < H; i++) {
				String C = scan.nextLine();
				//列をループ
				for (int j = 0; j < W; j++) {
					if (C.charAt(j) == '#') {
						JList[j] += 1;
					}
				}
			}
		scan.close();
		
		String Jjoin = Arrays.stream(JList)
						.mapToObj(String::valueOf)
						.collect(Collectors.joining(" "));
		
		System.out.println(Jjoin);
	}
}
