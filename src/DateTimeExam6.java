import java.time.LocalDate;

public class DateTimeExam6 {

	public static void main(String[] args) {
		
		LocalDate yesterday = LocalDate.now();
		System.out.println(yesterday.minusDays(1));
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate tomorrow = LocalDate.now();
		System.out.println(tomorrow.plusDays(1));
		
		LocalDate now2 = LocalDate.of(2020,2,28);
		System.out.println(now2.plusDays(2));

	}

}
