import java.util.Date;

/**
 * java.util.Date
 * @author BigData18
 *
 */

public class DateExam2 {

	public static void main(String[] args) {
		//연도 -1900 달 -1 을 해줘야 오늘날짜가 나온다
		//데이터를 입력할때는 계산된 값이 아닌 값의 계산을 나타내야 한다 아래 초를 나타내듯이
		Date now = new Date(2022-1900,9-1,7);
		System.out.println(now.getYear()+1900);
		System.out.println(now.getMonth()+1);
		System.out.println(now.getDate());
		System.out.println("하루는 몇초일까요 ? 86400 "+ (60*60*24) );
		
		

	}

}
