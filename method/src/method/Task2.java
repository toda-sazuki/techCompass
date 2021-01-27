package method;

public class Task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double area = getTriangleArea(13.0,18.0);
		System.out.println("三角形の面積");
		System.out.println(area +"cm");

	}
	public static double getTriangleArea (double num1, double num2) {
		double area=num1*num2/2;
		return area;

	}
}
