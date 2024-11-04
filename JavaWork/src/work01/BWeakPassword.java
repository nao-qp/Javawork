package work01;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BWeakPassword {

	public static void main(String[] args) throws IOException {
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] InputNumbers = br.readLine().split("");
		
		int[] numbers = new int[4];
		boolean isSameNumber = true;
		boolean isPlusOne = true;
		
		for (int i = 0; i < InputNumbers.length; i++) {
			numbers[i] = Integer.parseInt(InputNumbers[i]);
		}
		*/
		
		boolean isSameNumber = true;
		boolean isPlusOne = true;
		
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		scan.close();
		
		int[] numbers = Arrays.stream(password.split(""))
				.mapToInt(e -> Integer.parseInt(e))
				.toArray();
		
		
		
		//4桁とも同じ数字ではないかチェック
		for (int i = 0; i < 3; i++) {
			if (numbers[0] != numbers[i + 1]) {
				isSameNumber = false;
				break;
			}
		}
		
		//連番になっていないかチェック
		//一か所でも連番になっていなければStrong
		for (int i = 0; i < 3; i++) {
			
			/*
				if (numbers[i] == 9 ) {
					if (numbers[i + 1] != 0) {
						isPlusOne = false;
						break;
					}
				}
				else {
					if (numbers[i] != numbers[i + 1] - 1) {
						isPlusOne = false;
						break;
					}
				}
			*/
			
				//10で割った時のあまりで比較すると9の時と他の時の条件をまとめられる
				if ((numbers[i] + 1) % 10 != numbers[i + 1] % 10 ) {
					isPlusOne = false;
					break;
				}
			
		}
		
		//結果を出力
		/*
		if (isSameNumber == false && isPlusOne == false) {
			System.out.println("Strong");
		}
		else {
			System.out.println("Weak");
		}
		*/
		
		//どちらかがtrueで弱い判定であれば弱いパスワード
		if (isSameNumber || isPlusOne) {
			System.out.println("Weak");
		}
		else {
			System.out.println("Strong");
		}
	}
}
