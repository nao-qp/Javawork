package work01;

import java.util.Scanner;

public class CraneAndTurtle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();	//何匹
		int y = scn.nextInt();	//足の本数
		scn.close();
		
		//亀が0～x匹いる。組み合わせが成立するかループ。
		for (int turtle = 0; turtle <= x; turtle++) {
			if (4 * turtle + 2 * (x - turtle) == y) {
				System.out.println("Yes");
				return;
			}
		}
		
		//組み合わせなし
		System.out.println("No");

	}

}
