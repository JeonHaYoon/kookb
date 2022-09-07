import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExam3 {

	public static void main(String[] args) {
		LocalDate now=LocalDate.of(2022, 8,16);
//		System.out.println(now);
		System.out.println(now.getYear());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
		
		System.out.println();
		
		LocalTime time = LocalTime.of(9, 10, 16);
//		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		System.out.println();
		
		LocalDateTime date=LocalDateTime.of(2022, 8,16,9, 10, 16 );
//		System.out.println(date);
		System.out.println(date.getYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getHour());
		System.out.println(date.getMinute());
		System.out.println(date.getSecond());
		
		
	}

}
