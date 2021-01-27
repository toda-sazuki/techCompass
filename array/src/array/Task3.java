package array;

public class Task3 {
  public static void main(String[] args) {

	  System.out.print("[");
	int[] array = new int[6];
	for(int i=0 ; i<6 ; i++) {
		int r = new java.util.Random().nextInt(9);
		System.out.print(r);
		array[i] = r;
	}
	  System.out.println("]");

	int max = array[0];
	for(int j = 0; j < array.length; j++) {
		if (max <= array[j]) {
			max = array[j];
		}
	}

	 System.out.println("最大値:"+max);

	int min = array[0];
	for(int k = 0; k < array.length; k ++) {
		if (min >= array[k]) {
			min = array[k];
		}
		//min = Math.min(min, array[k]);
	}
     System.out.println("最小値:"+min);

  }
}




