package work01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 問題
 * https://atcoder.jp/contests/abc208/tasks/abc208_c
 */
public class FairCandyDistribution {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			long K = scan.nextLong();
			
			ACandy[] aCandyList = new ACandy[N];
			for (int i = 0; i < N; i++) {
				int a = scan.nextInt();		// 国民番号
				// 国民キャンディインスタンス作成
				ACandy aCandy = new ACandy(a, i, 0);	// 国民番号、キャンディの数
				aCandyList[i] = aCandy;
			}
			
			// 公平に配られるキャンディの数
			long fairCandyCount = K / N;
			// 余り
			long restCandyCount = K % N;
			// 国民番号で並んだ配列を作成
			ACandy[] aOrderNumList = Arrays.copyOf(aCandyList, aCandyList.length);
			Arrays.sort(aOrderNumList, Comparator.comparingInt(ACandy::getaNum));
			
			// 配る(配列は国民番号順)
			for (int i = 0; i < N; i++) {
				aCandyList[aOrderNumList[i].getaIndex()].setCandy(fairCandyCount);
				if (i < restCandyCount) {
					// 余りをもらう国民は+1配る
					aCandyList[aOrderNumList[i].getaIndex()].setCandy(fairCandyCount + 1);
				}
			}
			
			for (int i = 0; i < N; i++ ) {
				System.out.println(aCandyList[i].getCandy());
			}
		}
	}
}

// 国民とキャンディのオブジェクト
class ACandy {
	private int aNum;
	private int aIndex;
	private long candy;
	
	ACandy(int aNum, int aIndex, long candy) {
		this.aNum = aNum;
		this.aIndex = aIndex;
		this.candy = candy;
	}
	
	public int getaNum() {
		return aNum;
	}
	public void setaNum(int aNum) {
		this.aNum = aNum;
	}
	public int getaIndex() {
		return aIndex;
	}
	public void setaIndex(int aIndex) {
		this.aIndex = aIndex;
	}
	public long getCandy() {
		return candy;
	}
	public void setCandy(long candy) {
		this.candy = candy;
	}
	
}