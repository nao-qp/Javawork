package work01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AtCoDeerKunToPenki {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] penkiList = new int[3];
		for (int i = 0; i < 3; i++) {
			penkiList[i] =scan.nextInt();
		}
		
		scan.close();
		
		int count = Arrays.stream(penkiList)
					.boxed()
					.collect(Collectors.toSet())
					.size();
		
		System.out.println(count);
	}

}
