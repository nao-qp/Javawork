package work01;

import java.util.Scanner;

public class Jpgging2 {
	
	public static class Jogger {
		
		private int jogSec;
		private int speed;
		private int stopSec;
		private int x;
		
		//コンストラクタ
		public Jogger(int jogSec, int speed, int stopSec, int x) {
			this.jogSec = jogSec;
			this.speed = speed;
			this.stopSec = stopSec;
			this.x = x;
		}
		
		//何サイクルあるか（歩いて休むセット）
		private int cycle() {
			return x / (jogSec + stopSec);
		}
		
		//距離
		public int getDistance() {
			//歩く時間
			int totalJogSec = this.jogSec * this.cycle();
			//端数の歩く時間
			int jobPlus = x % (this.jogSec + this.stopSec);
			//端数の歩く時間と1サイクルの歩く時間を比較して少ない方を足す
			totalJogSec += Math.min(this.jogSec, jobPlus);
			
			return this.speed * totalJogSec;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		//高橋君
		int a = scn.nextInt();	//歩く秒数
		int b = scn.nextInt();	//秒速
		int c = scn.nextInt();	//休む秒数
		
		//青木君
		int d = scn.nextInt();	//歩く秒数
		int e = scn.nextInt();	//秒速
		int f = scn.nextInt();	//休む秒数
		
		//何秒後
		int x = scn.nextInt();
		
		scn.close();
		
		//高橋君インスタンス作成
		Jogger takahashi = new Jogger(a, b, c, x);
		//青木君インスタンス作成
		Jogger aoki = new Jogger(d, e, f, x);
		
		int tDistance = takahashi.getDistance();
		int aDistance = aoki.getDistance();
		
		if (tDistance > aDistance) {
			System.out.println("Takahashi");
		}
		else if (tDistance < aDistance) {
			System.out.println("Aoki");
		}
		else {
			System.out.println("Draw");
		}
	}

}

