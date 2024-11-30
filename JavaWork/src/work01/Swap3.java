package work01;

import java.util.Scanner;

public class Swap3 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			
			int p[] = new int[N];
			for (int i = 0; i < N; i++) {
				p[i] = scan.nextInt();
			}
			
			if (isSortable(p)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
	
	/**
	 * 1回の並べ替えで昇順にできるか判定する。
	 * @param p 調べる対象の配列。
	 * @return boolean 昇順にできる場合trueを返す。
	 */
	private static boolean isSortable(int[] p) {
		//並べ替えなしのままで昇順かどうか判定
		if (isSorted(p)) return true;
		
		//並べ替えを行って昇順か判定
		//p.length - 1　並べ替え対象の要素は配列の最後から一個前まで
		for (int i = 0; i < p.length - 1; i++) {
			for (int j = i + 1; j < p.length; j++) {
				if (isSorted(swap(p, i, j))) {
					return true;
				}
				//昇順ではなかった場合、入れ替えた要素をいったん元に戻す
				swap(p, i, j);
			}
		}
		return false;
	}
	
	/**
	 * 昇順になっているか判定する。
	 * @param p 昇順かどうか調べる対象の配列。
	 * @return boolean 昇順ならtrueを返す。
	 */
	private static boolean isSorted(int[] p) {
		for (int i = 0; i < p.length - 1; i++) {
			//現在の要素と次の要素を比較して現在の要素が大きかったら昇順ではない。
			if(p[i] > p[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * i番目とj番目を入れ替えて配列を返す。
	 * @param p 並べ替えるint配列。この配列自体が並べ替わる。
	 * @param i 並べ替え対象要素。
	 * @param j 並べ替え対象要素。　
	 * @return p 並べ替えた要素。
	 */
	private static int[] swap(int[] p, int i, int j) {
		int tmp = p[i];
		p[i] = p[j];
		p[j] = tmp;
		return p;
	}

}
