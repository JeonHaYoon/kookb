public class MethodExam4 {
	public MethodExam4() {
		System.out.println("#생성자: 홍길동");
	}

	public static void main(String[] args) {
		// 타입 변수명 =new 타입 ();
		MethodExam4 me = new MethodExam4();
		me.printName();
		me.printName("홍길동");
		/**
		 * 두 수를 전달하여 두 수의 합을 출력하는 함수 정의 #calc(int num1, int num2): 70
		 */
		int res = me.calc(30, 40);
		System.out.println("#calc(int num1, int num2):" + res);
	}

	private int calc(int num1, int num2) {
		return num1 + num2;
	}

	private void printName(String name) {
		System.out.println("#printName(String name):" + name);
	}

	private void printName() {
		System.out.println("#printName():홍길동");
	}
}
