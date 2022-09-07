import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExam1 {

	public static void main(String[] args) {
		LocalDate now=LocalDate.now();
		System.out.println(now);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime date=LocalDateTime.now();
		System.out.println(date);
		
	}

}
