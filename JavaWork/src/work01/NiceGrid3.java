package work01;

import java.util.Scanner;

public class NiceGrid3 {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		
		//チェビシェフ距離（中心からの距離。奇数なら黒四角、偶数なら白四角）
		if (Math.max(Math.abs(r - 8), Math.abs(c - 8)) % 2 == 1) {
			System.out.println("black");
		} else {
			System.out.println("white");
		}

	}

}
