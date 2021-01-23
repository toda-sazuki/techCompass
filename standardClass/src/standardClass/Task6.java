package standardClass;
import java.util.Calendar;
public class Task6 {

	public static void main(String[] args) {
	Calendar today = Calendar.getInstance();
	System.out.println(
	today.get(Calendar.YEAR)+"年"+
	today.get(Calendar.MONTH)+1+"月"+
	today.get(Calendar.DAY_OF_MONTH)+"日");

	System.out.println(
			today.get(Calendar.YEAR)+"年"+
			today.get(Calendar.MONTH)+1+"月"+
			today.get(Calendar.DAY_OF_MONTH)+"日"+
			today.get(Calendar.HOUR_OF_DAY)+"時"+
			today.get(Calendar.MINUTE)+"分");


	}
}
