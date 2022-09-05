
public class MethodExam2 {

	public static void main(String[] args) {
		int i=0;
		MethodExam2 me= new MethodExam2();
		i= me.plus(i);
		System.out.println("i값:"+i);
		
	}

	private int plus(int i) {
		i++;
		return i;
	}
	
	private static void plus2(int i) {
		i++;
		return;
	}

}
