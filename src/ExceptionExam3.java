
public class ExceptionExam3 {

	public static void main(String[] args) {
		String msg = null;
// null체크일 경우에만 try-catch 문 보다는 아래와 같이 처리한다
		//객체가 null이 아닐 경우에만 실행하라
		if(msg!=null) {
			System.out.println(msg.length());
		}
		
//		try {
//			System.out.println(msg.length());
//		} catch (NullPointerException e) {
//
//		}

		System.out.println("예외처리됨");

	}

}



//
//public class ExceptionExam3 {
//
//	public static void main(String[] args) {
//		String msg = null;
//
//		
//		try {
//			System.out.println(msg.length());
//		} catch (NullPointerException e) {
//
//		}
//
//		System.out.println("예외처리됨");
//
//	}
//
//}
