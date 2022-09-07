import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 시계를 만들어보세요
 * 
 * @author BigData18
 *
 */

public class DateTimeExam9 {
	public static void main(String[] args) {


//		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//		System.out.println();
	
			for (int i = 1; i <= 60;) {
				LocalDateTime now = LocalDateTime.now();
				
				int y=now.getYear();
				int m=now.getMonthValue();
				int d=now.getDayOfMonth();
				int h=now.getHour();
				int mm=now.getMinute();
				int s=now.getSecond();
				LocalDateTime now1 = now.plusSeconds(i);
				System.out.println(y+"년 "+m+"월 "+d+"일 "+h+"시 "+mm+"분 "+s+"초");
//				System.out.println(now.plusSeconds(i));
		
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		

	}

}


//시간 분 초
//int h=1;
//int m=1;
//int s=1;
//
//for (int h = 1; h < 24; h++) {
//	for (int m = 1; m < 60; m++) {
//		for (int s = 1; s < 60; s++) {
//
//			LocalTime time = LocalTime.of(h, m, s);
//			System.out.println(h + "시" + m + "분" + s + "초");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//
//}