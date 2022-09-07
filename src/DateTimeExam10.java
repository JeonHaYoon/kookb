import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 421초를 입력하면 1시 1분 1초가 출력되게 하세요
 * 
 * @author BigData18
 *
 */
public class DateTimeExam10 {

	public static void main(String[] args) {

		int h = 0;
		int m = 0;
		int s = 0;
		// 시작
		// 초/60=> 분

//		System.out.println(h + "시 " + m + "분 " + s + "초");
		// 끝
		int sec = 11080;
		while (true) {
			h = sec / (60 * 60);
			m = (sec / 60) % 60;
			s = sec % 60;
			
			System.out.println(h + "시" + (m<10? "0" : "" ) +m + "분" + String.format("%02d", s) + "초");
			sec++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
