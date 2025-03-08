package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bib {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			
			// 見つめられている人Piのリスト
			List<Integer> pPersons = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				pPersons.add(scan.nextInt());
			}
			
			// 人iがつけているゼッケンQiのリスト
			List<Integer> qBibList = new ArrayList<>();
			// 参照先Indexのリスト
			List<Integer> qBibReferenceList = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				qBibList.add(scan.nextInt());
				qBibReferenceList.add(pPersons.get(i) - 1);		// 1番目の人のindexは0
			}
			// ゼッケンを1からループして出力する
			for (int i = 1; i <= N; i++) {
				// ゼッケンiのゼッケンリストのIndex
				int bidIndex = qBibList.indexOf(i);
				// 参照先Index（ゼッケンリストのIndexは参照先IndexリストのIndexと同じ）
				int referenceIndex = qBibReferenceList.get(bidIndex);
				System.out.print(qBibList.get(referenceIndex) + " ");
			}
		}
	}
}
