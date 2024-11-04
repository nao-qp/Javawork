package work01;

public class Test {

	public static void main(String[] args) {
	

		    String str = "One／Two／Three";
		    String[] count1 = str.split("／");
		    String[] count2 = str.split("／", 2);
		    for (int i = 0; i < count1.length; i++) {
		      System.out.println( i + ":" + count1[i]);
		    }
		    System.out.println("-----");
		    for (int i = 0; i < count2.length; i++) {
		      System.out.println(i + ":" + count2[i]);
		    }
		  
	}

}
