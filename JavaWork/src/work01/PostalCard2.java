package work01;

import java.util.Arrays;
import java.util.Scanner;

public class PostalCard2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		//空行を読み飛ばす
		scan.nextLine();
		
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = scan.nextInt();		//1行に数字1つなので、nextIntでEnterまで取ってくれる。空行読み飛ばし不要。
		}
		
		int[] t = new int[m];
		for (int i = 0; i < m; i++) {
			t[i] = scan.nextInt();
		}

		scan.close();
		
		//昇順に並べ替え
		Arrays.sort(t);
		
		int count = 0;
		for (int src: s) {
			//Arraysにメソッドが用意されている
			if (/*Arrays.*/binarySearch(t, src % 1000) >= 0) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	public static int binarySearch(int[] array, int key) {
		int start = 0;
		int end = array.length - 1;
		
		while (start <= end) {
			int middle = (start + end) / 2;
			if (array[middle] == key) {
				return middle;
			} else if (array[middle] > key) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		
		//一致するものがなかったのでインデックスとしてあり得ない-1を返す。
		return -1;

	}

}
 