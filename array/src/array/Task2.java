package array;

public class Task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int [] array = new int [7];

		for(int i = 0;i <array.length;i++){
		      array[i] = array.length-i;

		if(array[i]!=1) {
			System.out.print(array[i] + ",");
		}else {
			System.out.print(array[i]);
		}
		}

		System.out.println();

		for (int i = 0; i < array.length; i ++ ) {
		array [i]= i + 1;
		if (array[i]!=7) {
		System.out.print(array[i]+ ",");
		}else {
			System.out.print(array[i]);
		}
		}
	}
}




