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
