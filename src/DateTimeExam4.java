import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExam4 {

	public static void main(String[] args) {
		String now=LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(now);
		
		System.out.println();
		
		String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		System.out.println(time);
		System.out.println();
		
		String date=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(date);
		
		
		
	}

}
