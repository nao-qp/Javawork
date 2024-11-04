package work01;

import java.util.Scanner;

public class FirstPlayer2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		//Playerのrecordを定義
		record Player(String name, Integer age) {}
		
		//Player型のリストを作成
		Player[] players = new Player[num];
		
		//最年少のインデックス
		int min = 0;
		
		for (int i = 0; i < num; i++) {
			//名前、年齢を読込
			String name = scan.next();
			int age = scan.nextInt();
			
			//Playerのrecordを作成してplayersリストに格納
			players[i] = new Player(name, age);
			
			//最年少のインデックスを設定
			if (players[i].age < players[min].age) {
				min = i;
			}
		}
		
		scan.close();
		
		for (int i = 0; i < num; i++) {
			System.out.println(players[(min + i) % num].name);
		}

	}

}
