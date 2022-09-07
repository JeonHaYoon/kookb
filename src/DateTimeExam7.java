/**
 * 현재 연도를 자동으로 설정, get.Year()
 */
import java.time.LocalDate;

public class DateTimeExam7 {

	public static void main(String[] args) {
		
		LocalDate year= LocalDate.now();
//		System.out.println(year.getYear());
		
		for(int i=year.getYear() ; i>=2020; i--) {
			System.out.println(i+"년도");
		}

	}

}
