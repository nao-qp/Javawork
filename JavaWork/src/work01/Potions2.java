package work01;

import java.util.Scanner;

public class Potions2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 入力の読み込み
        int N = scanner.nextInt();
        int H = scanner.nextInt();
        int X = scanner.nextInt();
        int[] P = new int[N];
        
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        // 二分探索の初期設定
        int left = 0;
        int right = N - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            System.out.println("mid = " + mid);
            System.out.println("left = " + left);
            System.out.println("right = " + right);
            
            
            // 現在の傷薬の効き目で体力が目標を達成するか確認
            if (H + P[mid] >= X) {
                // 達成できる場合、答えを更新し、さらに効き目の弱いものがないか調べる
                answer = mid + 1; // 問題の要求は1から始まる番号なので+1
                right = mid - 1;
            } else {
                // 達成できない場合、右半分を探索
                left = mid + 1;
            }
        }

        // 結果の出力
        System.out.println(answer);
    }


}
