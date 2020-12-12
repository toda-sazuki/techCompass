package calc;

public class Task1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int c = 6;
		int d = 5;
		int e = 25;

		System.out.println("修正前:" + (a+b*c+d));
		System.out.println("修正後:" + ((a+b)*c+d));
		System.out.println("25/3の商" + (e/a) + ":余り" + (e%a));

	}
}
