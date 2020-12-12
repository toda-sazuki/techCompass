package branch;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		sc.close();

		System.out.println("numA:" + A);
		System.out.println("numB:" + B);

		if(A<=0 | B<=0) {
			System.out.println ("正の整数を入力して下さい。");
		}else if(A % B == 0) {
			System.out.println("numBはnumAの約数です。");
		}else{System.out.println("numBはnumAの約数ではありません。");

		}


	}

}
