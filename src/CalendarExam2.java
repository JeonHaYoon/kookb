import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat format= new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		//Calendar now=Calendar.getInstance();
		Date now = new Date();
		String date= format.format(now);
		System.out.println(date);
		
	}

}
