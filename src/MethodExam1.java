
public class MethodExam1 {

	public static void main(String[] args) {
		int i=0;
		
		i= plus (i);
		System.out.println("i값:"+i);
		
	}

	private static int plus(int i) {
		i++;
		return i;
	}
	
	private static void plus2(int i) {
		i++;
		return;
	}

}
