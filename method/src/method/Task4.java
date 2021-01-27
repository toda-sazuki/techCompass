package method;

public class Task4 {
	public static boolean nullCheck(String[] array) {
		for(int i = 0; i < array.length; i++) {
		if(array[i]==null) {
			return true;
		}
			}
		return false;

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] array = {"a","b","c"};
		System.out.println("---配列にnullがない場合---");
		System.out.println(nullCheck(array));

		String[] array2 = {"a",null,"c"};
		System.out.println("---配列にnullがある場合---");
		System.out.println(nullCheck(array2));





	}

}
