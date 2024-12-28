
import java.util.Arrays;
import java.util.Scanner;

public class VerticalWriting {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int N = scan.nextInt();
            String[] S = new String[N];

            // Sを受け取り、それぞれの長さの最大値Mを求める
            int M = 0;
            for (int i = 0; i < N; i++) {
                S[i] = scan.next();
                int len = S[i].length();
                if (len > M) {
                    M = len;
                }
            }

            // M行N列の配列Tを作り、"*"で埋める
            char[][] T = new char[M][N];
            for (int j = 0; j < M; j++) {
                Arrays.fill(T[j], '*');
            }

            // Sの各文字を対応するTの位置に代入する
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= S[i - 1].length(); j++) {
                    T[j - 1][N - i] = S[i - 1].charAt(j - 1);
                }
            }

            // 各Tの末尾の"*"を除いて出力する
            for (int j = 0; j < M; j++) {
                int len = N;
                for ( ; len > 0; len--) {
                    if (T[j][len - 1] != '*') {
                        break;
                    }
                }
                // T[i]を長さlenの文字列にして出力
                System.out.println(new String(T[j], 0, len));
            }
        }
    }
}