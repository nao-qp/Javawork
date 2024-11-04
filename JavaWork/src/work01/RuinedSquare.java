package work01;

public class RuinedSquare {

	public static void main(String[] args) {
		
		//やり方間違ってた
		
//		try (Scanner scan = new Scanner(System.in)) {
//			
//			record Point(int x, int y) {}
//			
//			Point x1y1 = new Point(scan.nextInt(), scan.nextInt());
//			Point x2y2 = new Point(scan.nextInt(), scan.nextInt());
//			
//			//x2-x1
//			int xDifference = x2y2.x -x1y1.x;
//			
//			//y2-y1
//			int yDifference =  x2y2.y - x1y1.y;
//			
//			System.out.println("xDifference: " + xDifference);
//			System.out.println("yDifference: " + yDifference);
//			
//			
//			//計算パターン順番
//			record  CalPattern(String xCal, String yCal) {}
//			List<CalPattern> calList = new ArrayList<>();
//			calList.add(new CalPattern("+", "+"));
//			calList.add(new CalPattern("-", "+"));
//			calList.add(new CalPattern("-", "-"));
//			calList.add(new CalPattern("+", "-"));
//			
//			String xStartCal = "";
//			String yStartCal = "";
//			
//			if (x2y2.x -x1y1.x >= 0) {
//				xStartCal = "+";
//			} else {
//				xStartCal = "-";
//			}
//			if (x2y2.y - x1y1.y >= 0) {
//				yStartCal = "+";
//			} else {
//				yStartCal = "-";
//			}
//			
//			
//			System.out.println("xStartCal: " + xStartCal);
//			System.out.println("yStartCal: " + yStartCal);
//			
//			
//			
//			
//			
//			CalPattern startCalPattern = new CalPattern(xStartCal, yStartCal);
//			
//			int calIndex = IntStream.range(0, calList.size())
//		            .filter(i -> calList.get(i).equals(startCalPattern))
//		            .findFirst()
//		            .orElse(-1);
//			
//			System.out.println("最初のcalIndex: " + calIndex);
//			
//			
//			
//			
//			//計算パターンインデックス調整
//			if (calIndex == 3) {
//				calIndex = 0;
//			} else {
//				calIndex += 1;
//			}
//			
//			System.out.println("x3y3算出のcalIndex: " + calIndex);
//			System.out.println("x2y2.x:" + x2y2.x);
//			System.out.println("x2y2.y:" + x2y2.y);
//			
//			
//			//x3x4を算出
//			int x3 = 0;
//			int y3 = 0;
//			if (calIndex == 1 || calIndex == 3) {
//				if (calList.get(calIndex).xCal.equals("+")) {
//					x3 = x2y2.x + yDifference;
//				} else {
//					x3 = x2y2.x - yDifference;
//				}
//				
//				if (calList.get(calIndex).yCal.equals("+")) {
//					y3 = x2y2.y + xDifference;
//				} else {
//					y3 = x2y2.y - xDifference;
//				}
//			
//			} else {
//				if (calList.get(calIndex).xCal.equals("+")) {
//					x3 = x2y2.x + xDifference;
//				} else {
//					x3 = x2y2.x - xDifference;
//				}
//				
//				if (calList.get(calIndex).yCal.equals("+")) {
//					y3 = x2y2.y + yDifference;
//				} else {
//					y3 = x2y2.y - yDifference;
//				}
//			}
//			
//			System.out.println("x3: " + x3);
//			System.out.println("y3: " + y3);
//			
//			
//			//計算パターンインデックス調整
//			if (calIndex == 3) {
//				calIndex = 0;
//			} else {
//				calIndex += 1;
//			}
//			
//			System.out.println("x4y4算出のcalIndex: " + calIndex);
//			System.out.println("x3:" + x3);
//			System.out.println("x3:" + x3);
//			
//			
//			
//			
//			//x4y4を算出
//			int x4 = 0;
//			int y4 = 0;
//			if (calIndex == 1 || calIndex == 3) {
//				if (calList.get(calIndex).xCal.equals("+")) {
//					x4 = x3 + yDifference;
//				} else {
//					x4 = x3 - yDifference;
//				}
//				
//				if (calList.get(calIndex).yCal.equals("+")) {
//					y4 = y3 + xDifference;
//				} else {
//					y4 = y3 - xDifference;
//				}
//			} else {
//				if (calList.get(calIndex).xCal.equals("+")) {
//					x4 = x3 + xDifference;
//				} else {
//					x4 = x3 - xDifference;
//				}
//				
//				if (calList.get(calIndex).yCal.equals("+")) {
//					y4 = y3 + yDifference;
//				} else {
//					y4 = y3 - yDifference;
//				}
//			}
//			
//			System.out.println("x4: " + x4);
//			System.out.println("y4: " + y4);
//			
//			
//			
//			
//			System.out.print(x3 + " " + y3 + " " + x4 +  " " + y4);
//
//			
//			
//		}

	}

}
