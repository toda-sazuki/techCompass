package array;

public class Task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("配列:[");

		int[] array = {4,9,19,5,8,21,42,64,73,18,2};
		for (int a : array) {
			if (a != 2) {
				System.out.print(a + ",");
			}else {
				System.out.print(a);
			}
			}

		System.out.print("]");
		System.out.println();

		int sum = 0;
		for (int b : array ) {
			sum += b;
			}
			System.out.println("合計:" + sum + "");
		}

	}


