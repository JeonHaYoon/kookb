/**
 * 윤년계산 연수가 4년마다 윤년이다. 100년마다 윤년이 아니다. 그렇지만 400년마다 윤년이다
 * 
 * @author BigData18
 *
 */
public class Oper5 {

	public static void main(String[] args) {

		int yearChk = 2020;
//		1700 평년, 1600 윤년

		// 4년마다 윤년 yearChk%4==0
//		100년마다는 윤년이 아니다 yearChk%100!=0
//		400년 마다는 윤년이다 yearChk%400=00

		if (yearChk % 4 == 0 && (yearChk % 100 != 0 || yearChk % 400 == 0)) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}

	}

}
