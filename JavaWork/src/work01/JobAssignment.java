package work01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JobAssignment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
	
		for(int i = 0; i < n; i++) {
			a.add(scan.nextInt());
			b.add(scan.nextInt());
		}
		
		scan.close();
		
		List<Integer> jobTime = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (i == j) {
					//2つの仕事を一人の従業員が行う場合
					jobTime.add(a.get(i) + b.get(j));
				} else {
					//2つの仕事を別々の従業員が行う場合
					jobTime.add(Math.max(a.get(i), b.get(j)));
				}
			}
		}
		
		//昇順に並べ替えて最小値を求める
		Collections.sort(jobTime);
		
		System.out.println(jobTime.get(0));
	}
}
