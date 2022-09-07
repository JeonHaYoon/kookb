import java.time.*;

public class DateTimeExam5 {

	public static void main(String[] args) {

		LocalTime start = LocalTime.of(11, 40, 50);
        LocalTime end = LocalTime.of(11, 42, 50);

        Duration duration = Duration.between(start, end);

        System.out.println("Seconds: " + duration.getSeconds());

        LocalDate startDate = LocalDate.of(1950, 9, 1);
        LocalDate endDate = LocalDate.of(2010, 9, 2);
        Period period = Period.between(startDate, endDate);
        System.out.println(period.getDays());
        System.out.println(period.getYears());

	}

}
