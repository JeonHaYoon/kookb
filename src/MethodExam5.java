/**
 * util의 메서드를 실행시키는 것
 */

import util.Util;

public class MethodExam5 {

	public static void main(String[] args) {
		
		Util util=new Util();
		
//		util.getGugudan();   //구구단 출력
		
		// @@변수선언 후 메서드 출력  
//		정렬
		int[] arr = { 6, 2, 11, 1, 5, 13, 8 };
		util.sort(arr);
		
		System.out.println();
		
//		성적
//		배열이 아닌 int데이터는 선언없이 괄호안에 값을 그냥 넣어도 가능
		int myJumsu=100;
		util.mySungjuk(70);
		
	}

}
