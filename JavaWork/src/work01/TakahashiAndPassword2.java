package work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakahashiAndPassword2 {

	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in)) {
			String s = scn.nextLine();
			int k = scn.nextInt();
			
			List<String> strings = new ArrayList<>();
			for (int i = 0; i <= s.length() - k; i++) {
				strings.add(s.substring(i, i + k));
			}
			System.out.print(strings);
			
			for (int i = 0; i < strings.size(); i++) {
				String target = strings.get(i);
				for (int j = strings.size() - 1; j > i; j--) {
					if (target.equals(strings.get(j))) {
						strings.remove(j);
					}
				}
			}
			System.out.println(strings.size());
		}

	}

}
