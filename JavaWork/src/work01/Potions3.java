package work01;

import java.util.Arrays;
import java.util.Scanner;

public class Potions3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();		//傷薬の数
		int h = scan.nextInt();		//体力
		int x = scan.nextInt();		//目標体力
		scan.nextLine();

		int[] P = new int[n];		//傷薬リスト
		for (int i =0; i < n; i++ ) {
			P[i] = scan.nextInt();
		}
		
		scan.close();
		
		int index = Arrays.binarySearch(P, x - h);
		System.out.println((index >= 0 ? index : ~index) + 1);
			//同じ値が見つからなかった場合2の補数で返ってくるので~でビットを反転
			//見つからなかったら2の補数(-(挿入ポイント)-1)
		
	}

}
