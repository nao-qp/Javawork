package work01;
import java.util.Arrays;
import java.util.Scanner;

public class A12435 {

	public static void main(String[] args) {
		try(var scan = new Scanner(System.in)) {
			int[] AList = new int[5];
			for (int i = 0; i < 5; i++) {
				AList[i] = scan.nextInt();
			}
			
			// 昇順にならんだリスト
			int[] AListOrder = {1, 2, 3, 4, 5};
			
			// AListとAListOrderが同じならNoを出力して終了
			if (Arrays.equals(AList, AListOrder)) {
				System.out.println("No");
				return;
			}
			
			// AListの最後から1つ前の要素までループしてAListOrderと比較していく
			for (int i = 0; i < 4; i++) {
				// 数字が違ったら該当の要素と、その次の要素を入れ替える。
				if (AList[i] != AListOrder[i]) {
					int nextNumTemp = AList[i + 1];
					AList[i + 1] = AList[i];
					AList[i] = nextNumTemp;
					break;
				}
			}
			// 入れ替えを行ったAListとAListOrderが同じか比較する
			if (Arrays.equals(AList, AListOrder)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
