package vrietyArray;

import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		int[] num = new int[] {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
		for(int num2 :num) {
		if (num2 % 2 == 0) {
		            list1.add(num2);
		        } else {
		            list2.add(num2);
		        }
		}
		System.out.print("奇数:" + list2 );
		System.out.println();
		System.out.print("偶数:" + list1 );



		}



	}


