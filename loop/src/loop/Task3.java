/*package loop;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		sc.close();

		System.out.println("数字を入力してください:" + num);

		int i = num;
		 while(i > 0){ i ++ 10 ;i--;};
	          System.out.println("その数は"+i+"桁です");*/

package loop;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        sc.close();
        System.out.println("数字を入力して下さい:" + i );

        int a = 0;
        while(i > 0){
            a ++;
            i = i/ 10;
        }
        System.out.println("桁数:"+a);

    }
}
