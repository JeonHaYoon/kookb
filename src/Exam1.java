/**
 * 두 변수를 선언 및 초기화 하고 결과값을 다르게 나오게 하세요.
 * 입력값 1,2 => 출력값 2,1
 * @author BigData00
 * 
 * */

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		int j=2;
		
//		시작
		int tmp=0;
		
		tmp=i;
		i=j;
		j=tmp;
		
		
//		끝
//		%d는 정수를 나타내며, 첫번째 %d는 i, 두번째 %d는 j가 나온다
		System.out.printf("%d, %d", i,j);
		
	}

}
