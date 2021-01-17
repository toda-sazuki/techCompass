package standardClass;
import java.util.Calendar;

public class Task7 {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Calendar today = Calendar.getInstance();
			System.out.println(today.getTime());

			System.out.println(
					today.get(Calendar.YEAR)+"年"+
					today.get(Calendar.MONTH)+1+"月"+
					today.get(Calendar.DAY_OF_MONTH)+"日");

			today.add(Calendar.DAY_OF_MONTH,7);
			System.out.println(
					today.get(Calendar.YEAR)+"年"+
					today.get(Calendar.MONTH)+1+"月"+
					today.get(Calendar.DAY_OF_MONTH)+"日");

			today.set(Calendar.YEAR, 2022);
			System.out.print(
					today.get(Calendar.YEAR)+"年"+
					today.get(Calendar.MONTH)+1+"月"+
					today.get(Calendar.DAY_OF_MONTH)+"日");
			System.out.print(Week(1));

	}

			public static String Week(int day) {
			    Calendar today1  = Calendar.getInstance();
                  today1.set(Calendar.DAY_OF_WEEK,1);
			    switch (today1.get(Calendar.DAY_OF_WEEK)) {
			        case Calendar.SUNDAY: return "(日)";
			        case Calendar.MONDAY: return "(月)";
			        case Calendar.TUESDAY: return "(火)";
			        case Calendar.WEDNESDAY: return "(水)";
			        case Calendar.THURSDAY: return "(木)";
			        case Calendar.FRIDAY: return "(金)";
			        case Calendar.SATURDAY: return "(土)";
			    }
			    throw new IllegalStateException();






	}

}
