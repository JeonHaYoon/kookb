/***
 * 성적처리프로그램 switch문 사용 힌트: 사칙연산 참고 *
 */

public class Oper10 {
	public static void main(String[] args) {
		int myJumsu = 10;
		switch (myJumsu / 10) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("B");
			break;
		case 8:
			System.out.println("C");
			break;
		case 7:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}

	}

}
