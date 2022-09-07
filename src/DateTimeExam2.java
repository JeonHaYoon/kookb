import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExam2 {

	public static void main(String[] args) {
		LocalDate now=LocalDate.now();
//		System.out.println(now);
		System.out.println(now.getYear());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
		
		LocalTime time = LocalTime.now();
//		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		LocalDateTime date=LocalDateTime.now();
//		System.out.println(date);
		System.out.println(date.getYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getHour());
		System.out.println(date.getMinute());
		System.out.println(date.getSecond());
		
		
	}

}
