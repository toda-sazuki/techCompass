package standardClass;

public class Task1 {
	public static void main(String[] args) {

      String text1 =" tech compas ";
    		  System.out.println("変換前:" + text1);

      String text2 = text1.trim();
      String text3 = text2.toUpperCase();
      System.out.println("変換後:" + text3.replace(" ", "-"));


	}
}
