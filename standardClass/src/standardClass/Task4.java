package standardClass;
import java.util.Scanner;


public class Task4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	sc.close();

	System.out.println("探したい文字:"+a);

	String text1 = "ABCDGOPQRSYZ";
	if(text1.indexOf(a)>=0) {
		System.out.println(text1+"は"+a+"を含む");
	}else{
		System.out.println(text1+"は"+a+"を含まない");
	}

}
}
