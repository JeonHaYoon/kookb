import java.util.Calendar;

public class CalendarExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar now=Calendar.getInstance();
		System.out.println(now);
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
	}

}
