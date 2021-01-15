package vrietyArray;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> a = new ArrayList<>();
		a.add("北海道");
		a.add("東北");
		a.add("関東");
		a.add("中部");
		a.add("近畿");
		a.add("中国");
		a.add("九州");

		for(String language : a ){
			System.out.println(language);
		}
	}

}
