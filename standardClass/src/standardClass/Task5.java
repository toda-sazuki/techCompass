package standardClass;

public class Task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String a ="cat_mouse_mouse_cat_cat";
		String[] array1 = a.split("_",5);

		String text1= "cat", text2 ="mouse";
		int count1 = 0 , count2 = 0;

		for (int i = 0; i < array1.length; i++) {
		    if (array1[i].equals(text1)) {
		        ++count1;
		    }
		    }

        for (int i = 0; i < array1.length; i++) {
		    if (array1[i].equals(text2)) {
		    	++count2;
		    	}
		    }


        if (count1>count2) {
        	System.out.print(text1+"の方が多い");
        }else {
        	System.out.print(text2+"の方が多い");
        }

	}
    }







