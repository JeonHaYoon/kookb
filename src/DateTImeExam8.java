/**
 * 타이머를 만드세요
 * 
 * @author BigData18
 *
 */
public class DateTImeExam8 {

	public static void main(String[] args) {
		for( int i = 10; i>=0; i--) {
			System.out.println(i+"초");
			try {
				Thread.sleep(1000);   //출력 시간을 1초씩
			} catch (InterruptedException e) {
			
			}
		}
		
	}

}
