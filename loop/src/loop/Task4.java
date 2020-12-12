/*package loop;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();

		System.out.println("正の整数を入力して下さい:" + num );

		 int a = 0;
	        for(int i = 1; i <= num / 2; i++) {
	            if(num % i == 0) {
	                a += i;
	            }
	        }
	        if(a == num) {
	            return true;
	        } else if {
	            return false;

	}

}*/
package loop;
import java.util.Scanner;
public class Task4 {


 public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
			Scanner sc = new Scanner(System.in);

 int sum = 0;
 int a = sc.nextInt();

 sc.close();

 System.out.println("正の整数を入力してください" + a);
 System.out.print(a + "の約数:");

 for(int i=1; i<=a; i++){
 if(a % i == 0){
 sum++;
 System.out.print(i+",");
 }
 }
 }
 }




