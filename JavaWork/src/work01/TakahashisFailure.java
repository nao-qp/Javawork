package work01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TakahashisFailure {

	public static void main(String[] args) {
		//入力値を取得
		Scanner scn = new Scanner(System.in);
		//N（家にある食品の数）を設定
		int N = scn.nextInt();
		//K（高橋君の嫌いな食品の数）を設定
		int K = scn.nextInt();
		//Ai（N個の食品それぞれのおいしさ）を設定
		List<Integer> A = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			A.add(scn.nextInt());
		}
		//Bi（家にある食品のうち高橋君がきらいな食品が何番目か）を設定
		List<Integer> B = new ArrayList<>();
		for(int i = 0; i < K; i++) {
			B.add(scn.nextInt());
		}
		scn.close();
		
		
		//おいしさが一番（Aiが最大）の食べ物の順番i求める
		//おいしさ最大値
		/*
		int maxA = 0;
		for(int a: A) {
			if (a > maxA) {
				maxA = a;
			}
		}
		*/
		int maxA = Collections.max(A);
		
		//おいしさ最大値リスト（おいしさ最大値の食品が何番目にあるかIndexのリスト）
		List<Integer> maxAIndex = new ArrayList<>();
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) == maxA) {
				maxAIndex.add(i + 1);	//高橋君がきらいな食べ物の順番と比較するためIndexに+1
			}
		}
		

		//高橋君がきらいな食べ物の順番Kiがおいしさ最大値リストに含まれるか
		/*
		boolean existDislike = false;
		for (int b: B) {
			if (maxAIndex.contains(b)) {
				existDislike = true;
				break;
			}
		}
		
		//結果出力
		if (existDislike) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		*/
		
		for (int b: B) {
			if (maxAIndex.contains(b)) {
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
		
	}

}
