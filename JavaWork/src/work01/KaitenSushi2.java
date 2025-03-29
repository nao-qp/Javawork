package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaitenSushi2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();		// 人の数
			int M = scan.nextInt();		// 寿司の数
			
			int min = 200000;	// 美食度最小値
			// 検索対象の人リスト(検索対象を絞り込んだリスト。)
			List<Customer> customers = new ArrayList<>();
			for (int i = 1; i <= N; i++) {
				int A = scan.nextInt();
				// 前の人の美食度以上のお寿司は前の人が食べるので、前の人よりも美食度が高い人はお寿司を食べないので検索対象から省いてリストに追加していく。
				if (A <= min) {
					customers.add(new Customer(i, A));	
					min = A;
				}
			}
			
			// お寿司のおいしさで検索していく
			for (int j = 0; j < M; j++) {
				int B = scan.nextInt();	//お寿司のおいしさ
				boolean found = false;
				for (Customer customer: customers) {
					if (customer.a <= B) {
						System.out.println(customer.num);
						found = true;
						break;
					} 
				}
				if (!found) {
					System.out.println(-1);
				}
			}
		}
	}
}

// 人クラス
class Customer {
	int num;	// 人の番号
	int a;		// 美食度
	Customer(int num, int a) {
		this.num = num;
		this.a = a;
	}
}
