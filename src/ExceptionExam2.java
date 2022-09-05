
public class ExceptionExam2 {

	public static void main(String[] args) {

		ExceptionExam2 ee2 = new ExceptionExam2();
		// 던진 예외를 받아서 처리 , Exception로 처리하는 게 편함.
		try {
			ee2.aaa(0);
		} catch (Exception e) {
		}

		System.out.println("예외처리가 되었나요?");

	}

	// throws 로 예외를 던져버림
	private void aaa(int i) throws ArithmeticException {

//		try {
		System.out.println(10 / i); // 예외 발생
//		
//		} catch (ArithmeticException e) {
//			e.getLocalizedMessage();
//		}

//		}   // 직접 예외 처리
	}

}
