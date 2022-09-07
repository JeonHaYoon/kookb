import java.util.Date;

/**
 * 오늘 날짜와 시간
 * java.util.Date
 * @author BigData18
 *
 */

public class DateExam1 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);  
		//년도 나타내기 .getYear()+ 1900 을 더해줘야 현재년도
		System.out.println(now.getYear()+1900);
		//월 나타내기 . +1을 해줘야한다.
		System.out.println(now.getMonth()+1);
		System.out.println(now.getDate());
		

	}

}
