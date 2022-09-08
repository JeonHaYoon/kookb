import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * 날짜변환
 * @author BigData18
 *
 */
public class DateTimeExam12 {

	public static void main(String[] args) {
		//LocalDate -> String
		String ld1= LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(ld1);
		
		//LocalDateTile -> String
		String ld2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(ld2);
		
		//LocalDAte -> java.sql.Date
		Date d1=Date.valueOf(LocalDate.now());
		System.out.println(d1);
		
		//LocalDateTime -> java.util.Date
		java.util.Date d2=java.util.Date.
		from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(d2);
		
		//LocalDateTime -> java.sql.Timestamp
		Timestamp t1 = Timestamp.valueOf(LocalDateTime.now());
		System.out.println(t1);
		
		String str1="2019-12-24";
		String str2="20191231";
		
		//String ->LocalDate
		LocalDate ld3 =LocalDate.parse(str1);
		LocalDate ld4 =LocalDate.parse(str2, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(ld3);
		System.out.println(ld4.plusDays(1));
		
		int i1 = Integer.parseInt(str2);
		System.out.println(i1+1);
		
		
		//String -> LocalDateTime
		String str3="2019-12-24T12:23:22";
		String str4="2019-12-24 12:23:22";
		LocalDateTime ldt1 = LocalDateTime.parse(str3);
		LocalDateTime ldt2 = LocalDateTime.parse(str4, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(ldt1);
		System.out.println(ldt2);
		
		//java.util.Date -> LocalDateTime
		LocalDateTime ldt3 = LocalDateTime.ofInstant(new java.util.Date().toInstant(), ZoneId.systemDefault());
		System.out.println(ldt3);
		
		//LocalDateTime -> LocalDate
		System.out.println(LocalDate.from(LocalDateTime.now()));
		
		//LocalDate -> LocalDateTime
		System.out.println(LocalDate.now().atTime(13, 30));
		
		

	}
}
