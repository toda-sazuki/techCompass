package method;

public class Task3 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("---①文字列だけの場合---");
		System.out.println(add("文字列1","文字列2"));
		System.out.println("---②整数だけの場合---");
		System.out.println(add(3,5));
		System.out.println("---③少数だけの場合---");
		System.out.println(add(3.5,5.5));
	}
	public static String add(String x, String y){
	 return x + y;
	}
	public static int add(int x, int y) {
	 return x + y;
	}
	public static double add(double x, double y) {
	 return x + y;
	}
}
