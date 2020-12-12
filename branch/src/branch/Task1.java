package branch;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();

		System.out.println("10以上の数字を入力してください");
		System.out.println(num);
		if(num>10)System.out.println("値：" + num);
		if(num<10)System.out.println("値：" + 10 * num);




	}

}
