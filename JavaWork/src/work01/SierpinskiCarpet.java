package work01;

import java.util.Scanner;

public class SierpinskiCarpet {
	 private final int level;
	 private final char[][] carpet;

	 // levelのカーペット作成
	 SierpinskiCarpet(int level) {
	        this.level = level;
	        this.carpet = new char[pow3(level)][pow3(level)];
	        set(level, 0, 0);
	    }
	 /*
	     * (x, y) のマスを原点(左上)としてレベル = level のカーペットを作成する
	     * 黒いマスに'#'をセットし、白いマスには何もしない
	     */
	    private void set(int level, int x, int y) {
	    	 System.out.println("→ 呼び出し: set(" + level + ", " + x + ", " + y + ")");
	        if (level == 0) {
	            carpet[x][y] = '#';
	            System.out.println("黒");
	        } else {
	            for (int i = 0; i < 3; i++) {
	                for (int j = 0; j < 3; j++) {
	                    if (i == 1 && j == 1) {
	                        // 中央ブロックはすべて白いマスなので何もしない
	                    	System.out.println("白");
	                    } else {
	                        
	                        // 周りのブロックはすべて level - 1 のカーペット
	                        set(level - 1, x + i * pow3(level - 1), y + j * pow3(level - 1));
	                    }
	                }
	            }
	        }
	        System.out.println("← 戻る: set(" + level + ", " + x + ", " + y + ")");
	    }
	    
	
	// 3のa乗をintで返すメソッド
	static int pow3(int a) {
		return (int)Math.pow(3, a);
	}
	
	// 出力メソッド
	void output () {
		for (int x = 0; x < pow3(level); x++) {
            for (int y = 0; y < pow3(level); y++) {
                System.out.print(carpet[x][y] == 0 ? '.' : carpet[x][y]);
            }
            System.out.println();
        }
	}
	
	
	// mainメソッド
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			
			// カーペットを作成して出力
			SierpinskiCarpet sierpinskiCarpet = new SierpinskiCarpet(N);
			sierpinskiCarpet.output();
			
		}
	}
		
}
