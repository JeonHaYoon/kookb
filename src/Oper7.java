import java.util.Scanner;

/**
 * 엘리베이터 이동
 * 
 * @author BigData18
 *
 */
public class Oper7 {

	public static void main(String[] args) {
		int currFloor = 1;
		int currElev = 1;

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("이동하려는 층을 입력하세요.");
			
			int floor = scan.nextInt();

			if (floor > 0 && floor < 5 && floor != currElev) {
				System.out.printf(floor + "층으로 이동합니다.");
				currElev = floor;
			}else {
				System.out.println("이동할 수없습니다.");
			}
		}
	}
}


