package variable;

public class Task3 {

	public static void main(String[] args) {

		System.out.println("変換前");
		int intNum = 219;
		double doubleNum = 364.2;
		long longNum = 123456L;

		System.out.println(intNum);
		System.out.println(doubleNum);
		System.out.println(longNum);

		System.out.println("変換後");
		long a = intNum;
		float b = (float) doubleNum;
		double c = longNum;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


	}
}