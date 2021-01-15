package vrietyArray;
import java.util.ArrayList;
import java.util.HashMap;
public class Task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		int[] num = new int[] {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
		for(int num2 :num) {
			if (num2 % 2 == 0) {
			            list1.add(num2);
			        } else {
			            list2.add(num2);
			        }
			}
		HashMap<String,ArrayList<Integer>>label = new HashMap<>();
		label.put("偶数",list1);
		label.put("奇数",list2);

		System.out.print("偶数:="+label.get("偶数"));
		System.out.println();
		System.out.print("奇数:="+label.get("奇数"));






	}

}
