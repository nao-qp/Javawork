package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NChoiceQuestion2 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//空行読み飛ばし
		scan.nextLine();
		
		//インデックス番号を使用せずに値のセットを持たせる方法
		record Choice(int num, int answer) {}
		List<Choice> choices = new ArrayList<>();
		
		//回答リスト読込、Choice型のリストに追加
		for (int i = 1; i <= n; i++) {
			choices.add(new Choice(i, scan.nextInt()));
		}
		
		scan.close();
		
		System.out.println(
			choices.stream()
				.filter(c -> c.answer == a + b)		//cはstreamで取り出したchoicesリストの中身1つ1つ
				.findFirst()	//Optional<Choice>型で返る
				.orElseThrow()	//値があればOptional型の中の値を取り出し、なければ例外を返す
				.num		//返ってきたChoiceのnum
				);
		
	}

}
