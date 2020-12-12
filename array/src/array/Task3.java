package array;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {


	System.out.print("[");


	int[] array = {1,2,3,4,5,6,7,8,9};
	Random r = new Random();
	for(int i=0 ; i<6 ; i++) {
	      int a = a[r.nextInt(3)];
	      System.out.println(a);

	for (int i : array) {
		if (i != 4) {
			System.out.print(i + ",");
		}else {
			System.out.print(i);
		}
		}

	System.out.print("]");



}
}
