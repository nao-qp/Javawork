package work01;

import java.util.Scanner;

public class Jpgging {

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
		
		//高橋君距離
		int tMeters = getMeters(a, b, c, x);
		//青木君距離
		int aMeters = getMeters(d, e, f, x);
		
		if (tMeters > aMeters) {
			System.out.println("Takahashi");
		}
		else if (tMeters < aMeters) {
			System.out.println("Aoki");
		}
		else {
			System.out.println("Draw");
		}
		
	}
	
	public static int getMeters(int walkTime, int speed, int restTime, int time) {
		//歩く秒数を計算
		int walkCount = time / (walkTime + restTime) ;
		int TotalTime = walkCount * walkTime;
		//端数
		int walkPlus = time % (walkTime + restTime);
		
		/*
		//一回に歩く距離以上の時間がある場合一回に歩く秒数を設定
		if (walkPlus >= walkTime) {
			walkPlus = walkTime;
		}
		//歩く秒数の合計（歩く秒数 + 端数）
		TotalTime += walkPlus;
		*/
		
		//歩く秒数の合計（歩く秒数 + 端数）
			//端数と一回にあるく距離を比較して小さい方を進んだ時間に足す
		TotalTime += Math.min(walkPlus, walkTime);
		
		
		//確認用
		System.out.println(walkCount);
		System.out.println(TotalTime);
		System.out.println(speed * TotalTime);
		
		return speed * TotalTime;
}

}
