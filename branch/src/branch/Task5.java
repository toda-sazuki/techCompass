package branch;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int numA = sc.nextInt();
		int numB = sc.nextInt();
		int numC = sc.nextInt();

		sc.close();

		System.out.println(numA);
		System.out.println(numB);
		System.out.println(numC);

		if(numA>numB&&numA>numC)System.out.println("最大値："+numA);
		if(numB>numA&&numB>numC)System.out.println("最大値："+numB);
		if(numC>numA&&numC>numB)System.out.println("最大値："+numC);




	}

}
