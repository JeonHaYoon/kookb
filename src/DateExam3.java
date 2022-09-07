import java.util.Date;

/**
 * 오늘 날짜와 시간
 * java.util.Date
 * @author BigData18
 *
 */

public class DateExam3 {

	public static void main(String[] args) {
		//timpstamp가 나오는 값을 date함수안에 넣어주면 날짜가 나온다
//		System.out.println(System.currentTimeMillis());
		Date now = new Date(System.currentTimeMillis());
		System.out.println(now.getYear()+1900);
		System.out.println(now.getMonth()+1);
		System.out.println(now.getDate());
		

	}

}
