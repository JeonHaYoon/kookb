
public class StringBufferExam1 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();

		sb.append("A")
		.append("B")
		.append("C");
		String s = sb.toString();
		System.out.println(s);
	}

}
