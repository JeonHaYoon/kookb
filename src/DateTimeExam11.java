import java.time.LocalDateTime;

public class DateTimeExam11 {

	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.now();
		System.out.println(startDateTime);
		//결과 : 2019-11-12T12:32:22.000003332
		LocalDateTime endDateTime = LocalDateTime.of(2022, 9, 8, 11,50,10);
		System.out.println(endDateTime);
		//결과 : 2019-11-12T12:32:22.000003333
		
		System.out.println(startDateTime.isBefore(endDateTime));
		//startDateTime이 endDateTime보다 이전날짜 인지 비교
		//결과 : true
		
		System.out.println(startDateTime.isEqual(endDateTime));
		//동일 날짜인지 비교
		//결과 : false
		
		System.out.println(startDateTime.isAfter(endDateTime));
		//startDateTime이 endDateTime 보다 이후 날짜인지 비교
		//결과 : false
		
	}

}
