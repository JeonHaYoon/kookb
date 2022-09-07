import java.sql.Date;

/**
 * 년월일만 가져올때는 sql Date를 사용한다.
 * java.sql.Date
 * @author BigData18
 *
 */

public class DateExam4 {

	public static void main(String[] args) {
		Date now = new Date(System.currentTimeMillis());
		System.out.println(now);
		

	}

}
